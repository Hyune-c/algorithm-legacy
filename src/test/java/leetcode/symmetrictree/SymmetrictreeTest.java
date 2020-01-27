package leetcode.symmetrictree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetrictreeTest {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    Solution sol;
    Integer[] input;
    boolean expected;

    Node makeNodeTree(Node root, Integer[] arr, int i) {
        if (i < arr.length && arr[i] != null) {
            root = new Node(arr[i]);
            root.left = makeNodeTree(root.left, arr, 2 * i + 1);
            root.right = makeNodeTree(root.right, arr, 2 * i + 2);
        }

        return root;
    }

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void isSymmetric() {
        input = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        expected = true;

        Node root = null;
        root = makeNodeTree(root, input, 0);

    }
}