package streams;

/*
Метод count() - Считывает количество элементов в stream и возвращает long.
Это terminal метод.
 */

import java.util.stream.Stream;

public class MethodCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        // Метод выводит количество элементов, содержащихся в потоке.
        System.out.println(stream.count());

        /*
        Важное правило!!!!!
        Любой stream после какой-либо обработки - нельзя переиспользовать
         */
        //Эта строка вызовет ошибку - System.out.println(stream.distinct().count());
        System.out.println(stream1.distinct().count());
    }
}
