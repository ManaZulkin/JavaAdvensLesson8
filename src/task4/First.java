package task4;

public class First extends Thread {
    Main main;
    First (Main main){
        this.main = main;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            main.getCount();

        }

    }
}
