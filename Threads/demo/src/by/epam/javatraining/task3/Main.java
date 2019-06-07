package by.epam.javatraining.task3;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t.getName()); // main
        System.out.println(t); // Thread[main,5,main]
    }
}
