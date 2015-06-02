class Car {
    private int topSpeed;
    
    public int getTopSpeed() {
        return topSpeed;
    }
}

interface Driveable {
    public void drive();
}

class FamilySaloon extends Car implements Driveable {
    @Override
    public void drive() {
        System.out.println("Family Saloon driving");
    }
}

class Motorbike implements Driveable {
    @Override
    public void drive() {
        System.out.println("Motorbike driving");
    }
}

class Transporter<T extends Car & Driveable> {
    private T t;
    
    public void set(T t) {
        this.t = t;
    }
}

public class TestMultipleBounds {
    public static void main(String[] args) {
        Transporter<FamilySaloon> transporter = new Transporter<>();
        Transporter<Motorbike> transporter = new Transporter<>();
    
    }

}