package leetcode.reverselinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverselinkedlistTest {
    Solution sol;
    int[] input;
    int[] expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    ListNode makeListNode(int[] input) {
        if (input == null) return null;

        ListNode head = new ListNode(input[0]);
        ListNode cur = head;

        for (int i = 1; i < input.length; i++) {
            cur.next = new ListNode(input[i]);
            cur = cur.next;
        }

        return head;
    }

    boolean isSameListNodes(ListNode nodeA, ListNode nodeB) {
        for (; nodeA.next != null; nodeA = nodeA.next, nodeB = nodeB.next) {
            if (nodeA.val != nodeB.val) return false;
        }

        return (nodeB.next == null) ? true : false;
    }

    @Test
    void reverseList() {
        input = new int[]{1, 2, 3, 4, 5};
        expected = new int[]{5, 4, 3, 2, 1};
        ListNode inputHead = makeListNode(input);
        ListNode expectedHead = makeListNode(expected);


        assertTrue(isSameListNodes(sol.reverseList(inputHead), expectedHead));
    }

    @Test
    void reverseList2() {
        input = new int[]{1, 2};
        expected = new int[]{2, 1};
        ListNode inputHead = makeListNode(input);
        ListNode expectedHead = makeListNode(expected);


        assertTrue(isSameListNodes(sol.reverseList(inputHead), expectedHead));
    }
}