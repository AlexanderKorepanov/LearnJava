package generics.igra;

/*
Метод main, содержащий объявления объектов(участников, и команд с этими участниками)
 */

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Иван", 14);
        Schoolar schoolar2 = new Schoolar("Денис", 15);

        Schoolar schoolar3 = new Schoolar("Сергей", 15);
        Schoolar schoolar4 = new Schoolar("Татьяна", 14);

        Student student1 = new Student("Роман", 19);
        Student student2 = new Student("Ольга", 18);

        Employee employee1 = new Employee("Дмитрий", 28);
        Employee employee2 = new Employee("Светлана", 27);

        Team<Schoolar> schoolarTeam = new Team<>("Школьники");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Школьники2");
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("Студенты");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Рабочие");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);

    }
}
