/**
 * Student Class
 * Represents a student with basic information
 */

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private double grade;

    // Constructor
    public Student(int studentId, String firstName, String lastName, double grade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    // Getters and Setters
    public int getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }


    @Override
    public String toString() {
        return studentId + " - " + lastName + " " + firstName + " - Grade:" + grade + " ";
    }
}
