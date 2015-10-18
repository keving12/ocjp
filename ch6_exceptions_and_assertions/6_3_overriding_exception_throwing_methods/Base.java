import java.io.FileNotFoundException;
import java.io.IOException;
public class Base {

    public void overriddenMethod() throws FileNotFoundException {
        throw new FileNotFoundException("File not found");
    }
    
    public void overriddenMethodIO() throws IOException {
        throw new IOException("IO Exception");
    }

}