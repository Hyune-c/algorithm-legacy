package leetcode.binarytreeinordertraversal;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;

class Solution {
  public List<Integer> inorderTraversal_recursive(TreeNode root) {
    if (root == null) return Arrays.asList();

    List<Integer> result = new LinkedList<>();

    result.addAll(inorderTraversal_recursive(root.left));
    result.addAll(Arrays.asList(root.val));
    result.addAll(inorderTraversal_recursive(root.right));

    return result;
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    if (root == null) {
      return result;
    }
    stack.add(root);
    while (!stack.isEmpty()) {
      while (root != null) {
        stack.add(root);
        root = root.left;
      }
      root = stack.removeLast();
      result.add(root.val);
      root = root.right;
    }

    result.remove(result.size() - 1);
    return result;
  }
}
