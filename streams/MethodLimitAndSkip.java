package streams;

/*
Метод limit() - Ограничивает количество элементов в stream. Оставляет только первые n элементов.
Метод skip() - Ограничивет количесвто элементов в stream, но при этом "пропускает" первые n элементов.
Это intermediate метод.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MethodLimitAndSkip {
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

        list.stream().filter(el -> el.getAge() > 20).limit(2).forEach(System.out :: println);
        System.out.println("-----------------------------");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.limit(5).forEach(System.out :: println);
        System.out.println("-----------------------------");
        stream1.skip(5).forEach(System.out :: println);
        System.out.println("-----------------------------");
        list.stream().filter(el -> el.getAge() > 19).skip(1).forEach(System.out :: println);
    }
}
