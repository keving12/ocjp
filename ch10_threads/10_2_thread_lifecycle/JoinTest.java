public class JoinTest {
    
    public static void main(String[] args) throws InterruptedException {
        ShortRunningTask srt = new ShortRunningTask();
        srt.start(); // start a short running task
    }
}

class ShortRunningTask extends Thread {
    LongRunningTask lrt = new LongRunningTask();
    
    public void run() {
        System.out.println("Started short running task");
        try {
            lrt.start(); // start a long running task 
            Thread.sleep(10000); // sleep 10 seconds
            System.out.println("Finished sleeping");
            lrt.join(); // Wait at least another 10 seconds until the long running task is complete before this thread completes
            
        }
        catch(InterruptedException e) {
            
        }
        System.out.println("Finished short running task");
    }

}

class LongRunningTask extends Thread {
    public void run() {
        System.out.println("Started long running task");
        try {
            Thread.sleep(20000);    
        }
        catch(InterruptedException e) {
            
        }
        System.out.println("Finished long running task");
    }
}