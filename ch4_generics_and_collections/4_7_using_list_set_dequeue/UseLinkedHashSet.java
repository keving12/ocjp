import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class UseLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> stringLHS = new LinkedHashSet<>();
        stringLHS.add("one");
        stringLHS.add("two");
        stringLHS.add("three");
        stringLHS.add("four");
        Iterator itr = stringLHS.iterator();
        assert(itr.next().equals("one")) : "Unexpected element in first position";
        assert(itr.next().equals("two")) : "Unexpected element in second position";
        assert(itr.next().equals("three")) : "Unexpected element in third position";
        assert(itr.next().equals("four")) : "Unexpected element in fourth position";
        
        // Elements retrieved from the set in the same order as they were inserted
        
        List<String> stringList = Arrays.asList("one", "two", "three", "four");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(stringList);
        assert(lhs.size() == 4) : "Unexpected number of elements";

    }
}