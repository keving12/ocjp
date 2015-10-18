import java.io.FileNotFoundException;
public class DerivedWithEquivalentException extends Base {

    @Override
    public void overriddenMethod() throws FileNotFoundException {
        System.out.println("Equivalent exception works fine");
    }
    
    public static void main(String[] args) {
        DerivedWithEquivalentException dwee = new DerivedWithEquivalentException();
        try {
            dwee.overriddenMethod();    
        }
        catch(FileNotFoundException e) {
            
        }
        
    }

}