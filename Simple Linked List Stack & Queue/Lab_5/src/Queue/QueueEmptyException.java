package Queue;// Exception thrown when trying to access an empty queue

public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException(String err) {
        super(err);
    }
}