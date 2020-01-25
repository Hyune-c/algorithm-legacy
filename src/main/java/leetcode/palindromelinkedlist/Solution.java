package leetcode.palindromelinkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Deque<Integer> deque = new ArrayDeque<>();

        while (head != null) {
            deque.push(head.val);
            head = head.next;
        }

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        }

        return true;
    }
}