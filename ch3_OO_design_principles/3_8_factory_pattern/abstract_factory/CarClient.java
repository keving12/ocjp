public class CarClient {

    public static void main(String[] args) {
        
        FordFocusFactory ffFactory = new FordFocusFactoryImpl();
        CarDoor ffDoor = ffFactory.createDoor();
        CarEngine ffEngine = ffFactory.createEngine();
        System.out.println(ffDoor.getClass()+", "+ffEngine.getClass());
        
        RenaultClioFactory rcFactory = new RenaultClioFactoryImpl();
        CarDoor rcDoor = rcFactory.createDoor();
        CarEngine rcEngine = rcFactory.createEngine();
        System.out.println(rcDoor.getClass()+", "+rcEngine.getClass());
    
    
    }
    
    


}