/**
 * Toll Booth Management System using Queue
 * Manages cars waiting at toll booth
 */

public class CarQueueManagement {
    private ArrayQueue carQueue;
    private static final int capacity = 10;

    public CarQueueManagement() {
        this.carQueue = new ArrayQueue(capacity);
    }

    // Main menu
    private void displayMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("          TOLL BOOTH MANAGEMENT SYSTEM");
        System.out.println("=".repeat(50));
        System.out.println("1. Car Arrival (Add car to queue)");
        System.out.println("2. Car Departure (Remove first car)");
        System.out.println("3. Queue Status (Show waiting cars)");
        System.out.println("4. Exit");
        System.out.println("=".repeat(50));
        System.out.print("Please enter your choice (1-5): ");
    }

    // Add car to the end of queue
    private void addCar(java.util.Scanner scanner) {
        if (carQueue.isFull()) {
            System.out.println(" Queue is full! Cannot accept more cars at this time.");
            return;
        }

        System.out.print("Enter car license plate: ");
        String licensePlate = scanner.nextLine().trim().toUpperCase();

        if (licensePlate.isEmpty()) {
            System.out.println("Invalid license plate!");
            return;
        }

        try {
            Car newCar = new Car(licensePlate);
            carQueue.enqueue(newCar);
            System.out.println("Car " + licensePlate + " added to queue.");
            System.out.println("Current queue size: " + carQueue.size() + "/" + capacity);
        } catch (QueueFullException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Remove first car from queue
    private void removeCar() {
        if (carQueue.isEmpty()) {
            System.out.println("No cars in queue! Queue is empty.");
            return;
        }

        try {
            Car departingCar = (Car) carQueue.dequeue();
            System.out.println(" Car departed: " + departingCar);
            System.out.println(" Remaining cars in queue: " + carQueue.size());
        } catch (QueueEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Displays current queue status
    private void displayQueueStatus() {
        if (carQueue.isEmpty()) {
            System.out.println("Queue is currently empty. No cars waiting.");
            return;
        }

        System.out.println("Current Queue Status (" + carQueue.size() + " cars waiting):");
        System.out.println("-".repeat(40));

        // Display cars in order (front to rear)
        carQueue.display();

        try {
            Car nextCar = (Car) carQueue.front();
            System.out.println("Next car to be processed: " + nextCar.getLicensePlate());
        } catch (QueueEmptyException e) {
            // Should not happen since we checked isEmpty
        }
    }

    public static void main(String[] args) {
        CarQueueManagement system = new CarQueueManagement();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println(" Welcome to Toll Booth Management System!");
        System.out.println("   Managing up to " + capacity + " cars in queue.");

        boolean running = true;

        while (running) {
            system.displayMenu();

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        system.addCar(scanner);
                        break;
                    case 2:
                        system.removeCar();
                        break;
                    case 3:
                        system.displayQueueStatus();
                        break;
                    case 4:
                        System.out.println("Thank you for using Toll Booth Management System. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println(" Invalid choice! Please enter 1-5.");
                }

                // Pause to let user read the output
                if (running) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

            } catch (NumberFormatException e) {
                System.out.println(" Invalid input! Please enter a number between 1-5.");
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}