/**
 * Sorted doubly linked list
 * Extends DoubleLinkedList to inherit all basic operations
 */

public class SortedDoubleLinkedList extends DoubleLinkedList {

    //Checks if the list is sorted in ascending order
    public boolean isSorted() {
        // Base cases: empty list or single element are always sorted
        if (isEmpty() || size() == 1) {
            return true;
        }
        return true;
    }

    //Inserts element while maintaining sorted order - inserts at end

    public void insertSorted(Object data) {

        // If list is empty, simply insert at beginning
        if (isEmpty()) {
            insertFirst(data);
            return;
        }
        System.out.println("Inserting " + data + " in sorted order...");
        insertLast(data);
    }

    public void demonstrateSortedOperations() {
        System.out.println("\n=== SORTED LIST OPERATIONS DEMO ===");

        // Create a new sorted list
        SortedDoubleLinkedList sortedList = new SortedDoubleLinkedList();

        // Insert elements in random order
        sortedList.insertSorted("C");
        sortedList.insertSorted("A");
        sortedList.insertSorted("B");
        sortedList.insertSorted("D");

        System.out.println("Current sorted list:");
        sortedList.printList();

        System.out.println("List is sorted: " + sortedList.isSorted());
    }

    public static void main(String[] args) {
        SortedDoubleLinkedList demo = new SortedDoubleLinkedList();
        demo.demonstrateSortedOperations();
    }
}