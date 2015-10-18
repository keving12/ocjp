import java.io.FileNotFoundException;
public class DerivedWithNoDeclaredException extends Base {

    /**
     * It is valid to override a method that throws an exception
     * with a method that declares not to throw any exception 
     */
    @Override
    public void overriddenMethod() {
        System.out.println("This is fine");
    }
    
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.overriddenMethod();
    }
}