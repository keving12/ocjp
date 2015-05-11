public class RenaultClioFactoryImpl implements RenaultClioFactory {

    @Override
    public CarDoor createDoor() {
        return new RenaultClioDoor();
    }
    
    @Override
    public CarEngine createEngine() {
        return new RenaultClioEngine();
    }


}