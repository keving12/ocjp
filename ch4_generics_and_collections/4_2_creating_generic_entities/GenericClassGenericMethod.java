public class GenericClassGenericMethod<T> {

    public <E> void print(E e) {
        System.out.println(e.getClass());

    }
    /**
     * Below method cause compilation to fail - T is class level parameter type. Cannot be applied to generic method
     */
    public <T> void anotherPrint(T t) {
        System.out.println(e.getClass());
    }
    
    public static void main(String[] args) {
        GenericClassGenericMethod<String> gcgm = new GenericClassGenericMethod<>();
        gcgm.print(new Integer(12));
        gcgm.print(new Object());
        gcgm.anotherPrint(new Integer(3));
        gcgm.anotherPrint(new Object());
    }
}