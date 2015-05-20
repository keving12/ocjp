public class Car {

    // The car is composed of various parts including an Engine and CarSeats
    private Engine engine;
    private List<CarSeat> seats;
    
    
    public String getUpholstery() {
        if(seats != null || seats.size() > 0) {
            return seats.get(0).getMaterial();
        }
    }
    
    public int getPower() {
        if(engine != null) {
            return engine.getBhp();
        }
    }


}