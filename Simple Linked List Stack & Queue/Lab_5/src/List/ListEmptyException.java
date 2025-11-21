package List;

// Exception class for empty list
public class ListEmptyException extends RuntimeException
{
    public ListEmptyException(String err)
    { super(err); }
}