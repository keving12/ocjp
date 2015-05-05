class Outer {
    
    Inner inner = new Inner();
    
    public void createInnerInstance() {
        Inner inner = new Inner();
    }
    
    public static void createInnerAgain() {
       // Inner innner = new Inner();         // Inner class is effectively instance member so cannot be called from static method
        
    }
    
    public static void createInnerStatic() {
        Outer outer = new Outer();
        outer.new Inner();
        
    }


    class Inner {
       final static int num = 10;    
    
    
    
    }



}

public class UseOuter {

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.new Inner().num);
    
    
    }



}