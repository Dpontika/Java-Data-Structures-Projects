public class BSTree {

    private TreeNode root;

    public BSTree() {
        root = null;
    }
    public TreeNode getRoot() {
        return root;
    }

    // Checks if the tree is empty
    public boolean isEmpty() {
        return (root == null);
    }

    // Insert an element into the tree
    public void insertElement(int data) {
        if (isEmpty()) {
            root = new TreeNode(data);
        } else {
            insertNode(data, root);
        }
    }

    // Inorder traversal
    public void inOrderTraversal() {
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println();
    }

    // Preorder traversal
    public void preOrderTraversal() {
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println();
    }

    // Postorder traversal
    public void postOrderTraversal() {
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println();
    }

    // RECURSIVE PRIVATE METHODS

    // Recursively inserts a new node in the BST
    private void insertNode(int data, TreeNode node) {
        if (data < node.getNodeData()) {
            // Go to left subtree
            if (node.getLeftNode() == null) {
                node.setLeftNode(new TreeNode(data));
            } else {
                insertNode(data, node.getLeftNode());
            }
        } else {
            // Go to right subtree
            if (node.getRightNode() == null) {
                node.setRightNode(new TreeNode(data));
            } else {
                insertNode(data, node.getRightNode());
            }
        }
    }

    // Recursive inorder traversal (Left-Root-Right)
    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.getLeftNode());
            System.out.print(node.getNodeData() + " ");
            inOrder(node.getRightNode());
        }
    }

    // Recursive preorder traversal (Root-Left-Right)
    private void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getNodeData() + " ");
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
    }

    // Recursive postorder traversal (Left-Right-Root)
    private void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            System.out.print(node.getNodeData() + " ");
        }
    }
}