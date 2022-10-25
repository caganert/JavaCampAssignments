package entities;

public class Student extends User{
    private int studentNumber;

    public Student(int id, String firstName, String lastName, int studentNumber) {
        super(id, firstName, lastName);
        this.studentNumber = studentNumber;
    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
