package leetcode.symmetrictree;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetrictreeTest {
    Solution sol;
    Integer[] input;
    boolean expected;

    TreeNode makeNodeTree(TreeNode root, Integer[] arr, int i) {
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;
            root.left = (2 * i + 1 < arr.length && arr[2 * i + 1] != null)
                    ? makeNodeTree(root.left, arr, 2 * i + 1) : null;
            root.right = (2 * i + 2 < arr.length && arr[2 * i + 2] != null)
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

        assertTrue(sol.isSymmetric(root));
    }
}