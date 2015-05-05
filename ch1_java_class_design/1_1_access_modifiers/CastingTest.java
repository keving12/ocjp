public class CastingTest {

    public static void main(String[] args) {
        MyBase base = new MyBase();
        MyDerived derived = new MyDerived();
        base.baseMethod();
        derived.derivedMethod();
        
        MyBase base2 = (MyBase)derived;   // This should work as I am upcasting from derived type to base type
        base2.baseMethod();
        MyDerived derived2 = (MyDerived)base;   // This should CCE as I am downcasting from base type to derived type
        
        
    
    
    }
}

class MyBase {
    
    public void baseMethod() {
        System.out.println("I am base");
    }


}

class MyDerived extends MyBase {

    public void derivedMethod() {
        System.out.println("I am derived");
    }

}