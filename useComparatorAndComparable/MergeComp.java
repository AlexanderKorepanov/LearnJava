package useComparatorAndComparable;

/*
Класс, объединяющий Comparable и Comparator.
Comparable задает естественную сортировку.
Если присутствует Comparator сортировка, то используется именно она, несмотря на то, что есть естесственная сортировка.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeComp {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        Worker w1 = new Worker(3, "Ivan", 12000);
        Worker w2 = new Worker(5, "Alexander", 15000);
        Worker w3 = new Worker(9, "Boris", 19000);

        list.add(w3);
        list.add(w2);
        list.add(w1);

        System.out.println("До сортировки");

        System.out.println(list);

        Collections.sort(list);

        System.out.println("После естесственной сортировки через Comparable ");

        System.out.println(list);

        Collections.sort(list, new WagesWorkerComparator());

        System.out.println("После сортировки через Comparator");

        System.out.println(list);
    }
}

class Worker implements Comparable<Worker> {
    int id;
    String name;
    Integer wages; // штатно int, Integer для Comparator.

    public Worker(int id, String name, int wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }

    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wages='" + wages + '\'' +
                '}';
    }

    @Override
    public int compareTo(Worker worker) {
        return this.id - worker.id;
    }
}

class WagesWorkerComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.wages.compareTo(w2.wages);
    }
}



