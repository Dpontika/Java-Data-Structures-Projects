# **Simple Linked List Implementation**



A Java implementation of a singly linked list data structure that demonstrates fundamental linked list operations and showcases how to efficiently 

find minimum and maximum values in a collection of student records.



## **Features**



&nbsp;   Complete Linked List Implementation: Full implementation of singly linked list with head and tail pointers



&nbsp;   Efficient Operations: O(1) insertion at beginning/end, O(n) removal from end



&nbsp;   Student Management System: Practical application managing student records with grade analysis



&nbsp;   Menu-Driven Interface: User-friendly console application for list management



&nbsp;   Min/Max Grade Analysis: Algorithm to find students with highest and lowest grades



&nbsp;   Exception Handling: Error management for empty list operations





## **Classes**



#### 1\. List Interface



Key Methods:



&nbsp;   isEmpty(): Returns true if list contains no elements



&nbsp;   size(): Returns the number of elements in the list



&nbsp;   insertFirst(Object data): Adds element at the beginning of the list



&nbsp;   insertLast(Object data): Adds element at the end of the list



&nbsp;   removeFirst(): Removes and returns the first element



&nbsp;   removeLast(): Removes and returns the last element





#### 2\. ListEmptyException Class



Exception when attempting to remove elements from an empty list



#### 3\. SLListNode Class



Represents a single node in the linked list



Attributes:



&nbsp;   data (Object): The element stored in this node



&nbsp;   nextNode (SLListNode): Reference to the next node in the list



Key Methods:



&nbsp;   getNodeData(): Returns the data stored in the node



&nbsp;   getNextNode(): Returns reference to the next node



&nbsp;   setNodeData(Object d): Updates the node's data



&nbsp;   setNextNode(SLListNode n): Sets the next node reference



&nbsp;   toString(): Returns string representation of the node's data





#### 4\. SimpleLinkedList Class



Implementation of the List interface using singly linked nodes



Attributes:



&nbsp;   head (SLListNode): Reference to the first node in the list



&nbsp;   tail (SLListNode): Reference to the last node in the list



&nbsp;   size (int): Current number of elements in the list



Main Methods:



&nbsp;   insertFirst(Object data): Adds element at beginning using head pointer



&nbsp;   insertLast(Object data): Adds element at end using tail pointer



&nbsp;   removeFirst(): Removes head element and updates head pointer



&nbsp;   removeLast(): Traverses to find and remove tail element



&nbsp;   getElementAt(int index): Returns element at specific position (0-based)



&nbsp;   printList(): Displays all elements from head to tail





#### 5\. Student Class



Object representing a student with academic information



Attributes:



&nbsp;   studentId (int): Unique identifier for the student



&nbsp;   firstName (String): Student's first name



&nbsp;   lastName (String): Student's last name



&nbsp;   grade (double): Academic performance score





#### 6\. StudentLinkedList Class





Attributes:



    studentList (SimpleLinkedList): Underlying list storing Student objects



Main Methods:



    addStudent(Student student): Adds student to the list



    findMinMaxStudents(): Returns array with \[minStudent, maxStudent]



    printAllStudents(): Displays all students with numbering



    printMinMaxStudents(): Shows students with highest and lowest grades







#### 7\. SLListManagement Class



Menu Options:



&nbsp;   Insert at beginning



&nbsp;   Insert at end



&nbsp;   Delete from beginning



&nbsp;   Delete from end



&nbsp;   Display list length



&nbsp;   Check if list is empty



&nbsp;   Print all list contents



&nbsp;   Exit program



#### 

