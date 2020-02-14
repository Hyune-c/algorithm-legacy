package leetcode.pathsumIII;

import leetcode.template.binarytree.TemplateTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import leetcode.template.binarytree.*;

import static org.junit.jupiter.api.Assertions.*;

class PathsumIIITest {

  Solution sol;
  TemplateTree tt;

  @BeforeEach
  void setUp() {
    sol = new Solution();
    tt = new TemplateTree();
  }

  public void preorder() {

  }

  public int preorderSum(TreeNode root, int sum) {
    if (root == null) return 0;

//    int subSum = 0;
//
//    subSum += root.val;
//    if (subSum == sum) result++;
//    subSum += preorderSum(root.left, sum);
//    if (subSum == sum) result++;
//    subSum += preorderSum(root.left, sum);
//    if (subSum == sum) result++;
//
//    return subSum;
    sum -= root.val;
    if (sum == 0) result++;
    preorderSum(root.left, sum);
    if (sum == 0) result++;
    preorderSum(root.left, sum);
    if (sum == 0) result++;

    return sum;
  }

  static int result;

  public int pathSum(TreeNode root, int sum) {
    preorderSum(root.left, sum);

    return result;
  }

  @Test
  void pathSum() {
    Integer[] inputArr = new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
    TreeNode treeNode = tt.makeLevelOrderNodeTree(null, inputArr, 0);
    int sum = 8;
    int expected = 3;
    result = 0;

    assertEquals(expected, pathSum(treeNode, sum));
  }
}