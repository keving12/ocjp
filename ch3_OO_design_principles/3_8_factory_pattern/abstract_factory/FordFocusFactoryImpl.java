public class FordFocusFactoryImpl implements FordFocusFactory {

    @Override
    public CarDoor createDoor() {
        return new FordFocusDoor();
    }
    
    @Override
    public CarEngine createEngine() {
        return new FordFocusEngine();
    }
    

}