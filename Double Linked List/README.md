# **Doubly Linked List Implementation**



A comprehensive Java implementation of a doubly linked list data structure that demonstrates advanced linked list concepts including position-based operations, inheritance-based node design, and sorted list maintenance. 

The implementation showcases how doubly linked lists enable efficient forward and backward traversal compared to singly linked lists.



## **Features**



&nbsp;   Bidirectional Traversal: Support for both forward and backward navigation through the list



&nbsp;   Position-Based Operations: Insertion and removal at any valid position within the list



&nbsp;   Two Implementation Approaches: Standalone node class and inheritance-based node class



&nbsp;   Comprehensive Error Handling: Custom exceptions for empty list and invalid position scenarios



&nbsp;   Menu-Driven Management: Complete user interface for list operations



&nbsp;   Sorted List Extension: Framework for maintaining elements in sorted order



## **Classes**



#### 1\. DoubleNode Class (Standalone Approach)



Attributes:



&nbsp;   item (Object): Data element stored in the node



&nbsp;   next (DoubleNode): Reference to the subsequent node in the list



&nbsp;   previous (DoubleNode): Reference to the preceding node in the list



Key Methods:



&nbsp;   getItem(): Retrieves the data stored in the node



&nbsp;   getNext(): Returns reference to the next node



&nbsp;   getPrevious(): Returns reference to the previous node



&nbsp;   setNext(DoubleNode): Updates the next node reference



&nbsp;   setPrevious(DoubleNode): Updates the previous node reference





#### 2\. DoubleNodeInheritance Class (Alternative Approach)



Attributes:



&nbsp;   previousNode (DoubleNodeInheritance): Additional previous pointer beyond inherited next pointer





#### 3\. List Interface (Extended)



Enhanced interface defining operations for position-based list manipulation



Key Methods:



&nbsp;   insert(int position, Object data): Inserts element at specified position (0-based index)



&nbsp;   remove(int position): Removes element from specified position



&nbsp;   Standard operations: isEmpty(), size(), insertFirst(), insertLast(), removeFirst(), removeLast()





#### 4\. DoubleLinkedList Class



Complete implementation of doubly linked list with bidirectional traversal



Attributes:



&nbsp;   head (DoubleNode): Reference to first node in list



&nbsp;   tail (DoubleNode): Reference to last node in list



&nbsp;   size (int): Current number of elements in list



Key Methods:



&nbsp;       insertFirst(): Adds to head with previous pointer management



&nbsp;       insertLast(): Adds to tail using tail pointer



&nbsp;       insert(position): Traverses to specific position



&nbsp;       removeFirst(): Removes from head with pointer updates



&nbsp;       removeLast(): Removes from tail using tail pointer



&nbsp;       remove(position): Traverses to specific position





#### 5\. DoubleListManagement Class



Menu Options:



&nbsp;   Insert at Beginning: Add element to list start



&nbsp;   Insert at End: Add element to list end



&nbsp;   Insert at Position: Add element at specific index



&nbsp;   Remove from Beginning: Delete first element



&nbsp;   Remove from End: Delete last element



&nbsp;   Remove from Position: Delete element at specific index



&nbsp;   List Length: Display current size



&nbsp;   Check Empty: Verify if list contains elements



&nbsp;   Print List: Display elements in forward order



&nbsp;   Print Reverse: Display elements in backward order



&nbsp;   Exit: Terminate application



#### 6\. SortedDoubleLinkedList Class



Extended doubly linked list that maintains elements in sorted order



Key Methods:



&nbsp;   isSorted(): Verification method for sorted order maintenance



&nbsp;   insertSorted(): Intelligent insertion that preserves sort order





