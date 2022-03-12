package collections.workWithHashSet;

import java.util.HashSet;
import java.util.Set;

/*
Не запоминает порядок добавления элементов.
В основе лежит HashMap.
Имеет только ключи, а значения это константы-заглушки.
Не может содержать одинаковые ключи(дубликаты).
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alexander");
        set.add("Dmitriy");
        set.add("Yaroslav");
        set.add("Olgya");
        set.add("Svetlana");
        set.add("Olgya"); // это значение-оно не будет добавлено.
        set.add(null); // может содержать null.
        System.out.println(set);

        //Методы Set (основные).
        set.remove(null);
        System.out.println("После удаления: " + set);
        System.out.println();
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Размер коллекции: " + set.size());
        System.out.println();

        System.out.println("Проверка пуста ли наша коллекция: " + set.isEmpty());
        System.out.println();

        System.out.println("Содержится ли указанный элемент в колекции: " + set.contains("Alexander"));

        HashSet<Integer> integers = new HashSet<>();
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(4);
        integers.add(3);

        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);

        // Коллекция, которая объединяет все элементы.
        HashSet<Integer> union = new HashSet<>(integers);
        union.addAll(integers1);
        System.out.println(union);

        //метод проверки наличия общих элементов 2-х коллекций.
        HashSet<Integer> intersect = new HashSet<>(integers);
        intersect.retainAll(integers1);
        System.out.println(intersect);

        //Метод, который позволяет определить разность элементов между одной коллекцией относительно другой.
        HashSet<Integer> subtract = new HashSet<>(integers);
        subtract.removeAll(integers1);
        System.out.println(subtract);





    }
}
