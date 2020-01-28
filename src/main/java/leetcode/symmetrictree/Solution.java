package leetcode.symmetrictree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
//    public void inorder(TreeNode node) {
//        if (node != null) {
//            inorder(node.left);
//            inorderQueue.add(node.val);
//            inorder(node.right);
//        }else{
//            inorderQueue.add(0);
//        }
//    }
//
//    public void rightorder(TreeNode node) {
//        if (node != null) {
//            rightorder(node.right);
//            rightorderQueue.add(node.val);
//            rightorder(node.left);
//        }else{
//            rightorderQueue.add(0);
//        }
//    }

    public boolean compareTree(TreeNode nodeA, TreeNode nodeB) {
        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();

        leftQueue.add(nodeA);
        rightQueue.add(nodeB);

        while (!(leftQueue.isEmpty() && rightQueue.isEmpty())) {
            TreeNode leftNode = leftQueue.poll();
            TreeNode rightNode = rightQueue.poll();

            if ((leftNode == null && rightNode != null)
                    || (leftNode != null && rightNode == null)) return false;
            if (leftNode.val != rightNode.val) return false;

            if (leftNode.left != null && leftNode.right != null) {
                leftQueue.add(leftNode.left);
                leftQueue.add(leftNode.right);
            }

            if (rightNode.left != null && rightNode.right != null) {
                rightQueue.add(rightNode.right);
                rightQueue.add(rightNode.left);
            }
        }

        return true;
    }

    public boolean isSymmetric(TreeNode root) {
//        rightorder(root.right);
//        inorder(root.left);
//
//        try {
//            while (!inorderQueue.isEmpty()) {
//                if (inorderQueue.poll() != rightorderQueue.poll()) return false;
//            }
//        } catch (Exception e) {
//            return false;
//        }

        return compareTree(root.left, root.right);
    }
}
