public class SingletonPatternEager {

    private static SingletonPatternEager instance = new SingletonPatternEager();
    
    private SingletonPatternEager() {
    
    }
    
    public SingletonPatternEager getInstance() {
        return instance;
    }



}

/**
 * This class demonstrates use of eager initialisation in a singleton class. The static reference is instantiated at class load 
 * removing possibility of run time issues when accessed concurrently. Downside to this is there will be an instance in memory 
 * regardless of whether it is used or not.