/**
 * Student class that implements Comparable interface
 * Allows comparison between students based on student ID
 */
public class Student implements Comparable<Student> {
    public String lastName;
    public String firstName;
    public int studentID;  // Student ID

    // Constructor
    public Student(String lastName, String firstName, int studentID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentID = studentID;
    }

    //Compares this student with another student based on student ID
    @Override
    public int compareTo(Student other) {
        if (this.studentID < other.studentID) {
            return -1;
        } else if (this.studentID > other.studentID) {
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Student{ID=" + studentID + ", Name='" + firstName + " " + lastName + "'}";
    }

    // Getters
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public int getStudentID() { return studentID; }
}