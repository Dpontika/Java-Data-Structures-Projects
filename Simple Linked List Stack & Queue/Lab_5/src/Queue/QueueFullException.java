package Queue;//Exception thrown when trying to add to a full queue

public class QueueFullException extends RuntimeException {
    public QueueFullException(String err) {
        super(err);
    }
}