public class Dealer {

    public static void main(String[] args) {
        Car car = CarFactory.getCar(50000); // Only have 50 000 to spend so should get a family saloon
        System.out.println(car instanceof FamilySaloon);
        
        Car car = CarFactory.getCar(120000);    // spending 120 000 so should get a super car
        System.out.println(car instanceof Supercar);
    
    }


}