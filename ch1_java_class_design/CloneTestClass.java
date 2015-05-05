class A implements Cloneable {

    private int i = 10;
}

class B extends A {

    private int i = 20;
}

public class CloneTestClass {

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = (B)b1.clone();
        System.out.println(b1==b2);
        System.out.println(new java.util.Date().getTime());
    
    
    }

}