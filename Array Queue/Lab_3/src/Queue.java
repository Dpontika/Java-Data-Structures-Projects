/**
 * Queue Interface
 * Defines the basic operations for a Queue data structure (FIFO - First In First Out)
 */
public interface Queue {

    // Returns the number of elements in the queue
    public int size();

    // Returns true if the queue is empty
    public boolean isEmpty();

    // Returns true if the queue is full
    public boolean isFull();

    // Returns the first element without removing it
    public Object front() throws QueueEmptyException;

    // Adds a new element to the end of the queue
    public void enqueue(Object item) throws QueueFullException;

    // Removes and returns the first element
    public Object dequeue() throws QueueEmptyException;
}