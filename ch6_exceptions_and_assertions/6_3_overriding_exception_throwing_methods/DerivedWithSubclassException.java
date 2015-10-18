import java.io.FileNotFoundException;
public class DerivedWithSubclassException extends Base {

    /**
     * The method in the base class throws an exception of type
     * IOException and here an exception that is a subclass of IOException is
     * thrown. This is valid.
     */ 
    public void overriddenMethodIO() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}