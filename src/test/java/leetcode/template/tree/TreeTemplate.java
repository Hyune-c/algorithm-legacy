package leetcode.template.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTemplate {
  /**
   * @param root StartNode
   * @param arr  InputData
   * @param i    Recursive Index
   * @return root TreeNode
   */
  public TreeNode makeLevelOrderNodeTree(TreeNode root, Integer[] arr, int i) {
    if (i < arr.length) {
      if (arr[i] == null) root = null;
      else {
        TreeNode temp = new TreeNode(arr[i]);
        root = temp;
        root.left = (2 * i + 1 < arr.length)
            ? makeLevelOrderNodeTree(root.left, arr, 2 * i + 1) : null;
        root.right = (2 * i + 2 < arr.length)
            ? makeLevelOrderNodeTree(root.right, arr, 2 * i + 2) : null;
      }
    }

    return root;
  }

  public Integer[] getLevelOrderArray(TreeNode root, boolean isLeftFirst) {
    List<Integer> resultList = new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) queue.add(root);

    while (queue.size() != 0) {
      TreeNode tmp = queue.poll();
      resultList.add((tmp == null) ? null : tmp.val);
      if (isLeftFirst) {
        if (tmp.left != null) queue.add(tmp.left);
        if (tmp.right != null) queue.add(tmp.right);
//        queue.add((tmp == null) ? null : tmp.left);
//        queue.add((tmp == null) ? null : tmp.right);
      } else {
        if (tmp.right != null) queue.add(tmp.right);
        if (tmp.left != null) queue.add(tmp.left);
//        queue.add((tmp == null) ? null : tmp.right);
//        queue.add((tmp == null) ? null : tmp.left);
      }
    }

    return resultList.toArray(new Integer[0]);
  }

  public boolean isSameTree(TreeNode nodeA, TreeNode nodeB) {
    if (nodeA == null && nodeB == null) return true;
    if (nodeA == null || nodeB == null) return false;
    if (nodeA.val != nodeB.val) return false;

    return isSameTree(nodeA.left, nodeB.left) && isSameTree(nodeA.right, nodeB.right);
  }
}
