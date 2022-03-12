package streams;

/*
Метод flatMap() - позволяет напрямую получать поток элементов коллекции, содержащейся в другой коллекции.
Это intermediate метод.
 */

import java.util.ArrayList;
import java.util.List;

public class MethodFlapMap {
    public static void main(String[] args) {
        // Создаём студентов.
        Student st1 = new Student("Ivan", 'm', 22, 4, 4.5);
        Student st2 = new Student("Svetlana", 'f', 21, 3, 4.8);
        Student st3 = new Student("Igor", 'm', 19, 2, 4.0);
        Student st4 = new Student("Olga", 'f', 20, 3, 4.2);
        Student st5 = new Student("Aleksey", 'm', 23, 5, 3.7);

        // Создаём факультеты.
        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied mathematics");

        // Добавляем студентов в созданные факультеты.
        faculty1.addStudentOnFaculty(st1);
        faculty1.addStudentOnFaculty(st2);
        faculty1.addStudentOnFaculty(st3);
        faculty2.addStudentOnFaculty(st4);
        faculty2.addStudentOnFaculty(st5);

        // Создаем ArrayList факультетов.
        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);

        // Выведем имена студентов, содержащихся в facultyList через метод flatMap().
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(e ->
                System.out.println(e.getName()));
    }
}

/*
Создаем отдельный класс Faculty. Это будет отделная коллекция, которая будет содержать ArrayList добавленных в нее
студентов.
Зададим этому классу конструктор.
Создадим в нем метод, который будет добавлять в ArrayList созданных студентов.
 */

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
    public void addStudentOnFaculty (Student st) {
        studentsOnFaculty.add(st);
    }
}
