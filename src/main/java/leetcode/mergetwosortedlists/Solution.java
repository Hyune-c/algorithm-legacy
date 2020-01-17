package leetcode.mergetwosortedlists;

public class Solution {
    static ListNode mergeSort(ListNode l1, ListNode l2) {
        ListNode l1HeadNode = l1;
        ListNode l2HeadNode = l2;
        ListNode returnNNodeNow = null;
        ListNode returnHeadNode = null;

        if (l1HeadNode == null && l2HeadNode == null) return null;

        if (l1HeadNode != null && l2HeadNode == null) {
            returnHeadNode = new ListNode(l1HeadNode.val);
            returnNNodeNow = returnHeadNode;
            l1HeadNode = l1HeadNode.next;
        } else if (l1HeadNode == null && l2HeadNode != null) {
            returnHeadNode = new ListNode(l2HeadNode.val);
            returnNNodeNow = returnHeadNode;
            l2HeadNode = l2HeadNode.next;
        } else if (l1HeadNode.val <= l2HeadNode.val) {
            returnHeadNode = new ListNode(l1HeadNode.val);
            returnNNodeNow = returnHeadNode;
            l1HeadNode = l1HeadNode.next;
        } else if (l1HeadNode.val > l2HeadNode.val) {
            returnHeadNode = new ListNode(l2HeadNode.val);
            returnNNodeNow = returnHeadNode;
            l2HeadNode = l2HeadNode.next;
        } else {
            System.out.println("*** Wrong");
        }

        while (!(l1HeadNode == null && l2HeadNode == null)) {
            if (l1HeadNode != null && l2HeadNode == null) {
                ListNode tmpNode = new ListNode(l1HeadNode.val);
                returnNNodeNow.next = tmpNode;
                returnNNodeNow = tmpNode;
                l1HeadNode = l1HeadNode.next;
            } else if (l1HeadNode == null && l2HeadNode != null) {
                ListNode tmpNode = new ListNode(l2HeadNode.val);
                returnNNodeNow.next = tmpNode;
                returnNNodeNow = tmpNode;
                l2HeadNode = l2HeadNode.next;
            } else if (l1HeadNode != null && l2HeadNode != null && l1HeadNode.val <= l2HeadNode.val) {
                ListNode tmpNode = new ListNode(l1HeadNode.val);
                returnNNodeNow.next = tmpNode;
                returnNNodeNow = tmpNode;
                l1HeadNode = l1HeadNode.next;
            } else if (l1HeadNode != null && l2HeadNode != null && l1HeadNode.val > l2HeadNode.val) {
                ListNode tmpNode = new ListNode(l2HeadNode.val);
                returnNNodeNow.next = tmpNode;
                returnNNodeNow = tmpNode;
                l2HeadNode = l2HeadNode.next;
            }
        }

        return returnHeadNode;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return mergeSort(l1, l2);
    }
}
