package streams;

/*
Метод min() и max() - позволяеют вернуть минимальное и максимальное значение stream (коллекции).
Это terminal методы.
Возвращает Optional => используем метод get() в конце.
Для сложных объектов в параметре метода min(), max() задаём comparator.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MethodMinMax {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 4, 4.5);
        Student st2 = new Student("Svetlana", 'f', 21, 3, 4.8);
        Student st3 = new Student("Igor", 'm', 19, 2, 4.0);
        Student st4 = new Student("Olga", 'f', 20, 3, 4.2);
        Student st5 = new Student("Aleksey", 'm', 23, 5, 3.7);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        System.out.println(list.stream().min((el1, el2) -> el1.getName().compareTo(el2.getName())).get());

        Stream<Integer> stream = Stream.of(23, 34, 45, 12, 21);
        System.out.println(stream.max((x,y) -> x - y).get());
    }
}
