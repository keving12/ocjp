import java.util.UUID;

public class UseThread extends Thread {
    
    public UseThread(String name) {
        super(name);
    }

    public void run() {
        UUID uuid = UUID.randomUUID();
        
        for(int i = 0; i < 5; i++) {
            System.out.println(this.currentThread().getName() +"::"+i);
        }
    }
    
    public static void main(String[] args) {
        UseThread myThread1 = new UseThread("thread-1");
        UseThread myThread2 = new UseThread("thread-2");
        UseThread myThread3 = new UseThread("thread-3");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

    /** OUTPUT
        thread-2::0
        thread-1::0
        thread-1::1
        thread-3::0
        thread-1::2
        thread-1::3
        thread-2::1
        thread-1::4
        thread-3::1
        thread-2::2
        thread-3::2
        thread-2::3
        thread-2::4
        thread-3::3
        thread-3::4
        
    */

}