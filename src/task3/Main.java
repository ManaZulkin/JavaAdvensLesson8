package task3;

public class Main {
    public static void main(String[] args) {
        Thread runer = new Thread(new PriorityRuner());
        Thread thread = new Thread(new PriorityThread());

        runer.setPriority(10);
        thread.setPriority(1);

        System.out.println(Thread.currentThread().getName() + " priority = " + Thread.currentThread().getPriority());
        System.out.println(runer.getName() + " priority = " + runer.getPriority());
        System.out.println(thread.getName() + " priority = " + thread.getPriority());

        runer.start();
        thread.start();

        for (int i = 0; i < 50; i++){
            System.out.println("i = " + i + " " + Thread.currentThread().getName());
        }
    }
}
class PriorityRuner implements Runnable{

    @Override
    public void run() {

        for (int j = 0; j < 50; j++){
            System.out.println("j = " + j + " " + Thread.currentThread().getName());
        }
    }
}

class PriorityThread extends Thread{
    @Override
    public void run() {
        for (int k = 0; k < 50; k++){
            System.out.println("k = " + k + " " + Thread.currentThread().getName());
        }
    }
}