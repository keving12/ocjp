abstract class Gift {
    abstract double getWeight();
}

class Book extends Gift {
    double getWeight() {
        return 3.2;
    }
}

class Phone extends Gift {
    double getWeight() {
        return 1.1;
    }
}

class Parcel<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    
    public void shipParcel() {
        if(t.getWeight() > 10) {        //This line causes compilation failure
            System.out.println("Ship by ABC");
        }
        else {
            System.out.println("Ship by XYZ");
        }
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel<Phone> parcel = new Parcel<>();
        parcel.shipParcel();
    
    }

}

/**
 * The reason why this class fails to compile because the type parameter is the generic class Parcel is not bounded. In this
 * instance the type parameter T is a subclass of Object. So when trying to call a method on a type parameter T that is unbounded
 * it must exist in the Object class or it will fail to locate it and subsequently fail to compile.
 * 
 * If we replace t.getWeight with a method we know is in the Object class such as hashcode, the above code compiles successfully
 */
        