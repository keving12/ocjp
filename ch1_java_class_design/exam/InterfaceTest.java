import java.io.IOException;
import java.io.FileNotFoundException;

interface I1 {

    public void m1() throws IOException;
}

interface I2 {
    public void m1() throws FileNotFoundException;
}

public class InterfaceTest implements I1, I2{

    public void m1() throws IOException {
    
    }

}