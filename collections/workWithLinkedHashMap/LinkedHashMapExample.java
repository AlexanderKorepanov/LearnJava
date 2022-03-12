package collections.workWithLinkedHashMap;

import java.util.LinkedHashMap;

/*
Создаёт связный список элементов, располагаем в коллекции в том порядке, в котором они были введены.
Также позволяет хранить информацию о порядке использования элементов (в методах, например)
 */

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        /*
        initialCapacity - размер массива LinkedHashMap, содержащего LinkedList(ы)
        loadFactor - значение заполнения, при котором массив увеличивается вдвое.
        accessOrder - true - элементы коллекции будут храниться в порядке использования. (динмаическое хранение)
                    - false (по-умолчанию) элементы будут храниться в порядке добавления.
         */
        Student st1 = new Student("Дмитрий", "Комаров", 3);
        Student st2 = new Student("Александр", "Александров", 3);
        Student st3 = new Student("Иван", "Иванов", 5);
        Student st4 = new Student("Сергей", "Смирнов", 4);


        lhm.put(3.4, st1);
        lhm.put(4.4, st2);
        lhm.put(3.7, st3);
        lhm.put(3.2, st4);
        System.out.println(lhm);
        System.out.println(lhm.get(3.7));
        System.out.println(lhm.get(4.4));
        System.out.println(lhm); // вот тут видно, что при accessOrder = true, последними выводятся элементы, которые
                                 // были использованы последними.
    }
}

class Student {
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

}