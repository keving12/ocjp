import java.util.Map;
import java.util.TreeMap;

public class UseComparator {

    public static void main(String[] args) {
        Map<MyObject, Integer> map = new TreeMap<>(new MyObjectComparator());
        map.put(new MyObject("A", 1), 1);
        map.put(new MyObject("B", 2), 3);
        map.put(new MyObject("C", 3), 4);
        map.put(new MyObject("A", 2), 2);
        
        String result = "";
        for(Integer i : map.values()) {
            result += i;
        }
        assert(result.equals("1234")) : "Elements not in the expected order";
    }
}