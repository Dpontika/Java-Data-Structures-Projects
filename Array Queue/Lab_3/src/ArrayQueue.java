/**
 * Array-based implementation of the Queue interface
 * Implements FIFO (First In First Out) principle
 */

public class ArrayQueue implements Queue {
    private Object[] queueArray;    // Array to store queue elements
    private int front=0;              // Index of front element
    private int rear=0;               // Index where next element will be added
    private int capacity;           // Maximum capacity of queue

    // Constructor with default capacity of 100
    public ArrayQueue() {
        this(100); // Default capacity
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new Object[capacity];
    }


    @Override
    public int size() {
        return rear - front;
    }

    @Override
    public boolean isEmpty() {
        return rear == front;
    }

    @Override
    public boolean isFull() {
        return size() == capacity;
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return queueArray[front];
    }

    @Override
    public void enqueue(Object item) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Queue overflow");
        }

        queueArray[rear++] = item;
        System.out.println("Enqueued: " + item);
        System.out.println("Queue size: " + size() + ", Front: " + front + ", Rear: " + rear);
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }

        Object item = queueArray[front];
        queueArray[front++] = null; // Help garbage collection

        System.out.println("Dequeued: " + item);
        System.out.println("Queue size: " + size() + ", Front: " + front + ", Rear: " + rear);
        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue contents (front to rear): ");
        for (int i = front; i < rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
    }

}