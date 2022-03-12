package streams;
/*
Метод reduce() применяется для агрегирования функций.
На выходе этого метода получаем одно значение.
Метод возвращает Optional, поэтому поучения значения - метод get(), при условии, что reduce() не вернет null.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(-12);
        list.add(0);
        list.add(23);
        list.add(99);
        System.out.println(list);

        int result = list.stream().reduce((accumulator, element) -> accumulator + element ).get();
        System.out.println(result);

        // Для проверки коллекции на null - метод isPresent().
        List<Integer> list1 = new ArrayList<>();
        Optional<Integer> optional = list1.stream().reduce((a,e) -> a * e);
                if (optional.isPresent()) {
                    System.out.println(optional.get());
                }
                else {
                    System.out.println("No Present");
                }
        // Может быть задано начальное значение аккумулятора - параметр identity.
        // Тогда метод get() в конце уже не нужен.
        System.out.println("---------------------");
        int result2 = list.stream().reduce(2, (accumulator, element) -> accumulator + element );
        System.out.println(result2);
        System.out.println("---------------------");
        // Работа конкатенации
        List<String> s = new ArrayList<>();
        s.add("One");
        s.add("Tow");
        s.add("Free");
        s.add("Four");
        String result3 = s.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);
    }
}
