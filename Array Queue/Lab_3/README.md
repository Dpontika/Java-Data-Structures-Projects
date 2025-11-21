# **Queue Implementation Using Arrays**



A comprehensive Java implementation of the Queue data structure using arrays



## **Features**



&nbsp;   Array-Based Queue Implementation: Efficient queue operations using linear array storage



&nbsp;   Exception Handling: Error management for queue underflow and overflow



&nbsp;   Student Management System: Practical application using Student objects in queue operations



&nbsp;   Toll Booth Simulation: Complete management system for vehicle processing



&nbsp;   Menu-Driven Interface: User-friendly console application for toll management



## **Classes**



#### 1\. Queue Interface



Key Methods:



&nbsp;   size(): Returns current number of elements



&nbsp;   isEmpty(): Checks if queue contains no elements



&nbsp;   isFull(): Verifies if queue has reached capacity



&nbsp;   front(): Retrieves front element without removal



&nbsp;   enqueue(Object item): Adds element to the end of queue



&nbsp;   dequeue(): Removes and returns front element





#### 2\. ArrayQueue Class



Attributes:



&nbsp;   queueArray (Object\[]): Internal array for element storage



&nbsp;   front (int): Index pointer to front element (starts at 0)



&nbsp;   rear (int): Index pointer to next insertion position (starts at 0)



&nbsp;   capacity (int): Maximum number of elements queue can hold



Main Methods:



&nbsp;   enqueue(Object item): Adds element with full queue validation



&nbsp;   dequeue(): Removes element with empty queue validation



&nbsp;   display(): Shows current queue contents from front to rear





#### 3\. QueueEmptyException Class



Handles attempts to access elements from empty queue



#### 4\. QueueFullException Class



&nbsp;Handles attempts to add elements to full queue



#### 5\. Student Class



Attributes:



&nbsp;   studentId (int): Unique student identifier



&nbsp;   firstName (String): Student's first name



&nbsp;   lastName (String): Student's last name



&nbsp;   grade (double): Academic performance score



#### 6\. Car Class



Attributes:



&nbsp;   licensePlate (String): Vehicle identification number



&nbsp;   arrivalTime (String): Time when car joined queue





#### 7\. CarQueueManagement Class



Attributes:



&nbsp;   carQueue (ArrayQueue): Queue for managing waiting vehicles



&nbsp;   capacity (int): Maximum queue size (10 vehicles)



Main Methods:



&nbsp;   addCar(): Handles vehicle arrival and queue addition



&nbsp;   removeCar(): Processes vehicle departure from front



&nbsp;   displayQueueStatus(): Shows current waiting vehicles



&nbsp;   main(): Application entry point with menu loop

