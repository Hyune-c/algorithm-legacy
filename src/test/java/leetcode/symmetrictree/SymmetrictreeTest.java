package leetcode.symmetrictree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SymmetrictreeTest {
    Solution sol;
    Integer[] input;
    boolean expected;

    TreeNode makeNodeTree(TreeNode root, Integer[] arr, int i) {
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

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void isSymmetric() {
        input = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        expected = true;

        TreeNode root = null;
        root = makeNodeTree(root, input, 0);

        assertEquals(expected, sol.isSymmetric(root));
    }

    @Test
    void isSymmetric2() {
        input = new Integer[]{1, 2, 2, 2, null, 2};
        expected = false;

        TreeNode root = null;
        root = makeNodeTree(root, input, 0);

        assertEquals(expected, sol.isSymmetric(root));
    }

    @Test
    void isSymmetric3() {
        input = new Integer[]{1, 2, 2, null, 3, null, 3};
        expected = false;

        TreeNode root = null;
        root = makeNodeTree(root, input, 0);

        System.out.println(sol.isSymmetric(root));
        assertEquals(expected, sol.isSymmetric(root));
    }
}