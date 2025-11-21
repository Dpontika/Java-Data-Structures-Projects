package Stack;//Exception when trying to add to a full stack

public class StackFullException extends RuntimeException {
    public StackFullException(String err) {
        super(err);
    }
}