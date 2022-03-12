package multithreading.methodThread.methodSleepAndJoin;

/*
Метод join() - позволяет обеспечить выполнение указанного потока только после полной обработки другого потока.
Этому методу также необходима обработка.
Т.е. поток, для которого вызван метод join() ожидает завршение другого(их) потока(ов).
Метод join() может принимать в параметр миллисекунды - время ожидания другого потока.
 */

public class MethodJoin extends Thread{
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

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyClass());
        MethodSleep2 thread2 = new MethodSleep2();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Это работа потока main с ожиданием через метод join()");
    }

}

class MyClass implements Runnable {

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

