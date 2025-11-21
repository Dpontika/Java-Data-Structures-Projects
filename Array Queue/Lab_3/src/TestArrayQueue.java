/**
 * Test class for Student Queue operations
 * Demonstrates using Queue with Student objects (FIFO processing)
 */

public class TestArrayQueue {
    public static void main(String[] args) {
        System.out.println("=== STUDENT QUEUE (FIFO) ===");

        // Create a queue for students
        ArrayQueue studentQueue = new ArrayQueue(10);

        // Create some student objects
        Student student1 = new Student(144254, "LeBron", "James", 8.5);
        Student student2 = new Student(124577, "Gorge", "Smith", 4.8);
        Student student3 = new Student(145578, "Michael", "Jordan", 6.2);
        Student student4 = new Student(124457, "Kobe", "Bryant", 9.1);
        Student student5 = new Student(175458, "Lance", "Stephenson", 5.5);;

        // Enqueue students to queue
        System.out.println("\n1. Adding students to queue:");
        try {
            studentQueue.enqueue(student1);
            studentQueue.enqueue(student2);
            studentQueue.enqueue(student3);
            studentQueue.enqueue(student4);
            studentQueue.enqueue(student5);
        } catch (QueueFullException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display queue contents
        System.out.println("\n2. Current student queue:");
        studentQueue.display();
        System.out.println("Total students in queue: " + studentQueue.size());

        // Peek at front student
        System.out.println("\n3. Front student (without removing):");
        try {
            Student frontStudent = (Student) studentQueue.front();
            System.out.println("Front student: " + frontStudent);
        } catch (QueueEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Dequeue students from queue)
        System.out.println("\n4. Dequeueing students (FIFO order - First In First Out):");
        try {
            while (!studentQueue.isEmpty()) {
                Student currentStudent = (Student) studentQueue.dequeue();

                if (currentStudent.getGrade() >= 5.0) {
                    System.out.println("PASSED");
                } else {
                    System.out.println("FAILED");
                }

                System.out.print("  Remaining in queue: ");
                studentQueue.display();
            }
        } catch (QueueEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Final state
        System.out.println("\n5. Final queue state:");
        System.out.println("Queue size: " + studentQueue.size());
        System.out.println("Is empty: " + studentQueue.isEmpty());
        studentQueue.display();

        // Demonstrate real-world queue scenario
        System.out.println("\n6. Additional queue simulation:");

        try {
            // Students arriving
            studentQueue.enqueue(new Student(145787, "Anthony", "Davis", 8.0));
            studentQueue.enqueue(new Student(166478, "Peter", "Parker", 6.5));
            studentQueue.enqueue(new Student(153478, "Lisa", "Garcia", 7.2));

            // Processing first student
            Student firstInLine = (Student) studentQueue.dequeue();
            System.out.println("Currently serving: " + firstInLine.getFirstName());

            // Add students
            studentQueue.enqueue(new Student(2004, "David", "Lee", 9.0));


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}