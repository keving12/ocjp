public class TestFinal {
    public static void main(String[] args) {
        System.out.println(new MyDerivedClass().finalVar);
    
    }



}

class MyClass {

    public final int finalVar;

}

class MyDerivedClass extends MyClass {
    
    MyDerivedClass() {
        super();
        finalVar = 1000;
    }


}