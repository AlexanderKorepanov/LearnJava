package streams;

/*
Метод collect() - позволяет преобразовать stream в другую коллекцию.
Это terminal метод.
Содержит 2 метода:
1. groupingBy() - позволяет преобразовать stream в коллекцию по какому-либо показателю (общему условию).
2. partitioningBy() - позволяет "разделить" stream на 2 группы (false, true условию).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodCollect {
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
       
        /*
        Работа метода groupingBy().
        Сделаем имена students в коллекции заглавными буквами через метод map().
        И далее сделаем фильтрацию элементов по курсу с созданием коллекций по этой фильтрации.
        Получится 4 коллекции.
        В итоге получается Map, где ключом выступает Integer (курс), а значением List<Student>.
         */
        Map<Integer, List<Student>> map = list.stream().map(el -> {el.setName(el.getName().toUpperCase()); return el;}).
                collect(Collectors.groupingBy(e -> e.getCourse()));
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
        System.out.println("--------------------------------------");
        /*
        Работа метода partitioningBy().
        stream делится по boolean условию.
        Тут мы получаем Map, где ключом выступает Boolean, а значением List<Student>.
         */
        Map<Boolean, List<Student>> map1 = list.stream().collect(Collectors.partitioningBy(e -> e.getAvgGrade() > 4.1));
        for (Map.Entry<Boolean, List<Student>> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
