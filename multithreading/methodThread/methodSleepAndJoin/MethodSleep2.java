package multithreading.methodThread.methodSleepAndJoin;

public class MethodSleep2 extends Thread {
    public void run() {
        for (int i =1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        MethodSleep2 thread2 = new MethodSleep2();
        thread1.start();
        thread2.start();
        System.out.println("Это работа потока main"); // Поток main работает независимо от работы 2-х других потоков.
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i =1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}