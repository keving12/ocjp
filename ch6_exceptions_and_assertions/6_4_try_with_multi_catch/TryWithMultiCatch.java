import java.io.FileNotFoundException;
public class TryWithMultiCatch {

    public void tryMulti(String param) {
        try {
            if(param.equals("FNF")) {
                throw new FileNotFoundException("FNF Exception");
            }
            else {
                Object o = "Hello";
                Integer i = (Integer)o;
            }
        
        }
        catch(FileNotFoundException | ClassCastException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        TryWithMultiCatch tmc = new TryWithMultiCatch();
        tmc.tryMulti("A");
    }


}