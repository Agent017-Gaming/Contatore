public class Main {
    public static void main(String[] args) {
        Contatore c = new Contatore();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> c.increment());
        Thread t2 = new Thread(() -> c.increment());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + c.getCount());
    }

}