package collections.workWithHashSet;

/*
Является наследником HashSet.
Хранит информацию о порядке добавления элементов.
В основе лежит HashMap, где ключи - это элементы LinkedHashSet, а значения - заглушка.
Нет поддержки accessOrder, который позволял выстраивать последовательность в порядке использования элементов.
 */

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(4);
        lhs.add(-34);
        lhs.add(677);
        lhs.add(2);
        lhs.add(66);
        System.out.println(lhs);

    }
}
