package leetcode.template.tree;

public class TreeTemplate {
  /**
   * Make node tree tree node.
   *
   * @param root StartNode
   * @param arr  InputData
   * @param i    Recursive Index
   * @return root TreeNode
   */
  public TreeNode makeNodeTree(TreeNode root, int[] arr, int i) {
    if (i < arr.length) {
      TreeNode temp = new TreeNode(arr[i]);
      root = temp;
      root.left = (2 * i + 1 < arr.length)
          ? makeNodeTree(root.left, arr, 2 * i + 1) : null;
      root.right = (2 * i + 2 < arr.length)
          ? makeNodeTree(root.right, arr, 2 * i + 2) : null;
    }

    return root;
  }

  public boolean isSameTree(TreeNode nodeA, TreeNode nodeB) {
    if (nodeA == null && nodeB == null) return true;
    if (nodeA == null || nodeB == null) return false;
    if (nodeA.val != nodeB.val) return false;

    return isSameTree(nodeA.left, nodeB.left) && isSameTree(nodeA.right, nodeB.right);
  }
}
