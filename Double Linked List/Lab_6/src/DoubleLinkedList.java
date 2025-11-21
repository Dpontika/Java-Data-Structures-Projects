/**
 * Doubly Linked List implementation
 * Supports bidirectional traversal and position-based operations
 */

public class DoubleLinkedList implements List {
    // Reference to the first node in the list
    private DoubleNode head;
    // Reference to the last node in the list
    private DoubleNode tail;
    // Number of elements in the list
    private int size;

    // Create an empty doubly linked list
    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void insertFirst(Object data) {
        // Create new node with current head as next and null as previous
        DoubleNode newNode = new DoubleNode(data, head, null);

        // If list is empty, new node becomes both head and tail
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Current head's previous points to new node, new node becomes new head
            head.setPrevious(newNode);
            head = newNode;
        }
        size++; // Increase the size counter
        System.out.println("Inserted at beginning: " + data);
    }

    @Override
    public void insertLast(Object data) {
        // Create new node with null as next and current tail as previous
        DoubleNode newNode = new DoubleNode(data, null, tail);

        // If list is empty, new node becomes both head and tail
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Current tail's next points to new node, new node becomes new tail
            tail.setNext(newNode);
            tail = newNode;
        }
        size++; // Increase the size counter
        System.out.println("Inserted at end: " + data);
    }

    @Override
    public void insert(int position, Object data) throws NoSuchListPosition {
        // Validate position
        if (position < 0 || position > size) {
            throw new NoSuchListPosition("Invalid position: " + position);
        }

        // Handle special cases using existing methods
        if (position == 0) {
            insertFirst(data);
        } else if (position == size) {
            insertLast(data);
        } else {
            // Find the node at position-1 (the node before insertion point)
            DoubleNode current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }

            // Create new node that points to current's next and current as previous
            DoubleNode newNode = new DoubleNode(data, current.getNext(), current);
            // Update the next node's previous pointer
            current.getNext().setPrevious(newNode);
            // Update current node's next pointer
            current.setNext(newNode);
            size++;
            System.out.println("Inserted at position " + position + ": " + data);
        }
    }

    @Override
    public Object removeFirst() throws ListEmptyException {
        // Check if list is empty
        if (isEmpty()) {
            throw new ListEmptyException("List is empty");
        }

        // Store the data from the head node
        Object removedData = head.getItem();
        // Move head to the next node
        head = head.getNext();

        // If list is not empty after removal, update new head's previous pointer
        if (head != null) {
            head.setPrevious(null);
        } else {
            tail = null; // List became empty
        }
        size--; // Decrease the size counter
        System.out.println("Removed from beginning: " + removedData);
        return removedData;
    }

    @Override
    public Object removeLast() throws ListEmptyException {
        // Check if list is empty
        if (isEmpty()) {
            throw new ListEmptyException("List is empty");
        }

        // Store the data from the tail node
        Object removedData = tail.getItem();
        // Move tail to the previous node
        tail = tail.getPrevious();

        // If list is not empty after removal, update new tail's next pointer
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null; // List became empty
        }
        size--; // Decrease the size counter
        System.out.println("Removed from end: " + removedData);
        return removedData;
    }

    @Override
    public Object remove(int position) throws ListEmptyException, NoSuchListPosition {
        // Check if list is empty
        if (isEmpty()) {
            throw new ListEmptyException("List is empty");
        }

        // Validate position
        if (position < 0 || position >= size) {
            throw new NoSuchListPosition("Invalid position: " + position);
        }

        // Handle special cases using existing methods
        if (position == 0) {
            return removeFirst();
        } else if (position == size - 1) {
            return removeLast();
        } else {
            // Find the node at the specified position
            DoubleNode current = head;
            for (int i = 0; i < position; i++) {
                current = current.getNext();
            }

            // Store the data to return
            Object removedData = current.getItem();
            // Update previous node's next pointer to skip current node
            current.getPrevious().setNext(current.getNext());
            // Update next node's previous pointer to skip current node
            current.getNext().setPrevious(current.getPrevious());
            size--;
            System.out.println("Removed from position " + position + ": " + removedData);
            return removedData;
        }
    }

    //Prints list contents from head to tail
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("List contents (head to tail): ");
        DoubleNode current = head;
        while (current != null) {
            System.out.print(current + " <-> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    //Prints list contents from tail to head
    public void printListReverse() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("List contents (tail to head): ");
        DoubleNode current = tail;
        while (current != null) {
            System.out.print(current + " <-> ");
            current = current.getPrevious();
        }
        System.out.println("NULL");
    }
}