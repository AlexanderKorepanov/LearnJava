package generics;

/*
WildCard - "Сильная карта"
<?> - означает, что на входе может быть любой тип объекта, класса
 */

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>(); // общий вид.

        /*
        При использовании wildcard, нельзя использовать методы, которые могут изменить объект, т.е:
         */

        List<?> someList = new ArrayList<String>();
        // someList.add("Hello"); - эта строка вызывает ошибку.

        // Лист Double:
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showInfoList(list1);


        // Лист String:
        List<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("def");
        list2.add("ghi");
        showInfoList(list2);

        //Вычисляем сумму Листа:
        ArrayList<Double> lisdD = new ArrayList<>();
        lisdD.add(4.567);
        lisdD.add(56.567);
        lisdD.add(78.567);
        System.out.println(sum(lisdD));

    }

    //создадим метод, который может работать с любым типом листов, через wildcard.
    static void showInfoList(List<?> list) {
        System.out.println("Информация о содержании листа: " + list );
    }

    //создадим метод, вычисляющий сумму элементов списка:
    public static double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number n: arrayList) {
            sum += n.doubleValue();
        }
        return sum;
    }
}

/*
bounded wildcard - ограничение сверху или снизу.
 */
class SomeClass2 {
    List<? extends Number> x = new ArrayList<Integer>();
    List<? super Number> y = new ArrayList<Object>();
}