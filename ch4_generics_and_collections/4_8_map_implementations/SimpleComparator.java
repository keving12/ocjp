import java.util.Comparator;

public class SimpleComparator implements Comparator<SimpleClass> {

    public int compare(SimpleClass sc1, SimpleClass sc2) {
        int result = sc1.getName().compareTo(sc2.getName());
        if(result == 0) {
            return sc1.getId() - sc2.getId();
        }
        return result;
    }

}