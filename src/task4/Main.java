package task4;



public class Main {
    int count = 1;
    boolean condition = true;

    public static void main(String[] args) {
        Main main = new Main();
        Thread t1 = new Thread(new First(main));
        Thread t2 = new Thread(new Second(main));

        t1.start();
        t2.start();

    }

    public synchronized void getCount() {
        if (condition){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " - " + count);
        condition = true;
        notify();
    }

    public synchronized void setCount() {
        if (!condition){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.count += count;
        System.out.println(Thread.currentThread().getName() + " - " + count);
        condition = false;
        notify();
    }

}

