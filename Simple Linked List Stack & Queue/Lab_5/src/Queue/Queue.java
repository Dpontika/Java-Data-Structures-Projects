package Queue;

/**
 * Queue Interface
 * Defines the basic operations for a Queue data structure (FIFO - First In First Out)
 */

public interface Queue {
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public Object front() throws QueueEmptyException;
    public void add(Object item) throws QueueFullException;
    public Object remove() throws QueueEmptyException;
}