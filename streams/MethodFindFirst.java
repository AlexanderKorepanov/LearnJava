package streams;

/*
Метод findFirst() - позволяет возвратить первый элемент stream.
Это terminal метод.
Метод findFirst() возвращает Optional -> используем метод get() в конце.
Если есть вероятность, что stream пустой - то используем метод isPresent().
 */

import java.util.stream.Stream;

public class MethodFindFirst {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("One", "Tow", "Three", "Four");
        System.out.println(stream.findFirst().get());
    }


}
