/**
 * Student Linked List with min/max grade functionality
 * Demonstrates finding students with highest and lowest grades
 */

public class StudentLinkedList {
    private SimpleLinkedList studentList;

    public StudentLinkedList() {
        studentList = new SimpleLinkedList();
    }

    public void addStudent(Student student) {
        studentList.insertLast(student);
    }

    public Student[] findMinMaxStudents() {
        if (studentList.isEmpty()) {
            return null;
        }

        Student minStudent = null;
        Student maxStudent = null;
        double minGrade = Double.MAX_VALUE;  // Start with highest possible value
        double maxGrade = Double.MIN_VALUE;  // Start with lowest possible value

        // Traverse through all students in the list
        for (int i = 0; i < studentList.size(); i++) {
            Student currentStudent = (Student) studentList.getElementAt(i);
            double currentGrade = currentStudent.getGrade();

            // Check for minimum grade
            if (currentGrade < minGrade) {
                minGrade = currentGrade;
                minStudent = currentStudent;
            }

            // Check for maximum grade
            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
                maxStudent = currentStudent;
            }
        }

        // Return both students in an array
        return new Student[]{minStudent, maxStudent};
    }


    public void printAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list");
            return;
        }

        System.out.println("All Students (" + studentList.size() + " total):");
        System.out.println("----------------------------------------");

        for (int i = 0; i < studentList.size(); i++) {
            Student student = (Student) studentList.getElementAt(i);
            System.out.println((i + 1) + ". " + student);
        }
    }

    public void printMinMaxStudents() {
        Student[] minMax = findMinMaxStudents();

        if (minMax == null) {
            System.out.println("No students in the list");
            return;
        }

        Student minStudent = minMax[0];
        Student maxStudent = minMax[1];

        System.out.println("Highest Grade: " + maxStudent.getGrade() + " - " +
                maxStudent.getLastName() + " " + maxStudent.getFirstName() +
                " (ID: " + maxStudent.getStudentId() + ")");
        System.out.println("Lowest Grade:  " + minStudent.getGrade() + " - " +
                minStudent.getLastName() + " " + minStudent.getFirstName() +
                " (ID: " + minStudent.getStudentId() + ")");
    }

    public static void main(String[] args) {
        // Create a new student list
        StudentLinkedList studentList = new StudentLinkedList();

        System.out.println("=== STUDENT GRADE ANALYSIS SYSTEM ===");

        studentList.addStudent(new Student(144254, "LeBron", "James", 8.5));
        studentList.addStudent(new Student(124577, "George", "Smith", 4.8));
        studentList.addStudent(new Student(145578, "Michael", "Jordan", 6.2));
        studentList.addStudent(new Student(124457, "Kobe", "Bryant", 9.1));
        studentList.addStudent(new Student(175458, "Lance", "Stephenson", 5.5));
        studentList.addStudent(new Student(189123, "Steph", "Curry", 7.8));
        studentList.addStudent(new Student(192456, "Kevin", "Durant", 3.9));  // Lowest grade
        studentList.addStudent(new Student(187654, "Giannis", "Antetokounmpo", 9.8));  // Highest grade

        System.out.println("\n=== ALL STUDENTS ===");
        studentList.printAllStudents();

        System.out.println("\n=== PRINT MIN/MAX ===");
        studentList.printMinMaxStudents();

    }
}