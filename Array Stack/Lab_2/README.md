# **Stack Implementation Using Arrays**



A comprehensive Java implementation of the Stack data structure using arrays.



## **Features**



&nbsp;   Array-Based Stack Implementation: Efficient stack operations using fixed-size arrays with bounds checking



&nbsp;   Exception Handling: Error management for stack underflow and overflow conditions



&nbsp;   Student Management System: Practical application using custom Student objects in stack operations



&nbsp;   Parentheses Validation: Advanced syntax checking for mathematical expressions with multiple bracket types



&nbsp;   LIFO Processing: Demonstration of Last-In-First-Out principle in data processing



## **Classes**

#### 

#### 1\. Stack Interface



Key Methods:



&nbsp;   size(): Returns the number of elements in the stack



&nbsp;   isEmpty(): Checks if the stack contains no elements



&nbsp;   isFull(): Verifies if the stack has reached capacity



&nbsp;   top(): Retrieves the top element without removal



&nbsp;   push(Object item): Adds a new element to the top of the stack



&nbsp;   pop(): Removes and returns the top element





#### 2\. ArrayStack Class 



Attributes:



&nbsp;   stackArray (Object\[]): Internal array for element storage



&nbsp;   top (int): Index pointer to the top element (-1 when empty)



&nbsp;   capacity (int): Maximum number of elements the stack can hold



Main Methods:



&nbsp;   push(Object item): Adds element with stack full validation



&nbsp;   pop(): Removes element with stack empty validation



&nbsp;   display(): Debugging utility to show stack contents



&nbsp;   Automatic exception handling for boundary conditions





#### 3\. StackEmptyException Class 



Custom runtime exception for stack underflow conditions.



#### 4\. StackFullException Class



Custom runtime exception for stack overflow conditions.





#### 5\. Student Class 



Attributes:



&nbsp;   studentId (int): Unique identifier for the student



&nbsp;   firstName (String): Student's first name



&nbsp;   lastName (String): Student's last name



&nbsp;   grade (double): Academic performance score



#### 

#### 6\. ParenthesesChecker Class



Main Methods:



&nbsp;   checkParentheses(String expression): Core validation logic



&nbsp;   analyzeExpression(String expression): Detailed analysis with reporting



