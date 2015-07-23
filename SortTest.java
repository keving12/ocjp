import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {
        String[] names = {"bb23","BB23","23bB","b23B","bB23","B23b","23Bb"};
        
        List<String> list = Arrays.asList(names);
        Collections.sort(list);
        System.out.println(list);
    
    }
    
    /**
     * Java's natural sort ordering is
     * - numbers
     * - upper case letters
     * - lowercase letters
     */


}