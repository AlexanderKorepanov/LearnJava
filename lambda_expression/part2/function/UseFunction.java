package lambda_expression.part2.function;

// ФИ, содержащий 2 параметра. Имеет метод - "R apply(T t)", где Т - входной параметр, а R - тип возвр. значения.
// Function<T, R>

import java.util.ArrayList;
import java.util.function.Function;

public class UseFunction {
    // Метод с использованием ФИ Function для поиска среднего значения какого-либо показателя коллекции студентов.
    private static double avgSomething(ArrayList<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s: list) {
            result+=f.apply(s);
        }
        result = result/list.size();
        return result;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 4, 4.5);
        Student st2 = new Student("Svetlana", 'f', 21, 3, 4.8);
        Student st3 = new Student("Igor", 'm', 19, 2, 4.0);
        Student st4 = new Student("Olga", 'f', 20, 3, 4.2);
        Student st5 = new Student("Aleksey", 'm', 23, 5, 3.7);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        double res = avgSomething(arrayList, student -> (double)student.age); //casting, т.к. age - int.
        System.out.println(res);
        System.out.println("-------------------");
        double res1 = avgSomething(arrayList, student -> student.avgGrade);
        System.out.println(res1);
    }
}
