package multithreading.methodThread;

/*
Ключевое слово volatile - применяется для переменных и позволяет хранить значение этой переменной в main memory, а
не в кэшах потоков.
Это позволяет обращаться потокам к значению переменной volatile, хранящееся в main memory и таким обазом будет
исключена рассинхронизация потоков по значению этой переменной.
Для синхронизации значения переменной между потоками ключевое слово volatile используется тогда, когда только один
поток может изменять значекние этой переменной, а остальные потоки могут его только читать.

 */

public class UseVolatile extends Thread {
    volatile boolean x = true;
    public void run() {
        long counter = 0;
        while (x) {
            counter++;
        }
        System.out.println("Работа завершена" + " " + counter);
    }


    public static void main(String[] args) throws InterruptedException {
        UseVolatile thread = new UseVolatile();
        thread.start();
        Thread.sleep(3000); // Это вызывается для потока main.
        System.out.println("После сна потока main в 3 секунды - ПРОСЫПАЕМСЯ!!!");
        thread.x = false;
        thread.join();
        System.out.println("Завершение работы");
    }
}
