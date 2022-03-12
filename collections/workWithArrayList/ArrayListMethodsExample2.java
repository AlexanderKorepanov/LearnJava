package collections.workWithArrayList;

//Методы ArrayList часть 2.

import java.util.ArrayList;

public class ArrayListMethodsExample2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("def");
        arrayList.add("ghi");
        System.out.println(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("SomeWord1");
        arrayList1.add("SomeWord2");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        //Метод addAll():

        //Добавление в коллекцию другой коллекции.
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

        // Добавление коллекции по указанному индексу.

        arrayList.addAll(1, arrayList2);
        System.out.println(arrayList);

        //Метод clear(): удаление содержимого коллекции.
        System.out.println("Коллекция arrayList2 до очистки");
        System.out.println(arrayList2);
        arrayList2.clear();
        System.out.println("Коллекция arrayList2 после очистки");
        System.out.println(arrayList2);

        // Метод indexOf() - возвращает позицию объекта. Поиск объекта происходит через метод equals!
        //Если объект не найден, то возвращается -1.
        System.out.println("Поиск позиции объекта");
        System.out.println(arrayList.indexOf("def")); // в String ссылки на одинаковые строки равны.
        // Метод lastIndexOf() - возвращает последнее найденное совпадение.

        //Метод size() - возвращает размер коллекции.
        System.out.println("Размер коллекции arrayList1 равен: " + arrayList1.size());

        // Метод isEmpty() - возвращает true, если коллекция пуста.
        System.out.println("Работа метода isEmpty: " + arrayList2.isEmpty());

        //Метод contain() - проверяет наличие объекта в коллекции.
        System.out.println("Работа метода contains: " + arrayList.contains("abc"));
    }
}
