package streams;

import java.util.*;
import java.util.stream.Collectors;
/*
Метод filter() у stream.
Осуществляет фильтр данных коллекции, массива.
В параметр принимает Predicate.
 */

public class MethodFilter {
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
        List<Student> list1 = list.stream().filter(e -> e.getAge() > 20 && e.getAvgGrade() > 4).collect(Collectors.toList());
        System.out.println(list1);
        Student [] students =  list1.toArray(new Student[0]);
        for (Student student : students) {
            System.out.println(student);
        }

        Set<Student> set = list.stream().filter(e -> e.getSex() == 'm').collect(Collectors.toSet());
        System.out.println("---------------------");
        System.out.println(set);
    }
}

