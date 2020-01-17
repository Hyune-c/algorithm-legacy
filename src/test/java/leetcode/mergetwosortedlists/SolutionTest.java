package leetcode.mergetwosortedlists;

import org.junit.jupiter.api.Test;

class SolutionTest {
    ListNode _l1;
    ListNode _l2;
    ListNode _returnHeadNode;

    void insertNode(ListNode node, int input) {
        if (node.next == null) {
            node.next = new ListNode(input);
            return;
        } else {
            insertNode(node.next, input);
        }
    }

    ListNode initListNode(int[] input) {
        ListNode headNode = new ListNode(input[0]);

        for (int i = 1; i < input.length; i++) insertNode(headNode, input[i]);

        return headNode;
    }

    ListNode mergeSort(ListNode l1, ListNode l2) {
        ListNode l1HeadNode = l1;
        ListNode l2HeadNode = l2;
        ListNode returnNNodeNow = null;
        ListNode returnHeadNode = null;

        if (l1HeadNode != null && l2HeadNode == null) {
            returnHeadNode = new ListNode(l1HeadNode.val);
            returnNNodeNow = returnHeadNode;
            l1HeadNode = l1HeadNode.next;
        } else if (l1HeadNode != null && l2HeadNode == null) {
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

    @Test
    void mergeTwoLists() {
//[1,2,4]
//[1,3,4]
        int[] input = new int[]{1, 2, 4};
        int[] input2 = new int[]{1, 3, 4};
        _l1 = initListNode(input);
        _l2 = initListNode(input2);

        _returnHeadNode = mergeSort(_l1, _l2);
        System.out.println();
    }
}