public abstract class AbstractCarPartFactory {

    protected abstract CarEngine getCarEngine();
    protected abstract CarDoor getCarDoor();
    
    public CarEngine getCarEngineInstance() {
        CarEngine engine = getCarEngine();
        return engine;
    }
    
    public CarDoor getCarDoorInstance() {
        CarDoor door = getCarDoor();
        return door;
    }


}