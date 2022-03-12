package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Chaining method - позволяет оформлять цепочку из методов stream().
Промежуточные методы stream - intermediate методы.
Конечный метод должен быть обязательно terminal - конечный (reduce(), forEach() и прочее.)
 */
public class MethodChaining {
    public static void main(String[] args) {
        int [] array = {33, 56, -9, 0, -42, 15, 23, 18, -12};
        int result = Arrays.stream(array).map(e -> e % 3).filter(e -> e > 0).reduce((a,e) -> a+e).getAsInt();
        System.out.println(result);
        int [] array2 = Arrays.stream(array).filter(e -> e > 0).map(e -> {
            if (e%3 == 0) {
                e = e / 3;
            }
            return e;})
                .toArray();
        System.out.println(Arrays.toString(array2));

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
        /*
        Применим chaining() к коллекции студентов.
        map() - делает прописные буквы в имени, filter() - фильтрация элементов по женскому полу,
        sorted() - сортировка элементов по возрасту, collect() - создание stream в коллекцию.
         */
        List<Student> students = list.stream().map(element -> {
                element.setName(element.getName().toUpperCase()); return element;})
                .filter(e -> e.getSex() == 'f')
                .sorted((x,y) -> x.getAge() - y.getAge()).collect(Collectors.toList());
        System.out.println(students);

    }
}
