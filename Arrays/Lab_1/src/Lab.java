public class Lab {
    private Student[] students;
    private int studentCount;
    private static final int MAX_STUDENTS = 100;

    public Lab() {
        students = new Student[MAX_STUDENTS];
        studentCount = 0;
    }

    // Add student to lab
    public boolean addStudent(Student student) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount] = student;
            studentCount++;
            return true;
        }
        return false;
    }

    // Remove student by ID
    public boolean removeStudent(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                // Shift all elements after the removed student
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                return true;
            }
        }
        return false;
    }

    // Search student by ID
    public Student searchStudent(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                return students[i];
            }
        }
        return null;
    }

    // Print attendance list
    public void printAttendanceList() {
        System.out.println("=== ATTENDANCE LIST ===");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    // Count passed students (grade >= 5.0)
    public int countPassedStudents() {
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getGrade() >= 5.0) {
                count++;
            }
        }
        return count;
    }

    // Count failed students (grade < 5.0)
    public int countFailedStudents() {
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getGrade() < 5.0) {
                count++;
            }
        }
        return count;
    }

    // Calculate average grade
    public double calculateAverageGrade() {
        if (studentCount == 0) return 0.0;

        double sum = 0.0;
        for (int i = 0; i < studentCount; i++) {
            sum += students[i].getGrade();
        }
        return sum / studentCount;
    }

    // Get student count
    public int getStudentCount() {
        return studentCount;
    }
}