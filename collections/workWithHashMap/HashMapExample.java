package collections.workWithHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Александр", "Александров", 3);
        Student st2 = new Student("Иван", "Иванов", 2);
        Student st3 = new Student("Сергей", "Смирнов", 4);
        Student st4 = new Student("Алексей", "Орлов", 2);
        Student st5 = new Student("Александр", "Александров", 3);

        //Создаём HashMap, в котором ключом будет объект типа Student, а значением средняя оценка типа Double.
        Map<Student, Double> map = new HashMap<>();
        map.put(st1, 4.33);
        map.put(st2, 4.78);
        map.put(st3, 3.86);
        map.put(st4, 4.12);
        System.out.println(map);

        boolean result = map.containsKey(st5);
        System.out.println("result = " + result);
        /*
        Несмторя на то, что похожий объект имеется и у нас переопределён метод equals, в HashMap такого объекта
        не обнаружено.(если не переопределён метод hashCode()).
         */

        //Работа метода entrySet():
        for (Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /*
        При создании HashMap можно задать 2 параметра, которые влияют на производительность:
         */
        Map<Integer, String> map1 = new HashMap<>(16, 0.75f);
        // initialCapacity - начальный размер массива, содержащий наши LinkedList(ы)
        // loadFactor - коэффициент того, насколько должен быть заполнен массив, чтобы он увеличился вдвое.
        // 0.75 - это золотая середина.
    }
}

/*
Если мы используем наш созданный класс в качеств ключа, то желательно сделать этот класс final, как и его поля.
В противном случае при изменении какого-либо поля какого-либо объекта, будет меняться его хешкод, хотя это будет все
тот же объект. А так как этот объект выступает в качестве ключа, то мы можем потерять этот объект в нашей коллекции.
 */
final class Student {
    final String name;
    final String surname;
    final int course;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
}