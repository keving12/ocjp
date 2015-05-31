public class GenericClassGenericMethod<T> {

    public <E> void print(E e) {
        System.out.println(e.getClass());

    }
    
    public <T> void anotherPrint(T t) {
        System.out.println(t.getClass());
    }
    
    public static void main(String[] args) {
        GenericClassGenericMethod<String> gcgm = new GenericClassGenericMethod<>();
        gcgm.print(new Integer(12));
        gcgm.print(new Object());
        gcgm.anotherPrint(new Integer(3));
        gcgm.anotherPrint(new Object());
    }
}