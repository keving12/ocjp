public class TypeInference<T> {

    public <E> void print(E e) {
        System.out.println(e.getClass());
    }
    
    public static void main(String[] args) {
        TypeInference<RandomType> tirt = new TypeInference<>();
        tirt.print(new RandomType());
        tirt.print(new Object());
        tirt.print(new Integer(12));
        tirt.print(new String("hello"));
        tirt.<Double>print(7.7);
    
    }
    
    private static class RandomType {
        
    
    }


}