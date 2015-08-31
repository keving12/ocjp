public class CarHire implements Runnable {

    String carReg;
    
    public CarHire(String carReg) {
        this.carReg = carReg;
    }
    
    public void run() {
        System.out.println("Completed hire of "+this.carReg);
    }
}