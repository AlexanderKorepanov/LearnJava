package useComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Comparable<T> используется для сравнение объектов используя естественный порядок.
Применяется, когда сортировка по умолчанию не работает (много полей и прочее) и её необходимо задать.
 */
public class UseComparable {
    public static void main(String[] args) {
        List<PowerStation> list = new ArrayList<>();
        PowerStation st1 = new PowerStation(1, 6400, "Sayano-Shushenskaya", "Enisey");
        PowerStation st2 = new PowerStation(4, 4500, "Bratskaya", "Irkutsk");
        PowerStation st3 = new PowerStation(6, 4000, "Kyrskaya", "Kyrsk");
        PowerStation st4 = new PowerStation(7, 4000, "Leningradskaya", "Saint-Petersburg");

        list.add(st3);
        list.add(st1);
        list.add(st4);
        list.add(st2);

        System.out.println("Перед сортировкой \n" + list);

        Collections.sort(list);

        System.out.println("После сортировки");
        System.out.println(list);
    }
}

//Задаём класс с полями, имплементирующий интерфейс Comparable.
class PowerStation implements Comparable<PowerStation> {
    Integer id;       //тут int
    Integer power;    //тут int
    String name;
    String place;
//задаем конструктор класса.
    public PowerStation(int id, int power, String name, String place) {
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
    // метод возвращает число типа int. Если созданный объект больше
    // объекта в параметре метода - то "+" число,
    // меньше - то "-"число, равны - то "0".
    @Override
    public int compareTo(PowerStation anotherStation) { // Comparable для id - это придерживание естесственного порядка!
        /* один из вариантов написания кода.
        if (this.id == anotherStation.id) {
            return 0;
        }
        else if (this.id < anotherStation.id) {
            return -1;
        }
        else {
            return 1;
        }*/

        // 2-й способ написания кода.
        //return this.id - anotherStation.id;

        //3-й способ (изменили примитив int у Power на класс Integer. Для String - итак работает).
        //return this.power.compareTo(anotherStation.power);

        //Двойная проверка. К примеру, если Power равны, то будем проверять по id.

        int result = this.power.compareTo(anotherStation.power);
        if (result == 0) {
            result = this.id.compareTo(anotherStation.id);
        }
        return result;
    }
}