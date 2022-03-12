package streams;

/*
Метод mapToInt() - возвращает int stream, т.е. stream, содержащий значения типа int.
Это intermediate метотод.
Для конвертации значений int в Integer - используется метод boxed().
Метод mapToInt() содержит свои методы - sum(), min(), max(), average() - ср. арифметическое.
Методы min() и max() для возвращения значчения типа int должны содержать в конце метод getAsInt().
Также существуют методы mapToDouble(), mapToLong() и похожие...
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodMapToInt {
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

        List<Integer> integerList = list.stream().mapToInt(el -> el.getAge()).boxed().collect(Collectors.toList());
        System.out.println(integerList);
        System.out.println("----------------------------");
        System.out.println(list.stream().mapToInt(el -> el.getCourse()).sum());
        System.out.println("----------------------------");
        System.out.println(list.stream().mapToInt(el -> el.getAge()).max().getAsInt());
        System.out.println("----------------------------");
        System.out.println(list.stream().mapToDouble(el -> el.getAvgGrade()).min().getAsDouble());
        System.out.println("----------------------------");
        double sum = list.stream().mapToDouble(el -> el.getAvgGrade()).sum();
        System.out.println(sum / list.size());

    }
}
