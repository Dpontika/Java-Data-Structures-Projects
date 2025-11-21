/**
 * Array-based implementation of the Stack interface
 * Uses a fixed-size array to store stack elements
 */

public class ArrayStack implements Stack {
    private Object[] stackArray;    // Array to store stack elements
    private int top = -1;                // Index of top element
    private int capacity;           // Maximum capacity of stack

    //Constructor with default capacity of 100
    public ArrayStack() {
        this(100); // Default capacity
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new Object[capacity];
    }

    // Returns the number of elements in the stack
    @Override
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    @Override
    public boolean isFull() {
        return (top == capacity);
    }

    //Return the element without removing it
    @Override
    public Object top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return stackArray[top];
    }

    // Add new element to the top of the stack
    @Override
    public void push(Object item) throws StackFullException {
        if (isFull()) {
            throw new StackFullException("Stack is full");
        };
        stackArray[++top] = item;
        System.out.println("Pushed: " + item);
    }

    // Remove and returns the top element
    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        Object item = stackArray[top];
        stackArray[top--] = null; // Help garbage collection
        System.out.println("Popped: " + item);
        return item;
    }

    /**
     * Displays all elements in the stack (for debugging)
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack contents (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
    }
}