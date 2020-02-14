package leetcode.trimabinarysearchtree;

import leetcode.template.binarytree.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrimabinarysearchtreeTest {

  Solution sol;
  TemplateTree tt;

  @BeforeEach
  void setUp() {
    sol = new Solution();
    tt = new TemplateTree();
  }

  public TreeNode trimBST(TreeNode root, int L, int R) {
    if (root == null) return null;

    if (root.val < L) return trimBST(root.right, L, R);
    if (root.val > R) return trimBST(root.left, L, R);

    root.left = trimBST(root.left, L, R);
    root.right = trimBST(root.right, L, R);

    return root;
  }

  @Test
  void trimBST() {
    Integer[] inputArr = new Integer[]{1, 0, 2};
    TreeNode inputRootNode = tt.makeLevelOrderNodeTree(null, inputArr, 0);
    inputRootNode = trimBST(inputRootNode, 1, 2);

    Integer[] expectedArr = new Integer[]{1, null, 2};
    TreeNode expectedRootNode = tt.makeLevelOrderNodeTree(null, expectedArr, 0);

    assertEquals(true, tt.isSameTree(expectedRootNode, inputRootNode));
  }

  @Test
  void trimBST2() {
    Integer[] inputArr = new Integer[]{3, 1, 4, null, 2};
    TreeNode inputRootNode = tt.makeLevelOrderNodeTree(null, inputArr, 0);
    inputRootNode = trimBST(inputRootNode, 3, 4);

    Integer[] expectedArr = new Integer[]{3, null, 4};
    TreeNode expectedRootNode = tt.makeLevelOrderNodeTree(null, expectedArr, 0);

    assertEquals(true, tt.isSameTree(expectedRootNode, inputRootNode));
  }

  @Test
  void trimBST3() {
    Integer[] inputArr = new Integer[]{45, 30, 46, 10, 36, null, 49, 8, 24, 34, 42, 48
        , null, 4, 9, 14, 25, 31, 35, 41, 43, 47, null, 0, 6, null, null, 11, 20, null
        , 28, null, 33, null, null, 37, null, null, 44, null, null, null, 1, 5, 7, null
        , 12, 19, 21, 26, 29, 32, null, null, 38, null, null, null, 3, null, null, null
        , null, null, 13, 18, null, null, 22, null, 27, null, null, null, null, null
        , 39, 2, null, null, null, 15, null, null, 23, null, null, null, 40, null, null
        , null, 16, null, null, null, null, null, 17};
    TreeNode inputRootNode = tt.makeLevelOrderNodeTree(null, inputArr, 0);
    inputRootNode = trimBST(inputRootNode, 32, 44);

    Integer[] expectedArr = new Integer[]{36, 34, 42, 33, 35, 41, 43, 32, null, null
        , null, 37, null, null, 44, null, null, null, 38, null, null, null, 39, null, 40};
    TreeNode expectedRootNode = tt.makeLevelOrderNodeTree(null, expectedArr, 0);

    assertEquals(true, tt.isSameTree(expectedRootNode, inputRootNode));
  }
}