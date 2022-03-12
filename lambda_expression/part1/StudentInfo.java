package lambda_expression.part1;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents (ArrayList<Student> al, StudentChecks sc) {
        for (Student s: al) {
            if(sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 4, 4.5);
        Student st2 = new Student("Svetlana", 'f', 21, 3, 4.8);
        Student st3 = new Student("Igor", 'm', 19, 2, 4.0);
        Student st4 = new Student("Olga", 'f', 20, 3, 4.2);
        Student st5 = new Student("Aleksey", 'm', 23, 5, 3.7);

        ArrayList students = new ArrayList();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        info.testStudents(students, new StudentChecks() { // Создание анонимного класса, для разовой фильтрации студентов.
            @Override
            public boolean check(Student s) {
                return s.avgGrade<4.2;
            }
        });
        System.out.println("----------------------------");
        //создание фильтра через лямбда-выражение:
        /*
        Метод testStudents вызывается для объекта info.
        Метод testStudents принимает 2 параметры (list, и объект интерфейса StudentChecks)
        Объект интерфейса StudentChecks должен реализовывать метод check, который принимает в параметр объект типа Student
        Правая часть в {} в параметра метода testStudents это по сути реализация метода check.
        */
        info.testStudents(students, (Student s) -> { return s.age>21;}); // по сути кратка форма написания того, что сверху.
        System.out.println("----------------------------");
        info.testStudents(students, s -> s.course>2); // более краткая запись.
        System.out.println("----------------------------");
        info.testStudents(students, s -> s.course>2&&s.age>22&&s.sex=='m'); // Применение нескольких фильтров.
        System.out.println("----------------------------");
        //Можно совмещать полный и короткий вариант написания частей ЛВ.
        //Если в правой части используется полное написание, то обязательно используются return, {} и ";".
        info.testStudents(students, p -> { return p.age>21;});

        //если в правой части используется несколько statement-ов, то используется только полное написание
        System.out.println("Несколько statement-ов");
        info.testStudents(students, p -> {
            System.out.println("Hello");
            return p.age>22;
        });
        // Можно создать переменную и поместить в неё ЛВ.
        System.out.println("----------------------------");
        StudentChecks sc = (Student p) -> {return p.sex=='f';};
        info.testStudents(students, sc);

    }
}
// Это функциональный интерфейс (ФИ). Он содержит только один абстрактный метод.
interface StudentChecks {
    boolean check(Student s);
}