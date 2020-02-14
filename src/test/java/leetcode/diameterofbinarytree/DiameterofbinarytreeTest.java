package leetcode.diameterofbinarytree;

import leetcode.template.binarytree.TemplateTree;
import leetcode.template.binarytree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterofbinarytreeTest {

  Solution sol;
  TemplateTree tt;

  @BeforeEach
  void setUp() {
    sol = new Solution();
    tt = new TemplateTree();
  }

  public int preoder(TreeNode root, int depth) {
    if (root == null) return depth;

    int maxDepth = depth;

    maxDepth = Math.max(preoder(root.left, depth), preoder(root.right, depth));

    return maxDepth + 1;
  }

  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) return 0;
    int left = preoder(root.left, 0);
    int right = preoder(root.right, 0);
    return left + right;
  }

  @Test
  void diameterOfBinaryTree() {
    Integer[] inputArr = new Integer[]{1, 2, 3, 4, 5};
    TreeNode treeNode = tt.makeLevelOrderNodeTree(null, inputArr, 0);
    int expectd = 3;

    assertEquals(expectd, diameterOfBinaryTree(treeNode));
  }

  @Test
  void diameterOfBinaryTree2() {
    Integer[] inputArr = new Integer[]{4, -7, -3, null, null, -9, -3, 9, -7, -4, null, 6, null, -6, -6, null, null, 0, 6, 5, null, 9, null, null, -1, -4, null, null, null, -2};
    TreeNode treeNode = tt.makeLevelOrderNodeTree(null, inputArr, 0);
    int expectd = 8;

    assertEquals(expectd, diameterOfBinaryTree(treeNode));
  }
}