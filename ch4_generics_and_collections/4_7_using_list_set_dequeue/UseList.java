import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ListIterator;

public class UseList {
    
    // Using assertions in here - to run with assertions enabled add the -ea flag

    public static void main(String[] args) {
        UseList instance = new UseList();
        instance.arrayListOps();
    }
    
    public void arrayListOps() {
        // declare and initialise a list of default size
        List<Integer> intList = new ArrayList<>();
        // declare and initialise a list of specified size
        List<Double> doubleList = new ArrayList<>(20);
        // declare and initialise a set to construct a list from
        Set<String> stringSet = new HashSet<>();
        stringSet.add("some");
        stringSet.add("set");
        stringSet.add("values");
        stringSet.add("here");
        // declare and initialise a list using a collection (set above)
        List<String> stringList = new ArrayList<>(stringSet);
        
        // add three integers to the list above.
        intList.add(10);
        intList.add(20);
        intList.add(30);
        // add an integer at a specific point in the list - number 25 at position 2
        intList.add(2, 25);
        // remove an element from the list
        intList.remove(new Integer(30));
        // replace a value at the given position - set 22 at position 2
        intList.set(2, 22);
        // Retrieve an element from the list - element at position 1
        Integer num = intList.get(1);
        assert(num==20) : "num is not 20";
        assert(intList.contains(10)) : "list doesn't contain 10";
        assert(!intList.contains(77)) : "list does contain 77";
        // Print the count of the number of elements in the ArrayList
        assert(intList.size() == 3) : "list has incorrect number of elements";
        // Get an interator for this list and iterate over the collection printing the objects
        ListIterator<Integer> iterator = intList.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
        // Removal of objects when equals not overridden
        List<MyObject> myObjList = new ArrayList<>();
        myObjList.add(new MyObject(1, "One", null));
        myObjList.add(new MyObject(2, "Two", null));
        myObjList.add(new MyObject(3, "Three", null));
        System.out.println("size = "+myObjList.size()); // prints 3
        myObjList.remove(new MyObject(1, "One", null));
        System.out.println("size = "+myObjList.size()); // also prints 3 - object to be removed wasn't found
        
        // Removal of objects when equals is overridden
        List<MyObjectEqualsOverridden> myObjOverriddenList = new ArrayList<>();
        myObjOverriddenList.add(new MyObjectEqualsOverridden(1, "One", null));
        myObjOverriddenList.add(new MyObjectEqualsOverridden(2, "Two", null));
        myObjOverriddenList.add(new MyObjectEqualsOverridden(3, "Three", null));
        System.out.println("size = "+myObjOverriddenList.size()); // prints 3
        myObjOverriddenList.remove(new MyObjectEqualsOverridden(1, "One", null));
        System.out.println("size = "+myObjOverriddenList.size()); // prints 2 - object to be removed was found because equals method was overridden
    }
    
    private class MyObject {

        private int id;
        private String name;
        private List<String> attributes;
        
        public MyObject() {
            id = 0;
            name = "";
            attributes = new ArrayList<String>();
        }
        
        public MyObject(int id, String name, List<String> attr) {
            this.id = id;
            this.name = name;
            this.attributes = new ArrayList<String>();
        }
        
        public int getId() {
            return id;
        }
        
        public String getName() {
            return name;
        }
    }
    
    private class MyObjectEqualsOverridden extends MyObject {
        
        public MyObjectEqualsOverridden(int id, String name, List<String> attr) {
            super(id, name, attr);
        }
        
        @Override
        public boolean equals(Object obj) {
            if(obj instanceof MyObjectEqualsOverridden) {
                MyObjectEqualsOverridden myObj = (MyObjectEqualsOverridden) obj;
                if(this.getName().equals(myObj.getName()) && this.getId() == myObj.getId()) {
                    return true;
                }
            }
            
            return false;
        }
        
    }
}