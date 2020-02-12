package leetcode.mergetwobinarytrees;

import java.util.Optional;

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        t1 = Optional.ofNullable(t1).orElse(new TreeNode(0));
        t2 = Optional.ofNullable(t2).orElse(new TreeNode(0));

        TreeNode treeNode = new TreeNode(t1.val + t2.val);

        treeNode.left = mergeTrees(t1.left, t2.left);
        treeNode.right = mergeTrees(t1.right, t2.right);

        return treeNode;
    }
}