public interface Stack {

    //Returns the number of elements in the stack
    public int size();

    // Returns true if the stack is empty
    public boolean isEmpty();

    // Returns true if the stack is full
    public boolean isFull();

    // Returns the top element without removing it
    public Object top() throws StackEmptyException;

    // Add new element to the top of the stack
    public void push(Object element) throws StackFullException;

    // Removes and returns the top element
    public Object pop() throws StackEmptyException;
}