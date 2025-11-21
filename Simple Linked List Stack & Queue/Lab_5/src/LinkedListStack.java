// Stack implementation using SimpleLinkedList

import List.ListEmptyException;
import Stack.Stack;
import Stack.StackEmptyException;
import Stack.StackFullException;

public class LinkedListStack implements Stack {
    private SimpleLinkedList list;

    public LinkedListStack() {
        list = new SimpleLinkedList();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        // With linked list implementation, stack is never full
        return false;
    }

    @Override
    public Object top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack.Stack is empty");
        }
        // For stack, top element is the first element in the list
        try {
            return list.getElementAt(0);
        } catch (IndexOutOfBoundsException e) {
            throw new StackEmptyException("Stack.Stack is empty");
        }
    }

    @Override
    public void push(Object item) throws StackFullException {
        // Add to the beginning of the list (top of stack)
        list.insertFirst(item);
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack.Stack is empty - cannot pop element");
        }
        // Remove from the beginning of the list (top of stack)
        try {
            return list.removeFirst();
        } catch (ListEmptyException e) {
            throw new StackEmptyException("Stack.Stack is empty");
        }
    }

    //Displays stack contents from top to bottom
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack.Stack is empty");
            return;
        }

        System.out.print("Stack.Stack contents (top to bottom): ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getElementAt(i) + " ");
        }
        System.out.println();
    }
}