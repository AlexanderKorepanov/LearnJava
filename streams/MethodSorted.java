package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Метод sorted() применяется для сортировки.
 */
public class MethodSorted {
    public static void main(String[] args) {
        int [] array = {45, 2, 0, -21, -99, 65, 34, -11, -1};
        int [] array2 = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array2));

        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 4.4);
        Student st2 = new Student("Alexander", 'm', 23, 4, 4.7);
        Student st3 = new Student("Valeriya", 'f', 21, 2, 5.0);
        Student st4 = new Student("Olga", 'f', 24, 5, 4.1);
        Student st5 = new Student("Nikolay", 'm', 22, 3, 3.7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        //Для сложных объектов в параметра метода sorted() задаётся  компаратор.
        System.out.println("Сортировка по имени: ");
        List<Student> studentList = students.stream().sorted((x,y) ->
                x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(studentList);
        List<Student> studentList2 = students.stream().sorted((x,y) ->
                x.getAge() - y.getAge())
                .collect(Collectors.toList());
        System.out.println("Сортировка по возрасту: ");
        System.out.println(studentList2);
    }
}
