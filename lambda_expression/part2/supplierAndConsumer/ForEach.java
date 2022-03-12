package lambda_expression.part2.supplierAndConsumer;

//ФИ Consumer очень хорошо работает с методом forEach().

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Horse", "Frog", "Elephant", "Tiger");

        // Как можно, вариант 1:
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        //2-й вариант:
        list.forEach(str -> System.out.println(str));
        System.out.println("--------------------");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.forEach(integer -> {
            System.out.println(integer);
            integer*=2;
            System.out.println(integer);
        });
    }
}
