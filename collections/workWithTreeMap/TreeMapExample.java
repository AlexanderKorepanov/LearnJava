package collections.workWithTreeMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

/*
TreeMap позволяет создавать отображения в древовидной структуре, хранит элементы пар ключ/значение.
Элементы хранятся в отсортированном порядке по возрастанию.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Дмитрий", "Комаров", 3);
        Student st2 = new Student("Александр", "Александров", 3);
        Student st3 = new Student("Иван", "Иванов", 5);
        Student st4 = new Student("Сергей", "Смирнов", 4);
        Student st5 = new Student("Алексей", "Орлов", 2);
        Student st6 = new Student("Александр", "Александров", 3);
        treeMap.put(4.6, st1);
        treeMap.put(4.2, st2);
        treeMap.put(3.6, st3);
        treeMap.put(4.9, st4);
        treeMap.put(3.5, st5);
        //значения в TreeMap могут быть не уникальными. st6 = st2;
        treeMap.put(4.7, st6);

        System.out.println(treeMap);
        System.out.println();
        Student st7 = new Student("Пётр", "Петров", 4);
        //Ключи в TreeMap являются уникальными. ключ st7 = ключу st3.
        treeMap.put(3.6, st7);
        //Значение элемента 2 - st3, перезапишется на элемент 6 - st7.
        System.out.println(treeMap);

        //Вывод значения.
        System.out.println(treeMap.get(4.2));
        //удаление элемента.
        treeMap.remove(4.9);
        System.out.println("После удаления элемента");
        System.out.println(treeMap);
        System.out.println();
        //Разворачивание TreeMap по убыванию(ключей соответственно)
        System.out.println(treeMap.descendingMap());
        System.out.println();

        //Получение отрезка TreeMap от значения и до хвоста.
        System.out.println(treeMap.tailMap(4.2));
        System.out.println();

        //Получение отрезка от головы и до значения.
        System.out.println(treeMap.headMap(4.2));
        System.out.println();

        //Получение первого и последнего элементов соответственно.
        System.out.println("Первый элемент = " + treeMap.firstEntry() + " " + "Последний элемент = " + treeMap.lastEntry());
        System.out.println();

        /*
        Создадим TreeMap, где в качестве ключа идет сложный объект - Student. Для этого TreeMap необходимо
        задать компаратор для объектов класса, который идет в качестве ключа.
        */
        /* Либо так.
        TreeMap<Student, Integer> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        */
        TreeMap<Student, Double> treeMap1 = new TreeMap<>();
        treeMap1.put(st1, 4.4);
        treeMap1.put(st2, 4.9);
        treeMap1.put(st3, 3.4);
        treeMap1.put(st4, 4.1);
        treeMap1.put(st5, 5.0);
        treeMap1.put(st6, 3.7);
        System.out.println(treeMap1);

    }

}


class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    // Переопределение данных методов необязательно, но является хорошим тоном программирования, т.к.
    // в TreeMap все методы работают через компаратор.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student otherName) {
        return this.name.compareTo(otherName.name);
    }
}