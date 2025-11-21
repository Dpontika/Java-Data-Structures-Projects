//Exception for invalid list positions

public class NoSuchListPosition extends RuntimeException {
    public NoSuchListPosition(String err) {
        super(err);
    }
}