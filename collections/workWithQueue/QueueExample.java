package collections.workWithQueue;

/*
Определяет поведение очереди, которая действует как список по принципу перваоочередности и последовательности обработки.
Использует правило FIFO (First in - firs out).
*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(-34);
        queue.add(5);
        queue.add(7);
        queue.add(1);
        queue.offer(21); // метод offer также добавляет элемент, но не выбрасываент exception, если коллекция ограничена.
        System.out.println(queue);
        System.out.println("Удалился первый в коллекции элемент: " + queue.remove());
        System.out.println(queue);
        //Метод poll() - также удаляет элемент, но не выбрасывает exception, когда элементы закончатся.
        System.out.println("Удалился первый в коллекции элемент: " + queue.poll());
        System.out.println(queue);
        System.out.println("Первый элемент в коллекции: " + queue.element());
        //Метод peek() - также выводит первый элемент, но не выводит exception, если очредь пуста.
        System.out.println("Первый элемент в коллекции: " + queue.peek());
    }
}
