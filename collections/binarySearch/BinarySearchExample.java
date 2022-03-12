package collections.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Бинарный поиск. Работает только с отсортированными листами.
Поиск элемента осуществляется делением пополам  и сравнением искомо элемента с тем, что получился
в качестве деления.
 */
public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-8);
        list.add(16);
        list.add(7);
        list.add(-15);
        list.add(45);
        list.add(34);
        list.add(53);
        list.add(-89);
        list.add(-33);
        list.add(0);
        list.add(12);
        list.add(5);
        System.out.println("Изначальная коллекция: " + list);
        Collections.sort(list); // сортировка коллекции.
        System.out.println("Отсортированная коллекция: " + list);
        Collections.reverse(list); // сортировка в обратной последовательности.
        System.out.println("Обратная сортировка" + list);

        int index = Collections.binarySearch(list, 34);
        System.out.println("Индекс искомого элемента " + index);
        System.out.println();
        System.out.println("Работа с объектами");

        //Работа с объектами.
        Employee emp1 = new Employee(12, "Александр", 18450);
        Employee emp2 = new Employee(1, "Дмитрий", 11774);
        Employee emp3 = new Employee(8, "Ольга", 45111);
        Employee emp4 = new Employee(34, "Вадим", 33233);
        Employee emp5 = new Employee(8, "Татьяна", 5342); // 2 работника имеют равный id
        Employee emp6 = new Employee(11, "Марина", 22234);
        Employee emp7 = new Employee(43, "Иван", 21675);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(emp4);
        arrayList.add(emp5);
        arrayList.add(emp6);
        arrayList.add(emp7);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        int index2 = Collections.binarySearch(arrayList, new Employee(34, "Вадим", 33233));
        System.out.println("Индекс искомого работника:" + index2);
        System.out.println();
        System.out.println("Работа с массивом");
        //Работа с массивом.
        int[] array = {9, 20, -7, 2, -16, 45, 22, -9, 0, 22};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный масиив: " + Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 22);
        System.out.println("Искомый индекс элемента массива: " + index3);

    }
}


class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
