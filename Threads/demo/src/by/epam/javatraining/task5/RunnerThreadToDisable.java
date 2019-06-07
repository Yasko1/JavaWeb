package by.epam.javatraining.task5;

public class RunnerThreadToDisable {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        ThreadToDisable myThread = new ThreadToDisable();
        Thread myT = new Thread(myThread, "name of ThreadToDisable"); //
        myT.start();
        try {
            Thread.sleep(1100); //задержка 1с 1милисекунда / Tread - все потоки
            myThread.disable(); // сбрасывает состояние потока isActive
            Thread.sleep(1000); // принимает в качестве параметра число миллисекунд, то есть то время, на которое необходимо «усыпить» поток
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу...");
    }
}
