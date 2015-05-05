public class DemoMultipleStaticBlocks {

    static {
        ++staticVar;
    }
        
    static int staticVar;
    
    static {
        ++staticVar;
    }
    
    public DemoMultipleStaticBlocks() {
        System.out.println("Constructor: "+staticVar);
    }
    
    public static void main(String[] args) {
        new DemoMultipleStaticBlocks();
    
    }
    
    



}