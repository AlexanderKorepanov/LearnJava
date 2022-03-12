package multithreading.creatingThread;

/*
2 варианта создания потоков.
1) Через создание своего класса с extends класса Thread.
Далее необходимо переопределить метод run(). Создать экземпляр класса и вызвать на нём метод start().
2) Через использование интерфейса Runnable.
Создаём класс с имплементацией интерфейса, переопределяем метод run(), создаем экземпляр класса Thread и предаём ему в
параметр экземпляр созданного нами класса. Далее запускаем созданный поток через метод start().

 */

public class CreatingThread {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
//        myThread1.start(); // Это работа первых 2-х методов.
//        myThread2.start();

        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread3());
        thread1.start();
        thread2.start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
