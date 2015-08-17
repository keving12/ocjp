import java.util.Map;
import java.util.TreeMap;

public class UseTreeMap {

    public static void main(String[] args) {
    
        useStringMap();
        userDefinedMapWithComparable();
        userDefinedMapWithComparator();
        userDefinedNonComparable();
    }
    
    public static void useStringMap() {
        /**
         * Because the String class implements the Comparable interface there is no need to define a comparator.
         * The String class will determine how our keys should be ordered.
         */
        
        Map<String, Integer> map = new TreeMap<>();
        map.put("Alex", 1);
        map.put("Dean", 4);
        map.put("Charlie", 3);
        map.put("Brian", 2);
        
        String result = "";
        for(Integer i : map.values()) {
            result += i;
        }
        assert(result.equals("1234")) : "Elements not in the expected order";
    }
    
    public static void userDefinedMapWithComparable() {
        /**
         * Because the class MyComparableObj also implements the Comparable interface
         * there is no need to define a comparator as the order of objects are defined
         * in the user defined class
         */
         Map<MyComparableObj, Integer> map = new TreeMap<>();
         map.put(new MyComparableObj("Kevin", 12), 4);
         map.put(new MyComparableObj("Kevin", 7), 3);
         map.put(new MyComparableObj("Alex", 11), 1);
         map.put(new MyComparableObj("James", 2), 2);
         
         String result = "";
        for(Integer i : map.values()) {
            result += i;
        }
        assert(result.equals("1234")) : "Elements not in the expected order";
    }
    
    public static void userDefinedMapWithComparator() {
        /**
         * Pass a comparator into the constructor of the TreeMap 
         * and this will define the order in which object should be stroed
         */
        Map<SimpleClass, Integer> map = new TreeMap<>(new SimpleComparator());
        map.put(new SimpleClass("Kevin", 12), 4);
        map.put(new SimpleClass("Kevin", 7), 3);
        map.put(new SimpleClass("Alex", 11), 1);
        map.put(new SimpleClass("James", 2), 2);
         
         String result = "";
        for(Integer i : map.values()) {
            result += i;
        }
        assert(result.equals("1234")) : "Elements not in the expected order";
    }
    
    public static void userDefinedNonComparable() {
        Map<NonComparableObj> map = new TreeMap<>();
        map.put(new NonComparableObj(2.2, 22), 1);
        map.put(new )
    }
    
    private static class MyComparableObj implements Comparable<MyComparableObj> {
        
        private String name;
        private int id;
        
        public MyComparableObj(String name, int id) {
            this.name = name;
            this.id = id;
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
        
        public int compareTo(MyComparableObj obj) {
            int result = this.getName().compareTo(obj.getName());
            if(result == 0) {
                return new Integer(this.getId()).compareTo(new Integer(obj.getId()));
            }
            return result;
        }
    }
    
    private static class NonComparableObj {
        public double myDouble;
        public int myInt;
        
        public NonComparableObj(double myDouble, int myInt) {
            this.myDouble = myDouble;
            this.myInt = myInt;
        }
        
        public double getMyDouble() {
            return myDouble;
        }
        
        public void setMyDouble(double myDouble) {
            this.myDouble = myDouble;
        }
        
        public int getMyInt() {
            return myInt;
        }
        
        public void setMyDouble(int myInt) {
            this.myInt = myInt;
        }
        
        
    }
    
    
}