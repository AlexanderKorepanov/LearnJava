package collections.workWithArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsExample3 {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("A");
        StringBuilder st2 = new StringBuilder("B");
        StringBuilder st3 = new StringBuilder("C");
        StringBuilder st4 = new StringBuilder("D");
        StringBuilder[] array = {st1, st2, st3, st4};

        // Метод asList() - позволяет получить коллекцию из массива объектов. Эта коллекция имеет конечный размер.
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        //Если изменить элемент массива, то изменения отобразятся в коллекции.
        array[0].append("!!!");
        System.out.println(list);
        array[3] = new StringBuilder("F");
        System.out.println(list);

        /*
        Метод removeAll() - удаляет все те элементы в коллекции(основной - которая принимает в параметр коллекцию),
        содержащиеся в коллекции, которая идет в качестве параметра.
        */
        System.out.println("Работа с методом removeAll");
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(12);
        ar1.add(15);
        ar1.add(17);
        ar1.add(19);
        System.out.println(ar1);
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(17);
        ar2.add(19);
        System.out.println(ar2);
        ar1.removeAll(ar2);
        System.out.println(ar1);

        System.out.println("Работа с методом retainAll");
        /*
        Метод retainAll() - оставляет только все те элементы в коллекции(основной - которая принимает в параметр коллекцию),
        содержащиеся в коллекции, которая идет в качестве параметра.
        */
        ar1.add(17);
        ar1.add(19);
        System.out.println(ar1);
        ar1.retainAll(ar2);
        System.out.println(ar1);

        //Метод containAll() - проверяет содержание коллекции на наличие элементов в коллекции, которая поступила
        //в качестве параметра.
        System.out.println();
        System.out.println(ar1.containsAll(ar2));

        /*
        Метод subList() - возвращает отрывок коллекции из имеющейся. При этом последний элемент не включается.
        При этом созданная коллекция является представлением своей основной коллекции и не может существовать вне её.
        */

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Иван");
        strings.add("Мария");
        strings.add("Сергей");
        strings.add("Николай");
        System.out.println(strings);
        List<String> myList = strings.subList(1, 3);
        System.out.println(myList);
        myList.add("Фёдор");
        System.out.println(strings);
        System.out.println(myList);

        //Теперь если добавть элемент в коллекцию strings, и вывести коллекцию myList, то будет runTimeException
        strings.add("Светлана");
        System.out.println(strings);
        //System.out.println(myList); - эта строка вызывает ошибку.

        //Метод toArray() - возвращает массив из коллекции
        Object[] arrays = strings.toArray();
        System.out.println();
        //Метод toArray() - который возвращает массив заданного типа.
        System.out.println("Работа метода toArray, возвращающего массив заданного типа");
        String[] arrays1 = strings.toArray(new String[0]); // лучше писать 0, т.к. Java сама создаст массив нужного размера.
        for (String s: arrays1) {
            System.out.println(s);
        }

        //Метод ListOf() - создаёт коллекцию с указанными элементами.
        //Метод List.copyOf() - создаёт коллекцию из скопированных элементов указанной коллекции в параметре.

        System.out.println();
        List<Integer> list1 = List.of(23, 45, 67);
        System.out.println("Работа метода listOf(): " + list1);
        //list1.add(1); - это строка вызовет ошибку, т.к. list1 видоизменять нельзя.

        List<String> list2 = List.copyOf(strings);
        System.out.println("Работа метода List.copyOf: " + list2);



    }
}
