
public class StudentStackTest {
    public static void main(String[] args) {
        System.out.println("=== STUDENT STACK ===");

        // Create a stack for students
        ArrayStack studentStack = new ArrayStack(10);

        // Create some student objects
        Student student1 = new Student(144254, "LeBron", "James", 8.5);
        Student student2 = new Student(124577, "Gorge", "Smith", 4.8);
        Student student3 = new Student(145578, "Michael", "Jordan", 6.2);
        Student student4 = new Student(124457, "Kobe", "Bryant", 9.1);
        Student student5 = new Student(175458, "Lance", "Stephenson", 5.5);

        // Push students to stack
        System.out.println("\n1. Adding students to stack:");
        try {
            studentStack.push(student1);
            studentStack.push(student2);
            studentStack.push(student3);
            studentStack.push(student4);
            studentStack.push(student5);
        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display stack contents
        System.out.println("\n2. Current student stack:");
        studentStack.display();
        System.out.println("Total students in stack: " + studentStack.size());

        //Top student
        System.out.println("\n3. Top student :");
        try {
            Student topStudent = (Student) studentStack.top();
            System.out.println("Top student: " + topStudent);
        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Pop students from stack
        System.out.println("\n4. Poping students (LIFO order):");
        try {
            while (!studentStack.isEmpty()) {
                Student currentStudent = (Student) studentStack.pop();

                if (currentStudent.getGrade() >= 5.0) {
                    System.out.println("PASSED");
                } else {
                    System.out.println("FAILED");
                }
            }
        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n5. Final stack state:");
        System.out.println("Stack size: " + studentStack.size());
        System.out.println("Is empty: " + studentStack.isEmpty());
        studentStack.display();

        // Push students to stack
        System.out.println("\n6. Additional stack operations:");

        // Add students again
        try {
            studentStack.push(new Student(125584, "Anthony", "Davis", 8.0));
            studentStack.push(new Student(185923, "Peter", "Parker", 6.5));
        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Current stack size: " + studentStack.size());
        studentStack.display();
    }
}