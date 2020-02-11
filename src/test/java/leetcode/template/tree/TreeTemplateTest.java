package leetcode.template.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTemplateTest {

  TreeTemplate treeTemplate;
  Integer[] input;
  TreeNode inputRoot;

  @BeforeEach
  void setUp() {
    treeTemplate = new TreeTemplate();
  }

  @Test
  void isSameTree() {
  }

  @Test
  void makeNodeTree() {
    input = new Integer[]{1, 2, 2, 3, 4, 4, 3};
    inputRoot = treeTemplate.makeLevelOrderNodeTree(null, input, 0);

    Integer[] expectInput = new Integer[]{1, 2, 2, 3, 4, 4, 3};
    TreeNode expectRoot = treeTemplate.makeLevelOrderNodeTree(null, expectInput, 0);

    assertEquals(true, treeTemplate.isSameTree(inputRoot, expectRoot));
  }

  @Test
  void makeNodeTree_withNull() {
    input = new Integer[]{1, 2, 3, 4, 5, 6};
    inputRoot = treeTemplate.makeLevelOrderNodeTree(null, input, 0);

    Integer[] expectInput = new Integer[]{1, 2, 3, 4, 5, 6, null};
    TreeNode expectRoot = treeTemplate.makeLevelOrderNodeTree(null, expectInput, 0);

    assertEquals(true, treeTemplate.isSameTree(inputRoot, expectRoot));
  }

  @Test
  void getLevelOrderArray_LeftFirst() {
    input = new Integer[]{1, 2, 2, 3, 4, 4, 3};
    inputRoot = treeTemplate.makeLevelOrderNodeTree(null, input, 0);

    Integer[] levelOrderArray = treeTemplate.getLevelOrderArray(inputRoot, true);
    Integer[] expectArray = new Integer[]{1, 2, 2, 3, 4, 4, 3};

    assertArrayEquals(expectArray, levelOrderArray);
  }

  @Test
  void getLevelOrderArray_RightFirst() {
    input = new Integer[]{4, 2, 7, 1, 3, 6, 9};
    inputRoot = treeTemplate.makeLevelOrderNodeTree(null, input, 0);

    Integer[] levelOrderArray = treeTemplate.getLevelOrderArray(inputRoot, false);
    Integer[] expectArray = new Integer[]{4, 7, 2, 9, 6, 3, 1};

    assertArrayEquals(expectArray, levelOrderArray);
  }

//  @Test
//  void getLevelOrderArray_RightFirst_withNull() {
//    input = new Integer[]{4, 2, 7, 1, 3, 5};
//    inputRoot = treeTemplate.makeLevelOrderNodeTree(null, input, 0);
//
//    Integer[] levelOrderArray = treeTemplate.getLevelOrderArray(inputRoot, false);
//    Integer[] expectArray = new Integer[]{4, 7, 2, null, 5, 3, 1};
//
//    assertArrayEquals(expectArray, levelOrderArray);
//  }
}