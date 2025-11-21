public class TestClass {
    public static void main(String[] args) {
        // Create lab instance
        Lab lab = new Lab();

        // Create some students
        Student student1 = new Student(1001, "Leonardo", "Di Caprio", 40.5, 'M', 1, 9.5);
        Student student2 = new Student(1002, "George", "Clooney", 52, 'F', 1, 6.0);
        Student student3 = new Student(1003, "Albert", "Einstein", 50.5, 'M', 5, 4.5);

        // Add students to lab
        lab.addStudent(student1);
        lab.addStudent(student2);
        lab.addStudent(student3);

        // Test all methods
        System.out.println("Initial state:");
        lab.printAttendanceList();
        System.out.println("Total students: " + lab.getStudentCount());
        System.out.println("Passed: " + lab.countPassedStudents());
        System.out.println("Failed: " + lab.countFailedStudents());
        System.out.println("Average grade: " + lab.calculateAverageGrade());

        // Test search
        System.out.println("\nSearching for student 1002:");
        Student found = lab.searchStudent(1002);
        if (found != null) {
            System.out.println("Found: " + found);
        }

        // Test remove
        System.out.println("\nRemoving student 1001:");
        lab.removeStudent(1001);
        lab.printAttendanceList();

        System.out.println("Total students after removal: " + lab.getStudentCount());
    }
}