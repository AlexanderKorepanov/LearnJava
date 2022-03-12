package collections.workWithHashSet;
/*
Хранит элементы в отсортированном по возрастанию порядке.
В основе лежит TreeMap.
Хранит только ключи, а значения - "заглушка".
Не допускает дубликаты.
Не может содержать значения null.
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(16);
        set.add(5);
        set.add(11);
        set.add(1);
        System.out.println(set);
        System.out.println();

        Student st1 = new Student("Oleg", 3);
        Student st2 = new Student("Alexander", 5);
        Student st3 = new Student("Marina", 4);
        Student st4 = new Student("Ivan", 1);
        Student st5 = new Student("Danila", 2);

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println(treeSet);
        System.out.println();
        System.out.println("Элемент в начале коллекции: " + treeSet.first());
        System.out.println("Элемент в конце коллекции: " + treeSet.last());
        System.out.println("Отрезок от меньше заданного элемента : " + treeSet.headSet(st1));
        System.out.println("Отрезок от больше заданного элемента, включая его: " + treeSet.tailSet(st1));
        System.out.println("Отрезок между указанными элементами, включая перавый: " + treeSet.subSet(st5, st2));
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.course - otherStudent.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
