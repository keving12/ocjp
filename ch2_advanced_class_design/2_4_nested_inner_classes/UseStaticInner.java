public class UseStaticInner {

    public static void main(String[] args) {
        StaticInnerTest sit = new StaticInnerTest();
        //InnerTest it = new InnerTest();         // This shouldn't compile - Not referenced using the outer class
        StaticInnerTest.InnerTest sitit = new StaticInnerTest.InnerTest();
    
    
    }

}