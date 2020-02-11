package leetcode.subtreeofanothertree;

class Solution {

  boolean result = false;
  TreeNode t;

  public void preorder(TreeNode root) {
    if (root != null) {
      if (root.val == t.val && isSameTree(root, t)) result = true;
      preorder(root.left);
      preorder(root.right);
    }
  }

  public boolean isSameTree(TreeNode nodeA, TreeNode nodeB) {
    if (nodeA == null && nodeB == null) return true;
    if (nodeA == null || nodeB == null) return false;
    if (nodeA.val != nodeB.val) return false;

    return isSameTree(nodeA.left, nodeB.left) && isSameTree(nodeA.right, nodeB.right);
  }

  public boolean isSubtree(TreeNode s, TreeNode t) {
    this.t = t;

    preorder(s);

    return result;
  }
}