public class UsingAssertions {
    
    
    // use -ea or -enableAssertions to enable assertion checking 
    // use -da or -disableAssertions to disable assertion checking
    public static void main(String[] args) {
        assert(1 == 1); // short format
        assert(1 == 1) : "Equality check failed";   // Long format - provide a message to display on assertion failure
        assert(booleanMethod()) : "Result from calling boolean method false";
    }
    
    public static boolean booleanMethod() {
        return true;
    }
}