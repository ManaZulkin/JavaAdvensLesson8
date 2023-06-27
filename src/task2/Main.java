package task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets start");
        new First().start();
        new Second().start();
        new Third().start();

    }
}

class First extends Thread{

    @Override
    public void run() {
        System.out.println("First threed is running...");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("First threed still is running...");
        System.out.println("First threed is finish");
    }
}


class Second extends Thread{

    @Override
    public void run() {
        System.out.println("Second threed is running...");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Second threed still is running...");
        System.out.println("Second threed is finish");
    }
}


class Third extends Thread{

    @Override
    public void run() {
        System.out.println("Third threed is running...");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Third threed still is running...");
        System.out.println("Third threed is finish");
    }
}