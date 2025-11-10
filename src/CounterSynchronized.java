import java.util.concurrent.SynchronousQueue;

public class CounterSynchronized {
    private int count = 0;

    public synchronized void increment() {
        int i = 0;
        while (i < 5000){
            count++;
            i++;
        }
        System.out.printf("%s, count: %d\n", Thread.currentThread().getName(),this.getCount());
    }

    public int getCount() {
        return count;
    }
}
