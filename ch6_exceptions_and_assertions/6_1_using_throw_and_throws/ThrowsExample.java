import java.io.IOException;
import java.util.Properties;
public class ThrowsExample {

    public static void main(String[] args) throws IOException {
        ThrowsExample example = new ThrowsExample();
        example.exceptionThrowingMethod("Jimmy");
        example.rethrowGenericCatch();
        
        
    }

    public void exceptionThrowingMethod(String name) throws IllegalArgumentException { // Usage of throws, here we declare exceptions thrown from this method.
        if(!name.equals("Kevin")) {
            // Usgae of throw, here we instantiate exception and declare that we wish to throw it back to the caller
            throw new IllegalArgumentException("Name argument is incorrect"); 
        }
    }
    
    /**
     * Here we catch a more generic exception and rethrow it as a more specific one.
     * This is because in Java 7 the 
     */ 
    public void rethrowGenericCatch() throws IOException {
        
        try {
            throw new IOException("Exception thrown of type IOException");
        }
        catch(Exception e) {
            throw e; // We've caught an exception of type Exception but we throw it as IOException
        }
        
    }

}