//Queue implementation using SimpleLinkedList

import Queue.Queue;
import Queue.QueueFullException;
import Queue.QueueEmptyException;
import List.ListEmptyException;

public class LinkedListQueue implements Queue {

    private SimpleLinkedList list;

    public LinkedListQueue() {
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
        // With linked list implementation, queue is never full
        return false;
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty - cannot get front element");
        }
        // Front element is the first element in the list
        try {
            return list.getElementAt(0);
        } catch (IndexOutOfBoundsException e) {
            throw new QueueEmptyException("Queue is empty");
        }
    }

    @Override
    public void add(Object item) throws QueueFullException {
        // Add to the end of the list (rear of queue)
        list.insertLast(item);
    }

    @Override
    public Object remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty - cannot remove element");
        }
        // Remove from the beginning of the list (front of queue)
        try {
            return list.removeFirst();
        } catch (ListEmptyException e) {
            throw new QueueEmptyException("Queue is empty");
        }
    }

    // Queue contents from front to rear

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue contents (front to rear): ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getElementAt(i) + " ");
        }
        System.out.println();
    }
}