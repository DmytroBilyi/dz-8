import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dmytro", "White");
        Student student1 = new Student("Alex", "Black");
        Student student2 = new Student("Oleh", "Grey");
        Student student3 = new Student("Taras", "Yellow");
        // student.setGroupLeader(true);// Вибрати старосту групи
        List<Student> list = new ArrayList<>();
        List<String> tasks = new ArrayList<>();
        tasks.add("Task");
        list.add(student);
        list.add(student1);
        list.add(student2);
        Group group = new Group(student, list, tasks);
        //   group.changeGroupLeader(student2); // Змінити старосту
        // group.editStudent(student1); // Змінити студента
        // group.addTask("tesrtdfgfdg");// Додати Таск
         group.addStudent(student3);// Додати студента
        //  group.removeStudent(student2); // Видалити студента

    }
}

