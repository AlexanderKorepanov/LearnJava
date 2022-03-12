package collections.workWithLinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 3);
        Student st2 = new Student("Максим", 5);
        Student st3 = new Student("Светлана", 2);
        Student st4 = new Student("Марина", 1);
        Student st5 = new Student("Алексей", 2);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);

        System.out.println(studentLinkedList);
        System.out.println();
        System.out.println(studentLinkedList.get(2));

        /*
        Методы LinkedList аналогичны методам ArrayList.
        LinkedList используется когда:
        1. Невелико количество операций получения элементов.(метод get()).
        2. Велико количество операций добавления и удаления элементов.(но все равно нужен индивид. подход!)
         */
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "Student " + name + " " + "course " + course;
    }
}
