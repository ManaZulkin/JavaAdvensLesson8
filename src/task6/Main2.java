package task6;
public class Main2 {
    // спосіб 2 - добавляємо максимальний час очікування на join, щоб при закінченні часу потік більше не чикав закінчення другого потоку
    public static void main(String[] args) {
        First2 first = new First2();
        Second2 second = new Second2();

        first.setT2(second);
        second.setT1(first);
        first.start();
        second.start();

    }

}
class First2 extends Thread{
    Thread t2;

    public void setT2(Thread t2) {
        this.t2 = t2;
    }

    @Override
    public  void run() {
        System.out.println(Thread.currentThread().getName() +  " Started");
        System.out.println(Thread.currentThread().getName() +  " is running");

        try {
            t2.join(10L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() +  " finished");

    }

}

class Second2 extends Thread{
    Thread t1;

    public void setT1(Thread t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() +  " Started");
        System.out.println(Thread.currentThread().getName() +  " is running");
        try {
            t1.join(10L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +  " finished");

    }

}