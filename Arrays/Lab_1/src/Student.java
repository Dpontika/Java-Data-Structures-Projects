


public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private double age;
    private char gender;
    private int absences;
    private double grade;

    // Constructor
    public Student(int studentId, String firstName, String lastName,
                   double age, char gender, int absences, double grade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.absences = absences;
        this.grade = grade;
    }

    // Getters and Setters
    public int getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getAge() { return age; }
    public char getGender() { return gender; }
    public int getAbsences() { return absences; }
    public double getGrade() { return grade; }

    public void setGrade(double grade) { this.grade = grade; }
    public void setAbsences(int absences) { this.absences = absences; }

    @Override
    public String toString() {
        return studentId + " - " + lastName + " " + firstName +
                " - Absences: " + absences + " - Grade: " + grade;
    }
}
