package useComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//сортировка списка.

public class UseSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alexander");
        list.add("Yuliya");
        list.add("Esenya");
        System.out.println("Перед сортировкой");
        System.out.println(list);
        System.out.println("После сортировки");
        Collections.sort(list);
        System.out.println(list);
    }
}




