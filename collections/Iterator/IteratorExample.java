package collections.Iterator;

/*
Iterator - Повторитель. Помогает организовать цикл для перебора элементов коллекции.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Иван");
        strings.add("Мария");
        strings.add("Надежда");
        strings.add("Константин");
        strings.add("Марк");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(34);
        integers.add(56);
        integers.add(78);
        integers.add(90);
        System.out.println(integers);

        Iterator<Integer> iterator1 = integers.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove(); // с помощью итератора можно удалять элементы коллекции. - главное отличие от цикла
                                //for, for-each.
        }
        System.out.println(integers);
    }
}
