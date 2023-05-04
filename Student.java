public class Student {
    private static int baseID = 0;
    private int id;
    private String name;
    private String surname;
    private boolean groupLeader;

    public Student(String name, String surname) {
        baseID++;
        this.id = baseID;
        this.name = name;
        this.surname = surname;
        if (this.id == 1) {
            this.groupLeader = true;
        }
    }

    public static int getBaseID() {
        return baseID;
    }

    public static void setBaseID(int baseID) {
        Student.baseID = baseID;
    }

    public int getId(int removeStudent) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(boolean groupLeader) {
        this.groupLeader = groupLeader;
    }
}
