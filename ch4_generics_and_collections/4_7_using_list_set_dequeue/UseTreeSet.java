import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator; 

public class UseTreeSet {

    public static void main(String[] args) {
        Set<String> strSet = new TreeSet<>();
        strSet.add("Kevin");
        strSet.add("James");
        strSet.add("Robert");
        strSet.add("Michael");
        Iterator itr = strSet.iterator();
        assert(itr.next().equals("James")) : "Element in unexpected order";
        assert(itr.next().equals("Kevin")) : "Element in unexpected order";
        assert(itr.next().equals("Michael")) : "Element in unexpected order";
        assert (itr.next().equals("Robert")) : "Element in unexpected order";
        // String implements the Comparable interface and compareTo method so elemts sorted in alphabetcial order.
        TreeSet<TreeObject> toSet = new TreeSet<>();
        toSet.add(new TreeObject("Kevin", 1));
        toSet.add(new TreeObject("Kevin", 7));
        toSet.add(new TreeObject("James", 1));
        toSet.add(new TreeObject("James", 3));
        
        Iterator<TreeObject> itr2 = toSet.iterator();
        TreeObject obj = itr2.next();
        assert(obj.getName().equals("James") && obj.getId() == 1) : "Element in unexpected order";
        obj = itr2.next();
        assert(obj.getName().equals("James") && obj.getId() == 3) : "Element in unexpected order";
        obj = itr2.next();
        assert(obj.getName().equals("Kevin") && obj.getId() == 1) : "Element in unexpected order";
        obj = itr2.next();
        assert(obj.getName().equals("Kevin") && obj.getId() == 7) : "Element in unexpected order";
        
        
        
    
    
    }
    
    private static class TreeObject implements Comparable<TreeObject> {
        
        private String name;
        private int id;
        
        public TreeObject(String name, int id) {
            this.name = name;
            this.id = id;
        }
        
        
        public int compareTo(TreeObject obj) {
            /**
             * Order by name first and only when two names the same are found do we 
             * consider the id of the object to determine how to sort
             */
            if(this.getName().compareTo(obj.getName()) == 0) {
                return this.getId() - obj.getId();
            }
            else {
                return this.getName().compareTo(obj.getName());    
            }
            
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        @Override
        public String toString() {
            return "TreeObject : "+this.getName()+" | "+this.getId();
        }
        
        @Override
        public boolean equals(Object obj) {
            if(obj != null && obj instanceof TreeObject) {
                TreeObject to = (TreeObject)obj;
                if(to.getName().equals(this.getName()) && to.getId() == this.getId()) {
                    return true;
                }
            }
            return false;
        }

    }
}