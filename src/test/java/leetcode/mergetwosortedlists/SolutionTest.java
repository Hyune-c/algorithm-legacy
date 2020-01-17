package leetcode.mergetwosortedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    ListNode l1;
    ListNode l2;
    ListNode returnHeadNode;
    Solution sol;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
    }

    static void insertNode(ListNode node, int input) {
        if (node.next == null) {
            node.next = new ListNode(input);
            return;
        } else {
            insertNode(node.next, input);
        }
    }

    static ListNode initListNode(int[] input) {
        ListNode headNode = null;
        try {
            headNode = new ListNode(input[0]);
            for (int i = 1; i < input.length; i++) insertNode(headNode, input[i]);
        } catch (Exception e) {

        } finally {
            return headNode;
        }
    }
    
    @Test
    void mergeTwoLists() {
        int[] input = new int[]{1, 2, 4};
        int[] input2 = new int[]{1, 3, 4};
        l1 = initListNode(input);
        l2 = initListNode(input2);

        returnHeadNode = sol.mergeTwoLists(l1, l2);

        System.out.println();
    }

    @Test
    void mergeTwoLists2() {
        int[] input = new int[]{1, 2, 4};
        int[] input2 = new int[]{};
        l1 = initListNode(input);
        l2 = initListNode(input2);

        returnHeadNode = sol.mergeTwoLists(l1, l2);
        System.out.println();
    }

    @Test
    void mergeTwoLists3() {
        int[] input = new int[]{};
        int[] input2 = new int[]{};
        l1 = initListNode(input);
        l2 = initListNode(input2);

        returnHeadNode = sol.mergeTwoLists(l1, l2);
        System.out.println();
    }

    @Test
    void mergeTwoLists4() {
        int[] input = new int[]{};
        int[] input2 = new int[]{0};
        l1 = initListNode(input);
        l2 = initListNode(input2);

        returnHeadNode = sol.mergeTwoLists(l1, l2);
        System.out.println();
    }
}