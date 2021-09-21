package week3;

public class Course {

    String name;
    int credit;
    int studentCount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void defaultVariables()
    {
        name = "PersonName";
        credit = 2;
        studentCount = 18;

        System.out.println(name);
        System.out.println(credit);
        System.out.println(studentCount);
    }
}
