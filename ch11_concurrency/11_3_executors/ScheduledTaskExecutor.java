import java.util.concurrent.*;

public class ScheduledTaskExecutor {

    ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
    
    ScheduledTask task = new ScheduledTask();
    
    public void executeScheduledTask() {
        service.scheduleAtFixedRate(task, 0, 1, TimeUnit.MINUTES);
    }
    
    public static void main(String[] args) {
        ScheduledTaskExecutor executor = new ScheduledTaskExecutor();
        executor.executeScheduledTask();
    }

}