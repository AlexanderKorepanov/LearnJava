package multithreading.creatingThread;

/*
Можно создавать потоки через анонимные классы и через лямбда-выражения.
 */

public class CreatingThreadWithSome {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Это поток через анонимный класс");
            }
        }).start();
        // Так как Runnable - это ФИ, то можно использоват ЛВ.
        new Thread(() -> System.out.println("Это поток через лямбда-выражение")).start();
    }

}
