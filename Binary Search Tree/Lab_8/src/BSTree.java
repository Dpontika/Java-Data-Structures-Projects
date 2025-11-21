//Binary Search Tree implementation with Object data type

class BSTree {
    private TreeNode root;
    private int size; // Number of nodes in the tree


    BSTree() {
        root = null;
        size = 0;
    }

    // Check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Return total number of nodes in the tree
    public int numberOfNodes() {
        return size;
    }

    // Calculate the height of the entire tree
    public int treeHeight() {
        return treeHeight(root);
    }

    // Calculate the height of a subtree starting from given node data
    public int treeHeight(Object data) {
        if (data == null) {
            return 0;
        }

        // Recursively calculate heights of left and right subtrees
        int left = treeHeight(((TreeNode) data).getLeftNode());
        int right = treeHeight(((TreeNode) data).getRightNode());

        // Return the larger height plus 1 for current node
        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }

    //Insert a new element into the BST
    public void insertElement(Object data) {
        if (isEmpty()) {
            root = new TreeNode(data);
        } else {
            insertNode(data, root);
        }
        size++; // Increment node count
    }

    public void inOrderTraversal() {
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println();
    }

    public void preOrderTraversal() {
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println();
    }

    public void postOrderTraversal() {
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println();
    }

    // Recursively inserts data into the BST
    private void insertNode(Object data, TreeNode node) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data); // Delegate insertion to TreeNode class
        }
    }

    // Recursive inorder traversal (Left-Root-Right)
    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.getLeftNode());        // Process left subtree
        System.out.print(node.getNodeData() + " "); // Process current node
        inOrder(node.getRightNode());       // Process right subtree
    }

    //Recursive pre-order traversal (Root-Left-Right)
    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getNodeData() + " "); // Process current node first
        preOrder(node.getLeftNode());       // Process left subtree
        preOrder(node.getRightNode());      // Process right subtree
    }

    //Recursive post-order traversal (Left-Right-Root)
    private void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.getLeftNode());      // Process left subtree
        postOrder(node.getRightNode());     // Process right subtree
        System.out.print(node.getNodeData() + " "); // Process current node last
    }

    private int counter = 0; // Counter for sorting method

    // Sorts the elements in the BST using in-order traversal
    public Object[] sort() {
        Object[] newTable = new Object[size]; // Create array for sorted elements

        System.out.println("SORT ");

        counter = 0; // Reset counter for new sort operation

        inOrderSort(root, newTable); // Perform in-order traversal to fill array

        return newTable;
    }

    //Helper method for sorting - performs in-order traversal and stores elements in array
    private void inOrderSort(TreeNode node, Object[] table) {
        if (node == null) {
            return;
        }

        inOrderSort(node.getLeftNode(), table);  // Process left subtree
        table[counter++] = node.getNodeData();   // Store current node data
        inOrderSort(node.getRightNode(), table); // Process right subtree
    }

    //Returns the root node of the tree
    public TreeNode getRoot() {
        return root;
    }
}