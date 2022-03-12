package multithreading.methodThread;

/*
Методы getName(), setName() - предназначены для идентификации имени потока.
Методы getPriority(). setPriority() - предназначены для идентификации приоритета потока.
default значение имени - Thread-0 (1, 2, 3, 4....)
default значение приоритета - 5 (в целом приоритет от 1-10)
 */

public class MethodNamePriority {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("Default значение имени потока: " + thread.getName() + " , " + "Default значение " +
                "приоритета потока: " + thread.getPriority());
        thread.setName("First thread");
        System.out.println("Имя нашего потока: " + thread.getName());
        thread.setPriority(9);
        System.out.println("Приоритет нашего потка: " + thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY); // готовый вариант установки приоритета.
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}
