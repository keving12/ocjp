import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class CarHireCallable implements Callable<Boolean> {

    String carReg;
    String driverName;
    
    
    private static Map<String, String> driverCarMap = new HashMap<>();
    static {
        driverCarMap.put("AA01 ABC", "John Doe");
        driverCarMap.put("BB02 DEF", "Jane Doe");
    }
    
    
    public CarHireCallable(String carReg, String driverName) {
        this.carReg = carReg;
        this.driverName = driverName;
    }
    
    public Boolean call() throws Exception {
        if(driverName.equals(driverCarMap.get(carReg))) {
            System.out.println(getDriverName()+" has hired car "+getCarReg());
            return true;
        }
        else { 
            System.out.println("Incorrect driver car pairing: "+this.carReg+", "+this.driverName);
            return false;
        }
    }
    
    public String getDriverName() {
        return driverName;
    }
    
    public String getCarReg() {
        return carReg;
    }



}