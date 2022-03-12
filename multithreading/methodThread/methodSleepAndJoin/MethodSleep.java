package multithreading.methodThread.methodSleepAndJoin;

/*
Метод sleep() - позволяет приостановить выполнение указанного потока на определённое время.
При использовании метода sleep() - обязательная обработка исключения InterruptedException через блок try/catch, либо
через throws в сигнатуре метода.
InterruptedException - возникает в том случае, если происходит попытка приостановить поток, который итак находился
в прерванном состоянии.

 */

public class MethodSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++ ) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Поехали!!!");
    }

}
