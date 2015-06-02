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

class Parcel<T extends Gift> { // Here we bound the types that can be used as Parcel objects to be an object of Gift or any class that extends Gift
    private T t;
    public void set(T t) {
        this.t = t;
    }
    
    public void shipParcel() {
        if(t.getWeight() > 10) {
            System.out.println("Ship by ABC");
        }
        else {
            System.out.println("Ship by XYZ");
        }
    }
}

public class TestParcelBounded {
    public static void main(String[] args) {
        Parcel<Phone> parcel = new Parcel<>();
        parcel.shipParcel();
    
    }
}