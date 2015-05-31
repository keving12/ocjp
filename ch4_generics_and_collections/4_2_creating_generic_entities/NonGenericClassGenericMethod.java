public class NonGenericClassGenericMethod {

    public <E> void print(E e) {
        System.out.println(e.getClass());
    }
    
    public static void main(String[] args) {
        MyNonGenericClass mngc = new MyNonGenericClass();
        mngc.print(new String());
        mngc.print(new Integer(2));
    
    }

}