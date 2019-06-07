package by.epam.javatraining.task1;

public class MyThread  extends Thread {

    public void run(){
        System.out.println("hello");

    }

    public static void main (String[] args){
        MyThread t = new MyThread();
        t.start(); // starn run(0)
    }
}
