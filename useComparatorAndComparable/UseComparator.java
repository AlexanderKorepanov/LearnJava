package useComparatorAndComparable;

/*
Используются для сравнения объектов, используя не естесственный порядок.
Логика такая же как у Comparable.
Задаётся в том случае, когда не известна логика сортировки изначально.
задаётся в качеств е2-го параметра сортировки. который и идёт как соновной.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
    public static void main(String[] args) {
        List<PowerStation2> list = new ArrayList<>();
        PowerStation2 st1 = new PowerStation2(1, 6400, "Sayano-Shushenskaya", "Enisey");
        PowerStation2 st2 = new PowerStation2(4, 4500, "Bratskaya", "Irkutsk");
        PowerStation2 st3 = new PowerStation2(6, 4000, "Kyrskaya", "Kyrsk");
        PowerStation2 st4 = new PowerStation2(7, 4000, "Leningradskaya", "Saint-Petersburg");

        list.add(st3);
        list.add(st1);
        list.add(st4);
        list.add(st2);

        System.out.println("Перед сортировкой \n" + list);

        Collections.sort(list, new IdComparator());

        System.out.println("После сортировки IdComparator");

        System.out.println(list);

        System.out.println("После сортировки NameComparator");

        Collections.sort(list, new NameComparator());

        System.out.println(list);

        Collections.sort(list, new PowerComparator());

        System.out.println("После сортировки PowerComparator");

        System.out.println(list);
    }
}

//Задаём класс с полями.
class PowerStation2 {
    int id;
    int power;
    String name;
    String place;

    //задаем конструктор класса.
    public PowerStation2(int id, int power, String name, String place) {
        this.id = id;
        this.power = power;
        this.name = name;
        this.place = place;
    }

    //переопределяем метод toString.
    @Override
    public String toString() {
        return "PowerStation{" +
                "id=" + id +
                ", power=" + power +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}

//Создаем классы, имплементирующий интерфейс Comparator.

//по id
class IdComparator implements Comparator<PowerStation2> {
    @Override
    public int compare(PowerStation2 st1, PowerStation2 st2) { // Метод интерфейса, сравнивающий 2 объекта.
        if (st1.id == st2.id) {
            return 0;
        } else if (st1.id < st2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

//по name
class NameComparator implements Comparator<PowerStation2> {
    @Override
    public int compare(PowerStation2 st1, PowerStation2 st2) {
        return st1.name.compareTo(st2.name);
    }
}

//по power
class PowerComparator implements Comparator<PowerStation2> {
    @Override
    public int compare(PowerStation2 st1, PowerStation2 st2) {
        return st1.power - st2.power;
    }
}
