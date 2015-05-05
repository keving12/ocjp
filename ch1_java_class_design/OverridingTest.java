import java.io.IOException;
import java.sql.SQLException;
interface I1 {
    void m1() throws IOException;
}

interface I2 {
    void m1() throws SQLException;
}

public class OverridingTest implements I1, I2{
    
    public static void main(String[] args) {
        OverridingTest ot = new OverridingTest();
        
        
    
    }
    
    @Override
    public void m1() {
        System.out.println("Hello");
    }



}