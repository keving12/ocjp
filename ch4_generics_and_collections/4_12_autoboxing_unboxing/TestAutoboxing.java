public class TestAutoboxing {

    public static void main(String[] args) {
        Integer i = 12;
        int a = new Integer(7);
        Integer b = a + i;
        
        assert(i.getClass().equals(Integer.class)) : "Incorrect class";
        assert(a == 7) : "Incorrect value";
        assert(b == 19) : "Incorrect value";
    
    
    }


}