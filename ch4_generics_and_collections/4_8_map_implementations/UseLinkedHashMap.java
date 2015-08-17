import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class UseLinkedHashMap {

    public static void main(String[] arg) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Bob", 1);
        map.put("Dave", 0);
        map.put("Alice", 5);
        map.put("Sarah", 2);
        
        String result = "";
        for(Integer i : map.values()) {
            result += i;
        }
        assert(result.equals("1052")) : "Unexpected result - elements in wrong order";
    
    }
    
    


}