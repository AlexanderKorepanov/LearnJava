package collections.workWithArrayList;

//Методы ArrayList. Часть1.

import java.util.ArrayList;

public class ArrayListMethodsExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //1. add(DateType element) - последовательное добавление объектов в list.
        arrayList.add(256);
        arrayList.add(342);
        arrayList.add(666);
        System.out.println("Метод add: ");
        for (Integer i : arrayList) {
            System.out.print(i + "   ");
        }
        System.out.println();

        //2. add(int index, DateType element) - добавление элемента по указанному индексу.
        System.out.println("Метод add с указанием индекса: ");
        arrayList.add(1, 555);
        System.out.println(arrayList);

        System.out.println("Метод get: ");
        //3. get(int index) - возвращает элемент указанного индекса.
        System.out.println(arrayList.get(3));

        //4. set(int index, DateType element) - производит замену элемента указаанного индекса на вставляемый.

        System.out.println("Метод set: ");
        arrayList.set(0, 444);
        System.out.println(arrayList);

        //5. Метод remove - удаление элемента. При удалении все элементы смещаются влево.
        System.out.println("Метод remove:");
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println();

        System.out.println("Метод remove c Object: ");
        Station st1 = new Station("First", 10000, 15, "Company1");
        Station st2 = new Station("Second", 11000, 16, "Company2");
        Station st3 = new Station("Third", 12000, 17, "Company3");
        Station st4 = new Station("Fourth", 13000, 18, "Company4");

        ArrayList<Station> stations = new ArrayList<>();
        stations.add(st1);
        stations.add(st2);
        stations.add(st3);
        stations.add(st4);
        System.out.println(stations);
        Station st5 = new Station("Fourth", 13000, 18, "Company4");
        //st5 не добавлен в ArrayList station. Попытка удалить его. Объект не удаляется так как происходит его поиск
        //посредством метода equals.
        stations.remove(st5);
        System.out.println(stations);

        //чтобы удалить объект, необходимо, чтобы были равны ссылки, или метод equals должен быть переопределён,
        //т.е. мы зададим такие условия, когда ссылки на объъекты станут равны.
        Station st6 = st4;
        stations.remove(st6);
        System.out.println(stations);

    }
}

class Station {
    private String name;
    private int power;
    private int age;
    private String company;

    public Station(String name, int power, int age, String company) {
        this.name = name;
        this.power = power;
        this.age = age;
        this.company = company;
    }

    public String toString() {
        return "Station " + name + "  " + power + "  " + age + "  " + company + ".";
    }
}