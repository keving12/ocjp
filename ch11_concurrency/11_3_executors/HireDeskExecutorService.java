import java.util.concurrent.*;

public class HireDeskExecutorService {
    
    ExecutorService service = Executors.newFixedThreadPool(5);
    
    public void serveNextCustomer(CarHireCallable chc) {
        // Submit this Callable instance to the ExecutorService. Will be queued until thread from the pool becomes available
        service.submit(chc);
    }
    
    public void closeDesk() {
        service.shutdown();
    }
    
    public static void main(String[] args) {
        HireDeskExecutorService desk = new HireDeskExecutorService();
        desk.serveNextCustomer(new CarHireCallable("AA01 ABC", "John Doe"));
        desk.serveNextCustomer(new CarHireCallable("BB02 DEF", "Jane Doe"));
        desk.serveNextCustomer(new CarHireCallable("CC03 GHJ", "Jerry"));
        desk.closeDesk();
        // This one should throw an exception as it cannot be executed after the ExecutorService has been shutdown
        desk.serveNextCustomer(new CarHireCallable("AB12 CDE","Tom"));
    }


}