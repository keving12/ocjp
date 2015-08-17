import java.util.Comparator;

public class MyObjectComparator implements Comparator<MyObject> {

    public int compare(MyObject mo1, MyObject mo2) {
        int retval = mo1.getName().compareTo(mo2.getName());
        if(retval == 0) {
            return new Integer(mo1.getId()).compareTo(new Integer(mo2.getId()));
        }
        return retval;
    }


}