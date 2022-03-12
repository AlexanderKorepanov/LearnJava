package collections.workWithQueue;

/*
Служит для создания очереди по приоритетам на основании компаратора очереди.
Для обычных классов-оболочек - используется натуральный порядк сортировки.
Для сложных объектов - через компаратор.
При выводе на экран - сортировки нет.
Сортировка происходит только при использовании(обработке) элементов.
Элемент с наивысшим приоритетом будет использован в первую очередь.
 */

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.SortedSet;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(-56);
        priorityQueue.add(23);
        priorityQueue.add(-2);
        priorityQueue.add(1);
        System.out.println(priorityQueue);
        System.out.println("Первый элемен в очереди: " + priorityQueue.peek());

        PriorityQueue<Student> pq = new PriorityQueue<>();
        Student st1 = new Student("Alexander", 5);
        Student st2 = new Student("Marina", 3);
        Student st3 = new Student("Ivan", 2);
        Student st4 = new Student("Olga", 1);
        pq.add(st1);
        pq.add(st2);
        pq.add(st3);
        pq.add(st4);
        System.out.println(pq);
        System.out.println();
        System.out.println("Первый элемент в pq: " + pq.peek());
        System.out.println(pq);
        //Удалим все элементы.
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.course - otherStudent.course;
    }
}