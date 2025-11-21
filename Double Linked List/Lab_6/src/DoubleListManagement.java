import java.util.Scanner;

public class DoubleListManagement {

    public static void main(String[] args) {
        // Create an empty doubly linked list
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("******* DOUBLE LINKED LIST MANAGEMENT *******");

        // Main program loop
        while (running) {
            // Display menu options
            System.out.println("\n1- INSERT ELEMENT AT THE BEGINNING OF THE LIST");
            System.out.println("2- INSERT ELEMENT AT THE END OF THE LIST");
            System.out.println("3- INSERT ELEMENT AT POSITION N OF THE LIST");
            System.out.println("4- DELETE ELEMENT FROM THE BEGINNING OF THE LIST");
            System.out.println("5- DELETE ELEMENT FROM THE END OF THE LIST");
            System.out.println("6- DELETE ELEMENT FROM POSITION N OF THE LIST");
            System.out.println("7- LIST LENGTH");
            System.out.println("8- IS THE LIST EMPTY");
            System.out.println("9- PRINT LIST");
            System.out.println("10- PRINT LIST IN REVERSE");
            System.out.println("0- EXIT");
            System.out.print("INPUT YOUR CHOICE: ");

            // Get user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            // Process user choice with exception handling
            try {
                switch (choice) {
                    case 1:
                        // Insert at beginning of list
                        System.out.print("Enter string to insert at beginning: ");
                        String data1 = scanner.nextLine();
                        list.insertFirst(data1);
                        break;

                    case 2:
                        // Insert at end of list
                        System.out.print("Enter string to insert at end: ");
                        String data2 = scanner.nextLine();
                        list.insertLast(data2);
                        break;

                    case 3:
                        // Insert at specific position
                        System.out.print("Enter position: ");
                        int pos1 = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter string to insert: ");
                        String data3 = scanner.nextLine();
                        list.insert(pos1, data3);
                        break;

                    case 4:
                        // Remove from beginning of list
                        list.removeFirst();
                        break;

                    case 5:
                        // Remove from end of list
                        list.removeLast();
                        break;

                    case 6:
                        // Remove from specific position
                        System.out.print("Enter position to remove: ");
                        int pos2 = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        list.remove(pos2);
                        break;

                    case 7:
                        // Display current list size
                        System.out.println("List length: " + list.size());
                        break;

                    case 8:
                        // Check if list is empty
                        System.out.println("List is empty: " + list.isEmpty());
                        break;

                    case 9:
                        // Print list in forward direction
                        list.printList();
                        break;

                    case 10:
                        // Print list in reverse direction (doubly linked list feature)
                        list.printListReverse();
                        break;

                    case 0:
                        // Exit the program
                        running = false;
                        System.out.println("Exiting program. Goodbye!");
                        break;

                    default:
                        // Handle invalid input
                        System.out.println("Invalid choice! Please enter 1-11.");
                }
            } catch (ListEmptyException e) {
                // Handle empty list operations
                System.out.println("Error: " + e.getMessage());
            } catch (NoSuchListPosition e) {
                // Handle invalid position operations
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}