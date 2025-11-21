# **Stack and Queue Implementation using Linked List**



A Java implementation of fundamental data structures (Stack and Queue) using Linked List. It showcases how higher-level data structures can be built upon lower-level ones, 

emphasizing code reuse, abstraction, and the versatility of linked lists.



## **Features**



&nbsp;   Linked List-Based Stack: Complete LIFO implementation using SimpleLinkedList



&nbsp;   Linked List-Based Queue: Complete FIFO implementation using SimpleLinkedList



&nbsp;   Parentheses Validation: Practical application of stack for syntax checking



&nbsp;   Toll Booth Management: Real-world queue application for vehicle processing



&nbsp;   Exception Handling: Error management





## **Classes**



#### 1\. Stack Interface



Key Methods:



&nbsp;   size(): Returns number of elements in stack



&nbsp;   isEmpty(): Checks if stack contains no elements



&nbsp;   isFull(): Always returns false (linked list implementation)



&nbsp;   top(): Returns top element without removal



&nbsp;   push(Object item): Adds element to top of stack



&nbsp;   pop(): Removes and returns top element





#### 2\. Queue Interface



Key Methods:



&nbsp;   size(): Returns number of elements in queue



&nbsp;   isEmpty(): Checks if queue contains no elements



&nbsp;   isFull(): Always returns false (linked list implementation)



&nbsp;   front(): Returns front element without removal



&nbsp;   add(Object item): Adds element to end of queue



&nbsp;   remove(): Removes and returns front element



#### 3\. List Interface



Key Methods:



    isEmpty(): Returns true if list contains no elements



    size(): Returns the number of elements in the list



    insertFirst(Object data): Adds element at the beginning of the list



    insertLast(Object data): Adds element at the end of the list



    removeFirst(): Removes and returns the first element



    removeLast(): Removes and returns the last element





#### 4\. SimpleLinkedList Class



Implementation of the List interface using singly linked nodes



Attributes:



    head (SLListNode): Reference to the first node in the list



    tail (SLListNode): Reference to the last node in the list



    size (int): Current number of elements in the list



Main Methods:



    insertFirst(Object data): Adds element at beginning using head pointer



    insertLast(Object data): Adds element at end using tail pointer



    removeFirst(): Removes head element and updates head pointer



    removeLast(): Traverses to find and remove tail element



    getElementAt(int index): Returns element at specific position (0-based)



    printList(): Displays all elements from head to tail







#### 5\. LinkedListStack Class



Attributes:



&nbsp;   list (SimpleLinkedList): Underlying linked list storing stack elements



Main Methods:



&nbsp;   push(Object item): Adds to top via list.insertFirst()



&nbsp;   pop(): Removes from top via list.removeFirst()



&nbsp;   top(): Accesses top via list.getElementAt(0)



&nbsp;   display(): Shows all elements from top to bottom





#### 6\. LinkedListQueue Class



Attributes:



&nbsp;   list (SimpleLinkedList): Underlying linked list storing queue elements



Main Methods:



&nbsp;   add(Object item): Adds to rear via list.insertLast()



&nbsp;   remove(): Removes from front via list.removeFirst()



&nbsp;   front(): Accesses front via list.getElementAt(0)



&nbsp;   display(): Shows all elements from front to rear





#### 7\. ParenthesesChecker Class



Syntax validation tool for mathematical expressions using stack



Key Algorithms:



&nbsp;   Stack-Based Parsing: Uses LinkedListStack to track opening parentheses



&nbsp;   Position Tracking: Identifies exact error locations in expressions



&nbsp;   Balance Validation: Ensures every opening parenthesis has matching closing one



Main Methods:



&nbsp;   checkParentheses(String expression): Core validation logic



&nbsp;   analyzeExpression(String expression): Detailed analysis with reporting





#### 8\. CarQueueManagement Class



Toll booth management system using linked list queue



Attributes:



&nbsp;   carQueue (LinkedListQueue): Queue for managing waiting vehicles



Menu Operations:



&nbsp;   Car Arrival: Add vehicle to queue



&nbsp;   Car Departure: Process first vehicle



&nbsp;   Queue Status: Show waiting vehicles



&nbsp;   Exit: Terminate program

