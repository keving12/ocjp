public class SingletonPattern {

    private static SingletonPattern instance;
    
    private SingletonPattern() {
    
    }
    
    public static SingletonPattern getInstance() {
        if(instance == null) {  // Check if instance is set 
            instance = new SingletonPattern();  // if not instantiate using private constructor
        }
        
        return instance;    // return singleton instance
    }
    
    public static void main(String[] args) {
        SingletonPattern singleton1 = SingletonPattern.getInstance();   // Get an instance
        SingletonPattern singleton2 = SingletonPattern.getInstance();   // Get another instance
        System.out.println(singleton1 == singleton2);   //Evaluate equality of instances - should be the same
    }


}