import java.util.Scanner;

public class SLListManagement {

    public static void main(String[] args) {
        // Create an empty linked list
        SimpleLinkedList list = new SimpleLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Main program loop
        while (running) {
            // Display menu options
            System.out.println("\n********* LINKED LIST MANAGEMENT *********");
            System.out.println("1- INSERT ELEMENT AT THE BEGINNING OF THE LIST");
            System.out.println("2- INSERT ELEMENT AT THE END OF THE LIST");
            System.out.println("3- DELETE FROM THE BEGINNING OF THE LIST");
            System.out.println("4- DELETE FROM THE END OF THE LIST");
            System.out.println("5- LIST LENGTH");
            System.out.println("6- IS THE LIST EMPTY");
            System.out.println("7- PRINT LIST");
            System.out.println("8- EXIT");
            System.out.print("INPUT YOUR CHOICE: ");

            // Get user choice
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Process user choice
            switch (choice) {
                case 1:
                    // Insert at beginning
                    System.out.print("Enter string to insert at beginning: ");
                    String data1 = scanner.nextLine();
                    list.insertFirst(data1);
                    break;

                case 2:
                    // Insert at end
                    System.out.print("Enter string to insert at end: ");
                    String data2 = scanner.nextLine();
                    list.insertLast(data2);
                    break;

                case 3:
                    // Remove from beginning with error handling
                    try {
                        list.removeFirst();
                    } catch (ListEmptyException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    // Remove from end with error handling
                    try {
                        list.removeLast();
                    } catch (ListEmptyException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    // Display current list size
                    System.out.println("List length: " + list.size());
                    break;

                case 6:
                    // Check if list is empty
                    System.out.println("List is empty: " + list.isEmpty());
                    break;

                case 7:
                    // Print all list contents
                    list.printList();
                    break;

                case 8:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice! Please enter 1-8.");
            }
        }
        scanner.close(); // Close scanner to prevent resource leak
    }
}