package generics;

//Параметризированный метод.

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        String s = GenMethod.getSecondElement(list);
        System.out.println(s);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(13);
        list2.add(14);

        System.out.println(GenMethod.getSecondElement(list2));
    }
}

class GenMethod {
    // Объявление параметризированного метода.
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1); // возвращает 2-й элемент листа типа ArrayList.
    }
}

// Объявим параметризированный метод, содержащий параметризированный метод:
class ParamClass <V> {
    private V val1;

    public V otherParamMethod(V val1) {
        return val1;
    }
}

/*
Если в параметризированном классе содержится параметризированный метод, то у этого метода можно не указывать
указатель типа, т.к. Java итак понимает с каким типом работает данный метод и берет его из класса.
 */