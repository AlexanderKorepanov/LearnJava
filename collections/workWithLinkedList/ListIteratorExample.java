package collections.workWithLinkedList;

/*
Пример для определения полиндрома - слова, которое пишется одинаково с обоих сторон.
ListIterator - расширяет iterator и необходим для двухстороннего обхода списка.
 */

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "MADAM";
        List<Character> list = new LinkedList<>();

        for (char ch: s.toCharArray()) {
            list.add(ch);
        }

        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean palindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Это полиндром");
        }
        else {
            System.out.println("Это не полиндром");
        }

        // найдём цифру, которая будет общей при двухстороннем поиске (цифра 5)
        Integer [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> integers = new LinkedList<>();
        for (int i: arrays) {
            integers.add(i);
        }

        System.out.println(integers);
        ListIterator<Integer> myIterator = integers.listIterator();
        ListIterator<Integer> myReverseIterator = integers.listIterator(integers.size());

        while (myIterator.hasNext() && myReverseIterator.hasPrevious()) {
            //System.out.println(myIterator.next());
            //System.out.println(myReverseIterator.previous());
            if(myIterator.next() == myReverseIterator.previous()) {
                System.out.println("Это цифра - " + myIterator.previous());
                break;
            }
        }

    }
}
