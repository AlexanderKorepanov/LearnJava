package lambda_expression.part1;

public class SomeTest {
    static void def(Some some) {
        System.out.println(some.abc("Hello"));
    }
    static void def2(Some2 some2) {
        System.out.println(some2.x());
    }

    public static void main(String[] args) {
        final int i = 12; // Эта переменная видна в ЛВ. Она обязательно должна быть конечной(effectively final).
        //String str = "abc"; Если объявить эту переменную, то будет checked exception в ЛВ.
        def((String str) -> {return str.length() + i;});
        def2(() -> 12);
    }
}
// Функциональный интерфейс.
interface Some {
    int abc(String s);
}
//Если метод ФИ ничего не принимает в параметр, то в ЛВ слева просто указываются пустые ().
interface Some2 {
    int x();
}
/*
Метод abc принимает параметр String - "Hello" в методе def, который принимает в качестве параметра объект ФИ Some.
Далее мы вызываем метод def в main c параметром String и реализацией метода abc через лямбда-выражение (ЛВ)
return type соответственно должны совпадать (тип int).

 */