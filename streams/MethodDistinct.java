package streams;

/*
Возвращает stream уникальных элементов, которе проверяет с помощью метода equals().
Это intermediate метод.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MethodDistinct {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        // Создаём поток, который соединяет 2 листа через метод concat().
        Stream<Integer> stream = Stream.concat(list1.stream(), list2.stream());
        // К получившемуся потоку применяем метод distinct().
        stream.distinct().forEach(System.out :: println);
    }
}
