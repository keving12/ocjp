public class RenaultCarPartFactory extends AbstractCarPartFactory {

    @Override
    protected CarDoor getCarDoor() {
        return new RenaultClioDoor();
    }
    
    @Override
    protected CarEngine getCarEngine() {
        return new RenaultClioEngine();
    }

}