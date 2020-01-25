package leetcode.intersectionoftwolinkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionoftwolinkedlistsTest {
    Solution sol;
    int[] input;
    int[] input2;
    int intersectVal;
    ListNode expected;

    ListNode[] initListNodes(int[] input, int[] input2, int intersectVal) {
        ListNode head = null, cur = null;
        ListNode head2 = null, cur2 = null;
        ListNode intersectNode = null;

        for (int i : input) {
            if (head == null) {
                head = new ListNode(i);
                cur = head;
            } else {
                cur.next = new ListNode(i);
                cur = cur.next;
                if (i == intersectVal) intersectNode = cur;
            }
        }

        for (int i : input2) {
            if (i == intersectVal) {
                cur2.next = intersectNode;
                break;
            }

            if (head2 == null) {
                head2 = new ListNode(i);
                cur2 = head2;
            } else {
                cur2.next = new ListNode(i);
                cur2 = cur2.next;
            }
        }

        return new ListNode[]{head, head2};
    }

    @BeforeEach
    void beforEach() {
        sol = new Solution();
    }

    @Test
    void getIntersectionNode() {
        input = new int[]{4, 1, 8, 4, 5};
        input2 = new int[]{5, 0, 1, 8, 4, 5};
        intersectVal = 8;

        ListNode[] head = initListNodes(input, input2, intersectVal);

        assertEquals(intersectVal, sol.getIntersectionNode(head[0], head[1]).val);
    }

    @Test
    void getIntersectionNode2() {
        input = new int[]{0, 9, 1, 2, 4};
        input2 = new int[]{3, 2, 4};
        intersectVal = 2;

        ListNode[] head = initListNodes(input, input2, intersectVal);

        assertEquals(intersectVal, sol.getIntersectionNode(head[0], head[1]).val);
    }

    @Test
    void getIntersectionNode3() {
        input = new int[]{2, 6, 4};
        input2 = new int[]{1, 5};
        intersectVal = 0;

        ListNode[] head = initListNodes(input, input2, intersectVal);

        assertEquals(null, sol.getIntersectionNode(head[0], head[1]));
    }
}