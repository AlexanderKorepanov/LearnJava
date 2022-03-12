package lambda_expression.part2.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
Predicate используется с методом RemoveIf(), который в качестве параметра сам по себе принимает Predicate.
 */

public class PredicateRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Александр");
        arrayList.add("Дмитрий");
        arrayList.add("Константин");
        arrayList.add("Яна");
        arrayList.add("Игорь");
        System.out.println(arrayList);
        arrayList.removeIf(e -> e.length() < 6);
        System.out.println("-----------------------");
        System.out.println(arrayList);

        //Можно таким образом.
        Predicate<String> p = e -> e.length() < 10;
        arrayList.removeIf(p);
        System.out.println("-----------------------");
        System.out.println(arrayList);
    }



}
