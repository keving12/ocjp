import java.util.Queue;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class HireDesk implements Executor {

    final Queue<Runnable> waitingCustomers = new ArrayDeque<>();
    public void execute(Runnable r) {
        waitingCustomers.offer(r);
        serveNextCustomer();
    }
    
    private void serveNextCustomer() {
        Runnable task = waitingCustomers.poll();
        new Thread(task).start();
    }
    
    public static void main(String[] args) {
        HireDesk desk = new HireDesk();
        desk.execute(new CarHire("AA01 ABC"));
        desk.execute(new CarHire("BB02 DEF"));
        desk.execute(new CarHire("CC03 GHJ"));
    }
}