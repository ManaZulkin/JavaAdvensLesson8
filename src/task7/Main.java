package task7;

import static java.lang.Thread.sleep;

class Deamon extends Thread {
    @Override
    public void run() {
        System.out.println("Name - " + Thread.currentThread().getName());
        System.out.println("State - " + Thread.currentThread().getState());
        System.out.println("Is alive? - " + Thread.currentThread().isAlive());
        System.out.println("Is daemon - " + Thread.currentThread().isDaemon());
        System.out.println("Is Interrupted - " + Thread.currentThread().isInterrupted());
        System.out.println("Class loader - " + Thread.currentThread().getContextClassLoader());
    }
}
public class Main {
    public static void main(String[] args) {
        Deamon deamon = new Deamon();
        deamon.setDaemon(true);
        deamon.start();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}