package streams;

/*
Метод stream forEach() возвращает void.
Позволяет осуществить проход по всем элементам коллекции или массива и совершить определенные операции на этими эл-ми.
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodForEach {
    public static void main(String[] args) {
        int [] array = {2, 5, 1, 21, 23, 4};
        Arrays.stream(array).forEach(e -> {e*=2; System.out.println(e);});
        System.out.println("------------------");
        // Пример метода ссылки (reference method).
        Arrays.stream(array).forEach(System.out :: println);
        System.out.println("------------------");
        //2-й пример метода-ссылки (наглядный).
        Arrays.stream(array).forEach(SomeClass :: myMethod);

        // stream не обязательно создавать из готовой коллекции или массива.
        Stream<Integer> myStream = Stream.of(23, -12, 4, 0, -22, 65, -8);
        List<Integer> list = myStream.filter(e -> e > 0 ).collect(Collectors.toList());
        System.out.println(list);
    }
}

class SomeClass {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Элемент = " + a);
    }
}
