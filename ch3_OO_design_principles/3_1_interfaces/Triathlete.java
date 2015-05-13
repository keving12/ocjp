public class Triathlete implements Cyclist, Swimmer, Runner {
    
    @Override
    public void cycle() {
        System.out.println("Cycling");
    }
    
    @Override
    public void swim() {
        System.out.println("Swimming");
    }
     
    /**
     * Commenting out the run method means this class is failing to implement all of the methods of
     * all of the interfaces it has agreed to implement. This will cause a compilation failure.
    @Override
    public void run() {
        System.out.println("Running");
    }
    */
    
    
    
    

}