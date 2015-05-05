public class OverloadingWithInheritance {

    public void printMe(A a) {
        System.out.println(a.getId());
    }
    
    public void printMe(B b) {
        System.out.println(b.getId());
    }
}

class A {

    private String id;
    
    public String getId() {
        return "I am A";
    }

}

class B extends A {
    
    private String id;
    
    public String getId() {
        return "I am B";
    }
    

}