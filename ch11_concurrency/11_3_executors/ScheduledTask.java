public class ScheduledTask implements Runnable {

    public void run() {
        System.out.println("Scheduled task executed at "+System.currentTimeMillis());
    }
}

