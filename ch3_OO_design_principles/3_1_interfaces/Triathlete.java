public class Triathlete implements Cyclist, Swimmer, Runner {
    
    @Override
    public void cycle() {
        System.out.println("Cycling");
    }
    
    @Override
    public void swim() {
        System.out.println("Swimming");
    }
     
    @Override
    public void run() {
        System.out.println("Running");
    }
    
    

}