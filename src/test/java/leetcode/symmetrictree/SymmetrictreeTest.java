package leetcode.symmetrictree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetrictreeTest {
    Solution sol;
    int[] input;
    boolean expected;

    TreeNode initTreeNode(int[] input) {
        if (input.length == 0) return null;

        TreeNode root = new TreeNode(input[0]);
        int left = 0;
        int right = 0;
        int pow2 = 2;

        for (int i = 1; i < input.length; i++) {
            TreeNode cur = root;

            int index = i;
            while (index - pow2 > 0) {
            }

        }
        return null;
    }

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void isSymmetric() {
        input = new int[]{1, 2, 2, 3, 4, 4, 3};
        expected = true;


    }
}