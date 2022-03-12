package lambda_expression.part1;

import java.util.ArrayList;
import java.util.Collections;

/*
Пример использования ЛВ для сортировки коллекции, где в качестве компаратора задаётся ЛВ.
 */

public class Power {
    public static void main(String[] args) {
        ArrayList<Station> ar = new ArrayList<>();
        Station s1 = new Station("One", 1200, 2008, 560);
        Station s2 = new Station("Tow", 1400, 2013, 876);
        Station s3 = new Station("Three", 800, 2021, 341);
        Station s4 = new Station("Four", 1000, 2001, 479);

        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        ar.add(s4);
        Collections.sort(ar, (stat1, stat2) -> stat1.numberOfWorker-stat2.numberOfWorker);
        System.out.println(ar);
    }
}

class Station {
    String name;
    int power;
    int year;
    int numberOfWorker;

    public Station(String name, int power, int year, int numberOfWorker) {
        this.name = name;
        this.power = power;
        this.year = year;
        this.numberOfWorker = numberOfWorker;
    }

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", year=" + year +
                ", numberOfWorker=" + numberOfWorker +
                '}';
    }
}