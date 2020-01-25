package leetcode.maximumdepthofbinarytree;

class Solution {
    public double inorder(TreeNode root, int depth) {
        double leftDepth = 0, rightDepth = 0;
        if (root.left != null)
            leftDepth = inorder(root.left, depth + 1);

        if (root.right != null)
            rightDepth = inorder(root.right, depth + 1);

        return Math.max(depth, Math.max(rightDepth, leftDepth));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return (int) inorder(root, 1);
    }
}