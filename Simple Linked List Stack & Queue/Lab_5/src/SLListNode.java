/**
 * Represents a single node in a singly linked list
 * Each node contains data and a reference to the next node
 */

public class SLListNode
{
    // The data stored in this node
    private Object data;
    // Reference to the next node in the list
    private SLListNode nextNode;

    public SLListNode(Object data) {
        this.data = data;
        this.nextNode = null; // Initially, no next node
    }


    public void setItem(Object newItem)
    {
        data = newItem;
    }

    public void setNext(SLListNode newNext)
    {
        nextNode = newNext;
    }

    public Object getItem()
    {
        return data;
    }

    public SLListNode getNext()
    {
        return nextNode;
    }

    public Object getNodeData()
    {
        return data;
    }

    public SLListNode getNextNode()
    {
        return nextNode;
    }

    public void setNodeData(Object d)
    {
        data = d;
    }

    public void setNextNode(SLListNode n)
    {
        nextNode = n;
    }

    public String toString()
    {
        return data.toString();
    }
}