public class CounterSynchronizedBlocked {
    private int count = 0;
    private final Object lock = new Object();
    public void increment(){
        int i = 0;
        while (i < 3){
            synchronized (lock){
                this.count++;
            }
            System.out.printf("%s | count: %d\n", Thread.currentThread().getName(), this.getCount());
            try {
                Thread.sleep(750);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
    public int getCount(){
        return this.count;
    }
}
