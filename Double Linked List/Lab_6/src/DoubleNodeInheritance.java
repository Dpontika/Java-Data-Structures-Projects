/**
 * DoubleNode using inheritance from SLListNode
 * Extends the singly linked list node to add previous pointer
 */

public class DoubleNodeInheritance extends SLListNode {
    // Reference to the previous node in the list
    private DoubleNodeInheritance previousNode;

    public DoubleNodeInheritance(Object data) {
        super(data); // Call parent constructor
        this.previousNode = null; // Initialize previous to null
    }

    public DoubleNodeInheritance(Object data, DoubleNodeInheritance next, DoubleNodeInheritance previous) {
        super(data); // Call parent constructor
        setNextNode(next); // Set next node using parent method
        this.previousNode = previous; // Set previous node
    }

    // Getters - Setters
    public DoubleNodeInheritance getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleNodeInheritance n) {
        this.previousNode = n;
    }

    @Override
    public DoubleNodeInheritance getNextNode() {
        return (DoubleNodeInheritance) super.getNextNode();
    }
}