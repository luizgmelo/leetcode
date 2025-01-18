import util.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        var solution = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(3);

        solution.invertTree(root);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // swap nodes
        root.left = right;
        root.right = left;

        return root;
    }
}

