package leetcode.template.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {

  TreeTemplate treeTemplate;

  @BeforeEach
  void setUp() {
    treeTemplate = new TreeTemplate();
  }

  @Test
  void makeNodeTree() {
    int[] input = new int[]{1, 2, 2, 3, 4, 4, 3};

    TreeNode root = null;
    root = treeTemplate.makeNodeTree(root, input, 0);

    System.out.println(root);
  }

  @Test
  void isSameTree() {
  }
}