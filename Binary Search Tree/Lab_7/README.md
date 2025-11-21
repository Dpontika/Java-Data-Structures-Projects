# **Binary Search Tree Implementation** 



This project implements a Binary Search Tree (BST) data structure in Java with comprehensive functionality including tree traversals and a unique array sorting algorithm based on BST properties.



## **Features**

&nbsp;	

In-Order Traversal (Left-Root-Right):



    Visits left subtree, then root, then right subtree



    Result: Elements in ascending order



    Use: Sorting, getting elements in order



Pre-Order Traversal (Root-Left-Right):



    Visits root, then left subtree, then right subtree



    Use: Copying tree structure, prefix expressions



Post-Order Traversal (Left-Right-Root):



    Visits left subtree, then right subtree, then root



    Use: Deleting trees, postfix expressions





## **Classes**



#### 1\. TreeNode Class



Represents individual nodes in the binary search tree.

java

Key Methods:



&nbsp;   getNodeData(): Returns the integer data stored in the node



&nbsp;   getLeftNode(): Returns reference to left child node



&nbsp;   getRightNode(): Returns reference to right child node



&nbsp;   isLeaf(): Checks if node has no children (leaf node)



&nbsp;   setLeftNode(TreeNode node): Sets left child node



&nbsp;   setRightNode(TreeNode node): Sets right child node





#### 2\. BSTree Class



Implements the core BST operations and traversal algorithms.



Key Methods:



&nbsp;	Public Methods:



&nbsp;   		BSTree(): Constructor - initializes empty tree



&nbsp;   		isEmpty(): Checks if tree is empty



&nbsp;   		insertElement(int data): Public insert method



&nbsp;   		getRoot(): Returns root node (used for sorting)



&nbsp;   		inOrderTraversal(): Displays in-order traversal



&nbsp;   		preOrderTraversal(): Displays pre-order traversal



&nbsp;   		postOrderTraversal(): Displays post-order traversal



&nbsp;	Private Recursive Methods:



&nbsp;   		insertNode(int data, TreeNode node): Recursively inserts nodes



&nbsp;   		inOrder(TreeNode node): Recursive in-order traversal



&nbsp;   		preOrder(TreeNode node): Recursive pre-order traversal



&nbsp;   		postOrder(TreeNode node): Recursive post-order traversal





#### 3\. BSTreeManagement Class



The BST functionality with the required test data.





#### 4\. BSTreeArraySort Class



Implements array sorting using BST in-order traversal property.

java



Key Methods:



&nbsp;   sortUsingBST(int\[] array): Main sorting method



&nbsp;   inOrderToArray(TreeNode node, int\[] array, int\[] index): Modified in-order traversal that stores elements in array



&nbsp;   printArray(int\[] array): Utility method to display arrays

