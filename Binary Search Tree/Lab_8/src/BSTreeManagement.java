
public class BSTreeManagement
{
    public static void main(String args[]) {
        // Create Student objects with different student IDs
        Student[] students = {
                new Student("Papadopoulos", "Nikos", 40),
                new Student("Ioannou", "Maria", 15),
                new Student("Georgiou", "Kostas", 25),
                new Student("Vasileiou", "Eleni", 50),
                new Student("Antoniou", "Dimitris", 20),
                new Student("Nikolaou", "Sofia", 10),
                new Student("Dimitriou", "Giannis", 70),
                new Student("Pappas", "Anna", 55),
                new Student("Alexiou", "Petros", 45),
                new Student("Karagiannis", "Christos", 5)
        };

        // Create a new binary search tree
        BSTree tree = new BSTree();

        System.out.println("=== INSERTING STUDENTS INTO BST ===");
        // Insert all student objects into the tree
        for (int i = 0; i < students.length; i++) {
            tree.insertElement(students[i]);
            System.out.println("Inserted: " + students[i]);
        }

        // Display tree statistics
        System.out.println("\n=== TREE STATISTICS ===");
        System.out.println("Total nodes: " + tree.numberOfNodes());
        System.out.println("Tree height: " + tree.treeHeight());
        System.out.println("Is tree empty? " + tree.isEmpty());

        // Display height from specific nodes
        System.out.println("\n=== SUBTREE HEIGHTS ===");
        if (tree.getRoot() != null) {
            System.out.println("Height from root: " + tree.treeHeight(tree.getRoot()));
            if (tree.getRoot().getLeftNode() != null) {
                System.out.println("Height from left subtree: " +
                        tree.treeHeight(tree.getRoot().getLeftNode()));
            }
            if (tree.getRoot().getRightNode() != null) {
                System.out.println("Height from right subtree: " +
                        tree.treeHeight(tree.getRoot().getRightNode()));
            }
        }

        // Perform all three traversal types
        System.out.println("\n=== TREE TRAVERSALS ===");
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();

        // Test sorting
        System.out.println("\n=== SORTING DEMONSTRATION ===");
        Object[] sortedStudents = tree.sort();

        System.out.println("Sorted students by AM (Student ID):");
        for (int i = 0; i < sortedStudents.length; i++) {
            System.out.println((i + 1) + ". " + sortedStudents[i]);
        }

        // Check if nodes are leaves
        System.out.println("\n=== LEAF NODE CHECK ===");
        checkLeafNodes(tree.getRoot());
    }

    // Recursively checks and displays leaf nodes in the tree
    private static void checkLeafNodes(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            System.out.println("Leaf node: " + node.getNodeData());
        }

        checkLeafNodes(node.getLeftNode());
        checkLeafNodes(node.getRightNode());
    }
}

