package collections.workWithHashMap;

import java.util.HashMap;

public class HashMapExampleMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1234, "Сергей Смирнов");
        map1.put(2222, "Иван Иванов");
        map1.put(3412, "Фёдр Фёдоров");
        map1.put(5671, "Дмитрий Сидоров");
        map1.put(2567, "Дмитрий Сидоров"); // значения могут быть одинаковы, при этом ключи разные.
        map1.put(null, "Олег Олегов"); // значение или ключ могут быть null
        map1.put(4231, null);
        System.out.println(map1);
        //Если добавить элемент с уже существующим ключом, то значение перезапишется.
        // Перезапишем 1-й элемент.
        map1.put(1234, "Алксей Орлов");
        System.out.println(map1);

        //Метод putIfAbsent() - добавляет элемент в коллекцию при условии, что такого элемента еще нет в коллекции.
        map1.putIfAbsent(3412, "Роман Романов"); // этот элемент не будет добавлен.
        System.out.println(map1);
        System.out.println();
        // Метод get() - вывод значения по ключу.
        System.out.println("Значение ключа 2222: " + map1.get(2222));
        System.out.println("Если такого ключа нет то вывод: " + map1.get(9999));

        //Метод remove() - удаление элемента по ключу.
        map1.remove(2567);
        System.out.println("После удаления элемента");
        System.out.println(map1);
        System.out.println();

        // Метод containsKey() и containsValue() - проверка наличия элемента в коллекции по ключу и по значению.

        System.out.println("Элемент с ключом 3412 существует? " + map1.containsKey(3412));
        System.out.println("Элемент со значением 'Вадим Поляков'? " + map1.containsValue("Вадим Поляков"));
        System.out.println();

        //Метод keySet() и values() - возвращает множество всех ключей и значений.
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        //Метод entrySet() - позволяет вывести ключ и его значение. Реализация в уроке HashMapExample
    }
}
