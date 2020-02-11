package leetcode.subtreeofanothertree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeofanothertreeTest {

  Solution sol;

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

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void isSubtree() {
    TreeNode root = makeLevelOrderNodeTree(null, new Integer[]{
        3, 4, 5, 1, 2, null, null, 0
    }, 0);

    TreeNode root2 = makeLevelOrderNodeTree(null, new Integer[]{
        4, 1, 2
    }, 0);


    System.out.println(sol.isSubtree(root, root2));
    System.out.println();
  }
}