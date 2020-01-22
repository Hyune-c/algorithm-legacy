package leetcode.symmetrictree;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public int InorderLeft(TreeNode node) {
        if (node.left != null) {
            return InorderLeft(node.left);
        }
        return node.val;
//        if (node.right != null) {
//            return InorderLeft(node.right);
//        }
    }

    public int InorderRight(TreeNode node) {
        return 0;
    }

    public boolean isSymmetric(TreeNode root) {
        return true;
    }
}
