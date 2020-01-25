package leetcode.palindromelinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromelinkedlistTest {
    Solution sol;
    int[] input;
    boolean expected;

    ListNode initLinkedList(int[] input) {
        ListNode head = null;
        ListNode cur = null;

        for (int i : input) {
            if (head == null) {
                head = new ListNode(i);
                cur = head;
            } else {
                cur.next = new ListNode(i);
                cur = cur.next;
            }
        }

        return head;
    }

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void isPalindrome() {
        input = new int[]{1, 2};
        expected = false;

        assertEquals(expected, sol.isPalindrome(initLinkedList(input)));
    }

    @Test
    void isPalindrome2() {
        input = new int[]{1, 2, 2, 1};
        expected = true;

        assertEquals(expected, sol.isPalindrome(initLinkedList(input)));
    }

    @Test
    void isPalindrome3() {
        input = new int[]{1, 2, 3, 3, 2, 1};
        expected = true;

        assertEquals(expected, sol.isPalindrome(initLinkedList(input)));
    }

    @Test
    void isPalindrome4() {
        input = new int[]{};
        expected = true;

        assertEquals(expected, sol.isPalindrome(initLinkedList(input)));
    }

    @Test
    void isPalindrome5() {
        input = new int[]{1, 0, 0};
        expected = false;

        assertEquals(expected, sol.isPalindrome(initLinkedList(input)));
    }

    @Test
    void isPalindrome6() {
        input = new int[]{-129, -129};
        expected = true;

        assertEquals(expected, sol.isPalindrome(initLinkedList(input)));
    }

    @Test
    void isPalindrome7() {
        input = new int[]{1, 0, 1};
        expected = true;

        assertEquals(expected, sol.isPalindrome(initLinkedList(input)));
    }
}