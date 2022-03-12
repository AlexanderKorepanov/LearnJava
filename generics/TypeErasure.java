package generics;
import java.util.ArrayList;


/*
Type erasure - стирание типов. Этот механизм необходим для поддержания обратной совместимости.
Совместимость кода на разных версиях написания кода программы.
Т.е. для JVM информации о дженериках нет, она стирается.
 */

public class TypeErasure {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // JVM видит строку выше так:   ArrayList list = new ArrayList();

        int i = list.get(1);
        // JVM видит строку выше так:  int i = (Integer) list.get(1);
    }

        // создадим 2 метода:
        public void myMethod(MyInfo<String> myInfo) {
            String s = myInfo.getValue();
        }
        /*
        При открытии этого метода, будет возникать ошибка. У методо одинаковая сигнатура, но разное содержание по
        параметрам, а для JVM типизация отбрасывается, т.к. используется TypeErasure.

        Оба метода для JVM выглядят так: public void myMethod(MyInfo myInfo) {}.

        public void myMethod(MyInfo<Integer> myInfo) {
            int x = myInfo.getValue();
        }
        */
}

class MyInfo <T> {
    private T value;

    // Конструктор класса, который принимает значение value типа T:
    public MyInfo(T value) {
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
// Создадим 2 класса - Родитель и наследник.

class Parent {
    public void someMethod(MyInfo<Integer> myInfo) {
        int i = myInfo.getValue();
    }
}

/*
Класс-наследник, который пытается переопределить метод родительского класса, содержащий типизацию (дженерик)
не может этого сделать, т.к. у JVM возникает проблема с casting в подклассе , из-за TypeErasure (дженерик опускается
и сигнатура методов становится одинаковой.

class Child extends Parent {
    public void someMethod(MyInfo<String> myInfo) {
        String s = myInfo.getValue();
    }
}
*/