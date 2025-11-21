// Array sort using Binary Search Tree

public class BSTreeArraySort {

    public static void main(String[] args) {
        int[] arrayToSort = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5};

        System.out.println("Original array:");
        printArray(arrayToSort);

        // Sort the array using BST inorder traversal
        int[] sortedArray = sortUsingBST(arrayToSort);

        System.out.println("\nSorted array (using BST):");
        printArray(sortedArray);
    }

    // Method that sorts an array using BST inorder traversal
    public static int[] sortUsingBST(int[] array) {
        // Create a BST and insert all elements
        BSTree tree = new BSTree();
        for (int i = 0; i < array.length; i++) {
            tree.insertElement(array[i]);
        }

        // Create an array to store the sorted elements
        int[] sortedArray = new int[array.length];

        // Perform inorder traversal and store elements in the array
        int[] index = {0}; // Using array to simulate pass-by-reference
        inOrderToArray(tree.getRoot(), sortedArray, index);

        return sortedArray;
    }

    // Modified inorder traversal that stores elements in an array
    private static void inOrderToArray(TreeNode node, int[] array, int[] index) {
        if (node != null) {
            // Traverse left subtree
            inOrderToArray(node.getLeftNode(), array, index);

            // Store current node's data in array
            array[index[0]] = node.getNodeData();
            index[0]++; // Move to next position

            // Traverse right subtree
            inOrderToArray(node.getRightNode(), array, index);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}