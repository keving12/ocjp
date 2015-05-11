public class FordCarPartFactory extends AbstractCarPartFactory {

    @Override
    protected CarDoor getCarDoor() {
        return new FordFocusDoor();
    }
    
    @Override
    protected CarEngine getCarEngine() {
        return new FordFocusEngine();
    }

}