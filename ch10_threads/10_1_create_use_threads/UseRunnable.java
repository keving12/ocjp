import java.util.UUID;
public class UseRunnable implements Runnable {

    public void run() {
        UUID uuid = UUID.randomUUID();
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new UseRunnable(), "thread-1");
        Thread t2 = new Thread(new UseRunnable(), "thread-2");
        Thread t3 = new Thread(new UseRunnable(), "thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
    
    /**
        thread-2::0
        thread-1::0
        thread-1::1
        thread-3::0
        thread-1::2
        thread-1::3
        thread-1::4
        thread-2::1
        thread-3::1
        thread-2::2
        thread-3::2
        thread-2::3
        thread-2::4
        thread-3::3
        thread-3::4
    */

}