package by.epam.javatraining.task4;

public class PriorThread extends Thread implements Runnable {
    public PriorThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName()+ " " + i);
            try {
                Thread.sleep(0); // попробовать
                //sleep(1),sleep(0),sleep(10)
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}
