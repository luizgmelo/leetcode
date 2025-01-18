import util.TreeNode;

public class MaxDepth {

    public static void main(String[] args) {
        var solution = new MaxDepth();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        int depth = solution.maxDepth(root);
        System.out.println("Depth: " + depth);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
