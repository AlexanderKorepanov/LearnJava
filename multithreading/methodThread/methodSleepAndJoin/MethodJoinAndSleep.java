package multithreading.methodThread.methodSleepAndJoin;

/*
В этом примере поток main выступает в качестве основного потока, который ожидает выполнение стороннего потока Work.
 */

public class MethodJoinAndSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начало работы метода main");
        Thread thread = new Thread(new Work());
        thread.start();
        thread.join();
        System.out.println("Конец работы метода main");
    }

}


class Work implements Runnable {

    @Override
    public void run() {
        System.out.println("Работа началась");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Работа закончена");
    }
}