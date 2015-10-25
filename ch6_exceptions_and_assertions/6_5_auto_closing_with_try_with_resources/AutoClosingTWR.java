import java.io.*;

public class AutoClosingTWR {

    public void tryWithResources() {
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("test.csv")))) {
            
        
        }// scope of bos ends and is closed here
        catch(IOException e) {
            
        }// no need for finally block to close bos as it is auto closed 
        
    
    }


}