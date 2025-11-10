public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        CounterSynchronized cs = new CounterSynchronized();
        

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(c::increment);
        Thread t2 = new Thread(c::increment);
        Thread t3 = new Thread(cs::increment);
        Thread t4 = new Thread(cs::increment);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.printf("Error: %s", e.getMessage());
        }
    }

}