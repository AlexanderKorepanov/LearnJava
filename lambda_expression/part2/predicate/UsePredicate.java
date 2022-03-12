package lambda_expression.part2.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
ФИ Predicate - готовый интерфейс для работы с типом объектов, указанным пользователем.

 */

public class UsePredicate {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 4, 4.5);
        Student st2 = new Student("Svetlana", 'f', 21, 3, 4.8);
        Student st3 = new Student("Igor", 'm', 19, 2, 4.0);
        Student st4 = new Student("Olga", 'f', 20, 3, 4.2);
        Student st5 = new Student("Aleksey", 'm', 23, 5, 3.7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Test test = new Test();
        test.getInfoOfStudents(students, e -> e.avgGrade > 4.2);
        System.out.println("------------------------");

        // Методы, работающие с Predicate.
        Predicate<Student> p1 = e -> e.avgGrade < 4.0;
        Predicate<Student> p2 = e -> e.age > 20;
        System.out.println("Работа метода and() - объединение 2-х условий Predicate (объект должен удовлетворять " +
                           "обоим условиям: ");
        test.getInfoOfStudents(students, p1.and(p2));
        System.out.println("------------------------");
        System.out.println("Работа метода or() - соединение 2-х условий (объект удовлетворяет хотя бы одному условию): ");
        test.getInfoOfStudents(students, p1.or(p2));
        System.out.println("------------------------");
        System.out.println("Работа метода negate() - условие, противоположное заданному: ");
        test.getInfoOfStudents(students, p1.negate());
    }
}

class Test {
    public void getInfoOfStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s: al) {
            if(pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
