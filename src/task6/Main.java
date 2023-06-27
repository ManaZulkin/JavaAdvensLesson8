package task6;
public class Main {
    // спосіб 1 - просто прибераємо взаємозвязок(Геніально просто але не несе в собі сенсу так як може порушити принцип роботи програми)


    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        first.setT2(second);
        second.setT1(first);
        first.start();
        second.start();

    }

}
class First extends Thread{
    Thread t2;

    public void setT2(Thread t2) {
        this.t2 = t2;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +  " Started");
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +  " is running");
        /*try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/


        System.out.println(Thread.currentThread().getName() +  " finished");

    }

}

class Second extends Thread{
    Thread t1;

    public void setT1(Thread t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() +  " Started");
        System.out.println(Thread.currentThread().getName() +  " is running");

        /*try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +  " finished");

    }

}