import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student groupLeader;
    private List<Student> students;
    private List<String> tasks;

    public Group(Student groupLeader, List<Student> students, List<String> tasks) {
        this.groupLeader = groupLeader;
        this.students = students ;
        this.tasks = tasks;
    }

    public void changeGroupLeader(Student newLeader) {
        if (students.contains(newLeader)) {
            groupLeader.setGroupLeader(false);
            newLeader.setGroupLeader(true);
            groupLeader = newLeader;
            System.out.println("New group leader is: " + newLeader.getName() + " " + newLeader.getSurname());
        } else {
            System.out.println("This student is not in the group.");
        }
    }

    public void editStudent(Student student, String newName, String newSurname) {
        student.setName(newName);
        student.setSurname(newSurname);
        System.out.println("Student renamed to: " + student.getName() + " " + student.getSurname());
    }

    public void removeStudent(Student student1) {
        students.remove(student1);
        System.out.println("Student " + student1.getName() + " was removed from group");
    }

    public void addStudent(Student student2) {
        students.add(student2);
        System.out.println("Student " + student2.getName() + " was added to group");
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("New task added: " + task);
    }
}
