import java.util.List;
import java.util.ArrayList;

public class Wildcards {
    
    public void testUnboundedWildcard() {
        List<Object> list = new ArrayList<String>(); // This will fail to compile
        /**
         * Compiler will report:
         * incompatible types: ArrayList<String> cannot be converted to List<Object>
         */
         List<?> wildcardList = new ArrayList<String>();    // This is valid and will compile successfully
         
         wildcardList.add(new String("hello")); 
         // However, when using collection with a wildcard type parameter we cannot add to that collection. The line above causes a compilation failure
            
        
    
    }
    
    public void testUpperBoundedWildcard() {
        List<? extends Number> numberList = new ArrayList<Number>();
        List<? extends Number> doubleList = new ArrayList<Double>();
        List<? extends Number> integerList = new ArrayList<Integer>();
        // All assignments above are correct and will compile as Double and Integer are both subclasses of Number
        // Line below will fail to compile as String is not a subclass of Number
        List<? extends Number> stringList = new ArrayList<String>();
    }
    
    
    public void testLowerBoundedWildcard() {
        List<? super Integer> numberList = new ArrayList<Number>();
        List<? super Integer> objectList = new ArrayList<Object>();
        List<? super Integer> integerList = new ArrayList<Integer>();
        // All assignments above are correct and will compile as Number, Object and Integer are of type Integer or a superclass of Integer
        // Line below will fail to compile as Double is a subclass of number and only the type itself or a super class can be assigned when using lower bounded wildcards
        List<? super Number> doubleList = new ArrayList<Double>();
    }
    
}