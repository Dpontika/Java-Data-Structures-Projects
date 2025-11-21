/**
 * DoubleNode class for doubly linked list
 * Contains references to both next and previous nodes
 */

class DoubleNode {
    private Object item;
    private DoubleNode next;
    private DoubleNode previous;

    // Default constructor
    public DoubleNode() {
        this(null, null, null);
    }

    // Constructor with data, next, and previous nodes
    public DoubleNode(Object data, DoubleNode n, DoubleNode p) {
        item = data;
        next = n;
        previous = p;
    }

    // Getters - Setters
    public Object getItem() {
        return item;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setItem(Object newItem) {
        item = newItem;
    }

    public void setNext(DoubleNode newNext) {
        next = newNext;
    }

    public void setPrevious(DoubleNode newPrevious) {
        previous = newPrevious;
    }

    // String representation
    public String toString() {
        return item.toString();
    }
}