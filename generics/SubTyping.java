package generics;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {
    public static void main(String[] args) {
        X x = new Y(); //так писать можно, т.к. класс Y extends класс X.
        List<X> list = new ArrayList<>(); // это работает, т.к. по умолчанию у ArrayList  в <> идет тоже X.
        // List<X> list1 = new ArrayList<Y>(); - так не работает.

        Sum<Integer> list2 = new Sum<>(12, 56);
        System.out.println(list2.getNumber1() + "   "  + list2.getNumber2());
        int i = list2.getNumber1() + list2.getNumber2();
        System.out.println(i);

        Sum<Double> list3 = new Sum<>(123.345, 23.543);
        System.out.println(list3.getNumber1() + "   "  + list3.getNumber2());
        double d = list3.getNumber1() + list3.getNumber2();
        System.out.println(d);

        //Sum<String> list3 = new Sum<String>(); - эта строка работать не будет, т.к. Sum не может принимать String.

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(56);
        // метод может работать только с подклассами класса Number.
        int ii = SomeClass.getFirstElement(arrayList);
        System.out.println(ii);

        ArrayList<String> abc = new ArrayList<>();
        abc.add("Hello");
        //System.out.println(SomeClass.getFirstElement(abc)); - тут метод не работает, т.к. String.
    }
}

/*
Создадим параметризованный класс с конструктором и методом. Параметр данного класса может принимать на вход только
классы-наследники класса Number (Integer, Long, Double, Float)
 */

class Sum <T extends Number> {
    private T number1;
    private T number2;

    public Sum(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1() {
        return number1;
    }
    public T getNumber2() {
        return number2;
    }
}

// Создадим класс и параметризированный метод:

class SomeClass {
    public static <T extends Number> T getFirstElement(ArrayList<T> arrayList){
        return arrayList.get(0);
    }
}

/*
Можно создать параметризированный класс, который будет как наследовать класс и имплементить интерфейс. Сигнатура такая:
 */

class MyClass <T extends Number&I1&I2> { // на первом месте всегда идёт класс, потом интерфейсы.

}

interface I1 {}
interface I2 {}


class X {

}

class Y extends X {

}