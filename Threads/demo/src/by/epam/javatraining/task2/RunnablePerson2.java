package by.epam.javatraining.task2;

public class RunnablePerson2 extends Person implements Runnable {
    public RunnablePerson2 (String name) {
        super(name);
    }
    public static void main(String[] args) {
        RunnablePerson p1 = new RunnablePerson("Alice");
        Thread t1 = new Thread(p1);
        t1.start();
        RunnablePerson p2 = new RunnablePerson("Bob");
        Thread t2 = new Thread(p2);
        t2.start();
        try {
            t1.join(); // Ждет выполнения указанного потока
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("stop");

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(getName() + ": Hello World!");
        }
    }
}
