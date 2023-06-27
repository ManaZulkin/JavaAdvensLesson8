package task4;

public class Second extends Thread{
    Main main;
    Second (Main main){
        this.main = main;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            main.setCount();
        }

    }

}
