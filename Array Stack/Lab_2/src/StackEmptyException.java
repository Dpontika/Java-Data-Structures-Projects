// Exception when trying to access an empty stack

public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String err) {
        super(err);
    }
}