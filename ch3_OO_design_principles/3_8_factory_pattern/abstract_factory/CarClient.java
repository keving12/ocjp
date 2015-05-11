public class CarClient {

    public static void main(String[] args) {
        AbstractCarPartFactory factory1 = new FordCarPartFactory();
        CarDoor door1 = factory1.getCarDoor();
        CarEngine engine1 = factory1.getCarEngine();
        System.out.println(door1.getClass()+", "+engine1.getClass());
        
        AbstractCarPartFactory factory2 = new RenaultCarPartFactory();
        CarDoor door2 = factory2.getCarDoor();
        CarEngine engine2 = factory2.getCarEngine();
        System.out.println(door2.getClass()+", "+engine2.getClass());
    
    }
    
    


}