package leetcode.symmetrictree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetrictreeTest {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }

    Solution sol;
    Integer[] input;
    boolean expected;

    TreeNode makeNodeTree(TreeNode root, Integer[] arr, int i) {
        if (i < arr.length && arr[i] != null) {
            root = new TreeNode(arr[i]);
            root.left = makeNodeTree(root.left, arr, 2 * i + 1);
            root.right = makeNodeTree(root.right, arr, 2 * i + 2);
        }

        return root;
    }

    public boolean isSameTree(TreeNode nodeA, TreeNode nodeB) {
        if (nodeA == null && nodeB == null) return true;
        if (nodeA == null || nodeB == null) return false;
        if (nodeA.val != nodeB.val) return false;

        return isSameTree(nodeA.left, nodeB.left) && isSameTree(nodeA.right, nodeB.right);

    }

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void isSymmetric() {
        input = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        Integer[] input2 = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        expected = true;

        TreeNode root = null;
        root = makeNodeTree(root, input, 0);

        TreeNode root2 = null;
        root2 = makeNodeTree(root2, input2, 0);

        assertTrue(isSameTree(root, root2));
    }
}