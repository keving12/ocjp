public class PrintTest {

    public static void main(String[] args) {
        String s = "going";
        print(s, s = "gone");
    
    }
    
    static void print(String a, String b) {
        System.out.println(a+", "+b);
    }

}