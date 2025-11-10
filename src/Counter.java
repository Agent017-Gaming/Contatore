public class Counter {
    private int count = 0;

    public void increment() {
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
