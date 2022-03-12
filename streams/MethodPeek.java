package streams;

/*
Метод peek() - как и метод forEach() принисает в параметр потребителя, но при этом возвращает stream().
Это intermediate метод.
Часто используется для контроля работы метода chaining() - цепочки streams.
 */

import java.util.stream.Stream;

public class MethodPeek {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 4, 3, 2);

        // Здесь метод peek() выводит уникальные элементы stream, после обработки начального stream методом distinct().
        System.out.println(stream.distinct().peek(System.out :: println).count());
    }

}
