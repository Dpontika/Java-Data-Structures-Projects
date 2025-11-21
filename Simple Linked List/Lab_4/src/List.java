public interface List
{
    // Checks if the list is empty
    public boolean isEmpty( );

    //Returns the number of elements in the list
    public int size( );

    //Inserts an element at the beginning of the list
    public void insertFirst(Object data);

    // Inserts an element at the end of the list
    public void insertLast(Object data);

    //Removes and returns the first element from the list
    public Object removeFirst( ) throws ListEmptyException;

    //Removes  and returns the last element from the list
    public Object removeLast( ) throws ListEmptyException;
}