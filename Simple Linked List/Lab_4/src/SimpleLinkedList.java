//Implementation of a singly linked list using the List interface

public class SimpleLinkedList implements List {
    // Reference to the first node in the list
    private SLListNode head;
    // Reference to the last node in the list
    private SLListNode tail;
    // Number of elements in the list
    private int size;

    /**
     * Constructor to create an empty linked list
     */
    public SimpleLinkedList() {
        head = tail = null;  // No tail when empty
        size = 0;     // Size is zero
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
        // Create a new node with the given data
        SLListNode newNode = new SLListNode(data);

        // If list is empty, new node becomes both head and tail
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // New node points to current head, then becomes new head
            newNode.setNextNode(head);
            head = newNode;
        }
        size++; // Increase the size counter
        System.out.println("Inserted at beginning: " + data);
    }


    @Override
    public void insertLast(Object data) {
        // Create a new node with the given data
        SLListNode newNode = new SLListNode(data);

        // If list is empty, new node becomes both head and tail
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Current tail points to new node, new node becomes new tail
            tail.setNextNode(newNode);
            tail = newNode;
        }
        size++; // Increase the size counter
        System.out.println("Inserted at end: " + data);
    }

    @Override
    public Object removeFirst() throws ListEmptyException {
        // Check if list is empty
        if (isEmpty()) {
            throw new ListEmptyException("List is empty");
        }

        // Store the data from the head node
        Object removedData = head.getNodeData();
        // Move head to the next node
        head = head.getNextNode();
        size--; // Decrease the size counter

        // If list becomes empty, update tail to null
        if (isEmpty()) {
            tail = null;
        }

        System.out.println("Removed from beginning: " + removedData);
        return removedData;
    }

    @Override
    public Object removeLast() throws ListEmptyException {
        // Check if list is empty
        if (isEmpty()) {
            throw new ListEmptyException("List is empty - cannot remove from end");
        }

        // Store the data from the tail node
        Object removedData = tail.getNodeData();

        // If there's only one element in the list
        if (head == tail) {
            head = tail = null;
        } else {
            // Traverse to find the node before tail
            SLListNode current = head;
            while (current.getNextNode() != tail) {
                current = current.getNextNode();
            }
            // Remove reference to tail and update tail
            current.setNextNode(null);
            tail = current;
        }
        size--; // Decrease the size counter

        System.out.println("Removed from end: " + removedData);
        return removedData;
    }

    public void printList() {
        // Check if list is empty
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        // Start from head and traverse through all nodes
        System.out.print("List contents: ");
        SLListNode current = head;
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.getNextNode();
        }
    }

    //Gets the element at the specified position in the list
    public Object getElementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        SLListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        return current.getNodeData();
    }
}