package leetcode.symmetrictree;

import java.util.*;

public class Solution {
    Queue<Integer> inorderQueue = new LinkedList<>();
    Queue<Integer> rightorderQueue = new LinkedList<>();

    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            inorderQueue.add(node.val);
            inorder(node.right);
        }
    }

    public void rightorder(TreeNode node) {
        if (node != null) {
            rightorder(node.right);
            rightorderQueue.add(node.val);
            rightorder(node.left);
        }
    }

    public boolean isSymmetric(TreeNode root) {
        rightorder(root.right);
        inorder(root.left);

        try {
            while (!inorderQueue.isEmpty()) {
                if (inorderQueue.poll() != rightorderQueue.poll()) return false;
            }
        } catch (Exception e) {
            return false;
        }


        return true;
    }
}
