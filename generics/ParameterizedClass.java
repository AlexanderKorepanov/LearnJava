package generics;

// Параметризированный класс.

public class ParameterizedClass {
    public static void main(String[] args) {
        Info <String> info = new Info<>("Hello");
        Info <Integer> info1 = new Info<>(5);
        Info <User> info2 = new Info<>(new User());

        System.out.println(info);

        int i = info1.getValue();
        System.out.println(i);

        System.out.println(info2);

        Info2 <String, Integer> info3 = new Info2<>("Hello", 17);
        System.out.println(info3);

        Info2<Integer, String> info4 = new Info2<>(12, "Bye");

        System.out.println(info4.getVal1() + "    " + info4.getVal2());
    }
}

// Это параметризированный класс:
class Info <T> {
    private T value;

    // Конструктор класса, который принимает значение value типа T:
    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }
    // метод для возвращения значения:
    public T getValue() {
        return value;
    }

}

class User {

}
// Параметризированный класс с 2 типами: (Если оба типа одинаковые, то достаточно указать только один параметр.)
class Info2 <V1, V2> {
    private V1 val1;
    private V2 val2;

    public Info2(V1 val1, V2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public  String toString() {
        return val1 + "   " + val2;
    }

    //Методы для возвращения значения для каждого типа задаются отдельно.
    public V1 getVal1() {
        return val1;
    }
    public V2 getVal2() {
        return val2;
    }
}
