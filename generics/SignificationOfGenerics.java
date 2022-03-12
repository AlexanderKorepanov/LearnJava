package generics;

/*
Значение Generics:
1. Типовая безопасность;
2. Нет необходимости в явном приведении типов;
3. Ошибки определяются на уровне компиляции;
4. Нет дублирования кода.

<> - diamond (бриллиант) - параметризация (Generics).
 */

import java.util.ArrayList;
import java.util.List;

public class SignificationOfGenerics {
    public static void main(String[] args) {
        // указывается конкретный тип объектов, и можно добавлять только этот тип объектов.
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Buy");
        list.add("Stop");
        //list.add(3); - это строка вызовет ошибку еще на стадии компиляции.
        System.out.println(list);

        //list.add(new Station()); - это строка также вызовет ошибку.

        //создадим лист без использования generics:

        List list1 = new ArrayList();
        list1.add("Break");
        list1.add("Hello");
        list1.add("Wow");

        /*
        Это строка будет вызывать ошибку, причем только на уровне компиляции кода, т.к невозможно произвести
        downcast объекта Station и вывести его длину.
        list1.add(new Station());


        */
       for (Object o: list1) { // Здесь в цикле приходится использовать Object, т.к. в list1 у нас Object.
           System.out.println(o + " Длина слова: " + ((String) o).length());
       }
    }
}

class Station {
}
