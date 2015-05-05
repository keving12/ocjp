public class SingletonPatternSynchronized {

    private static SingletonPatternSynchronized instance;
    
    private SingletonPatternSynchronized() {
    
    }
    
    public synchronized SingletonPatternSynchronized getInstance() {
        if(instance == null) {
            instance = new SingletonPatternSynchronized()
        }
        return instance;
    }


}