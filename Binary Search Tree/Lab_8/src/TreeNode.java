
public class TreeNode {
    private TreeNode left;
    private Object item;
    private TreeNode right;

    // Constructor
    public TreeNode(Object data) {
        this.item = data;
        this.left = null;
        this.right = null;
    }

    // Returns the data stored in this node
    public Object getNodeData() {
        return item;
    }

    // Returns the left child node
    public TreeNode getLeftNode() {
        return left;
    }

    // Returns the right child node
    public TreeNode getRightNode() {
        return right;
    }

    // Checks if this node is a leaf (has no children)
    public boolean isLeaf() {
        return (left == null && right == null);
    }

    // Sets the left child node
    public void setLeftNode(TreeNode node) {
        this.left = node;
    }

    // Sets the right child node
    public void setRightNode(TreeNode node) {
        this.right = node;
    }

    // Recursively insert data into the BST and Use Comparable interface for comparison
    @SuppressWarnings("unchecked")
    public void insert(Object d) {
        // Compare current node's data with new data
        if (((Comparable) item).compareTo(((Comparable) d)) > 0) {
            // New data is smaller - go to left subtree
            if (left == null) {
                left = new TreeNode(d);
            } else {
                left.insert(d);
            }
        } else {
            // New data is larger or equal - go to right subtree
            if (right == null) {
                right = new TreeNode(d);
            } else {
                right.insert(d);
            }
        }
    }
}