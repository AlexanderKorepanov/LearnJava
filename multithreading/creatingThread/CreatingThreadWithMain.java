package multithreading.creatingThread;

/*
При создании потоков важно помнить, что main - это тоже поток.
Поэтому можно использовать main в качестве потока для обработки каких-либо действий.
 */

public class CreatingThreadWithMain extends Thread implements Runnable { // так не пишется, но это для примера.
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        CreatingThreadWithMain threadExtends = new CreatingThreadWithMain();
        //thread1.start();
        Thread threadImplements =  new Thread(new CreatingThreadWithMain());
        threadImplements.start();
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
