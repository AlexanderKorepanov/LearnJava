package multithreading.methodThread;

/*
Метод currentThread() - позволяет обратиться к текущему потоку.
 */

public class MethodCurrentThread implements Runnable {
    @Override
    public void run() {
        // Тут идёт обращение к потоку thread.
        System.out.println("Метод run(). Имя потока: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MethodCurrentThread());
        thread.start();
        // Тут идёт обращение к потоку main.
        System.out.println("Метод main(). Имя потока: " + Thread.currentThread().getName());
    }
}
