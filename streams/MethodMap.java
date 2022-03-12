package streams;

import java.util.*;
import java.util.stream.Collectors;

/*
Stream - это последовательность элементов, поддерживающая последовательные и параллельные операции над ними.
Метод map() - позволяет получить из потока те значения, которые задаются ему в параметре через ЛВ.
Метод map() принимает в парамает ФИ Function<T, R>.
Все методы stream сами по себе не меняют коллекцию, они лишь преобразовывают её в поток.
 */

public class MethodMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Tow");
        list.add("Three");
        list.add("Four");
        System.out.println(list);
        List<String> list1 = new ArrayList<>(list); // Этот лист создан для 2-го способа.
        // 1-й способ преобразования строк в их длину. (String -> int)
       for (int i = 0; i < list.size(); i++ ) {
            list.set(i, String.valueOf(list.get(i).length()));
        }
        System.out.println("-----------------------");
        System.out.println(list);


        //2-й способ через stream.
        List<Integer> list2 = list1.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("-----------------------");
        System.out.println(list2);
        System.out.println("Работа с Array");

        //Работа метода map() с массивом.
        //Преобразоание существующего массива в другой, с проверкой деления элемента массива нацело на 3.
        int [] arrays = {6, 4, 3, 9, 12};
        arrays = Arrays.stream(arrays).map(element -> {
            if (element%3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(arrays));
        System.out.println("Работа с Set");

        //Работа с множеством Set. (отсортированная коллекция).
        Set<String> set = new TreeSet<>();
        set.add("One");
        set.add("Tow");
        set.add("Three");
        set.add("Four");
        System.out.println(set);
        Set<Integer> set1 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println("Новая (отсортированная) коллекция set1 из set: " + set1);
        System.out.println("-------------------------");
        System.out.println("Новая коллекция list из set уже без сортировки: " + list3);

    }

}
