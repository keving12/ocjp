import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;

public class UseHashMap {

    public static void main(String[] args) {
        addElements();
        constructFromAnotherMap();
        
    
        
    
    
    }
    
    public static void addElements() {
        Map<String, Integer> strMap = new HashMap<>();
        strMap.put("A", 1);
        strMap.put("B", 2);
        strMap.put("C", 3);
        strMap.put("D", 4);
        // Value might be different but key already exists, this wont be inserted.
        strMap.put("B", 7);
        
        assert(strMap.size() == 4) : "Unexpected number of elements";
        // Can't assert order of items so can only check map contains elements
        Set<String> keySet = strMap.keySet();
        assert(keySet.contains("A"));
        assert(keySet.contains("B"));
        assert(keySet.contains("C"));
        assert(keySet.contains("D"));
    }
    
    public static void constructFromAnotherMap() {
        Map<String, List<Integer>> firstMap = new HashMap<>();
        firstMap.put("A", Arrays.asList(1,2,3,4));
        firstMap.put("B", Arrays.asList(9,8,7,6));
        firstMap.put("C", Arrays.asList(4,5,6));
        // Below line does not compile as type arguments are different from those of the argument passed to the constructor.
        //Map<String, Double> copiedMap = new HashMap<>(firstMap);
        Map<String, List<Integer>> copiedMap = new HashMap<>(firstMap);
        assert(firstMap.size() == 3) : "Unexpected number of elements";
        assert(copiedMap.size() == 3) : "Unexpected number of elements";
        firstMap.remove("C");
        assert(firstMap.size() == 2) : "Unexpected number of elements";
        // Assert removal of element from map this was created from does not remove element from this map.
        assert(copiedMap.size() ==3) : "Unexpected number of elements";
    }
    
    public void addDuplicateKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Kevin", 12);
        map.put("James", 7);
        map.put("Rebecca", 15);
        map.put("Kevin", 5);
        map.put("Jenny", 21);
        assert(map.get("Kevin") == 5) : "Value for key 'Kevin' should have been overwritten";
    }
    
    public void removeElements() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Kevin", 12);
        map.put("James", 7);
        map.put("Rebecca", 15);
        map.put("Jenny", 5);
        assert(map.size() == 4) : "Unexpected number of elements in map";
        assert(map.remove("Jenny") == 5) : "Incorrect value for key";
        assert(map.size() == 3) : "Unexpected number of elements in map";
        map.clear();
        assert(map.size() == 0) : "Unexpected number of elements in map";
    }
    
    public void addFromAnotherMap() {
        Map<String, Integer> firstMap = new HashMap<>();
        firstMap.put("Alex", 20);
        firstMap.put("Britney", 10);
        firstMap.put("Charlie", 15);
        Map<String, Integer> secondMap = new HashMap<>();
        secondMap.put("Alex", 17);
        secondMap.put("Diane", 4);
        secondMap.put("Eric", 12);
    
        firstMap.putAll(secondMap);
        assert(firstMap.size() == 5) : "Incorrect number of elements in map";
        assert(firstMap.get("Alex") == 17) : "Incorrect value for key";
    }
    
    public void otherRetrieval() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alex", 1);
        map.put("Britney", 2);
        map.put("Charlie", 3);
        map.put("Derek", 4);
        map.put("Elise", 5);
        
        Set<String> keyset = map.keySet();
        assert(keyset.contains("Britnet")) : "Key from map not found";
        assert(keyset.size() == 5) : "Incorrect number of keys in set";
        
        Collection<Integer> values = map.values();
        assert(values.size() == 5) : "Incorrect number of values in collection";
        assert(values.contains(new Integer(4))) : "Value not found in collection";
        
        Set<Map.Entry<String, Integer>> kvPairs = map.entrySet();
        assert(kvPairs.size() == 5) : "Incorrect number of elements in set";
    }
}