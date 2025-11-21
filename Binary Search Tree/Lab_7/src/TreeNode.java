public class TreeNode {

    private TreeNode left;
    private int item;
    private TreeNode right;

    public TreeNode(int data) {
        this.item = data;
        this.left = null;
        this.right = null;
    }

    // Returns the data stored in this node
    public int getNodeData() {
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
}