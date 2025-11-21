public class BSTreeManagement {
    public static void main(String args[]) {
        // Array with the numbers to insert (in the given order)
        int matrix[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5};

        // Create a new binary search tree
        BSTree tree = new BSTree();

        // Insert all elements from the array into the tree
        for (int i = 0; i < matrix.length; i++) {
            tree.insertElement(matrix[i]);
        }

        // Perform and display all three traversal types
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
    }
}