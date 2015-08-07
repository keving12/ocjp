import java.util.*;

public class UseHashSet {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Set<Double> doubleSet = new HashSet<>();
        
        stringSet.add("bob");
        stringSet.add("sally");
        stringSet.add("dave");
        stringSet.add("bob");
        stringSet.add("amy");
        assert(stringSet.size() == 4) : "Incorrect number of elements"; // assert that the duplicate bob was not inserted
        assert(stringSet.contains("dave")) : "Element not found in set";
        
        doubleSet.add(new Double(1));
        doubleSet.add(new Double(1.0));
        doubleSet.add(new Double(2.2));
        doubleSet.add(null);
        doubleSet.add(new Double(1.9));
        doubleSet.add(new Double(5.5));
        doubleSet.add(null);
        assert(doubleSet.size() == 5) : "Incorrect number of elements"; // assert that the duplicate 1.0 was not inserted
        assert(doubleSet.contains(new Double(5.5))) : "Element not found in set";
        assert(doubleSet.contains(null));
        

    }
    
    
    
    
}