public class CarFactory {

    public static Car getCar(int amount) {
        Car car = null;
        if(amount < 100000) {
            car = new FamilySaloon();
        }
        else if(amount > 100000) {
            car = new Supercar();
        }
        return car;
    }


}