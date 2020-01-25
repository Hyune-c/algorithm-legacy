package leetcode.intersectionoftwolinkedlists;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> setA = new HashSet<>();
        ListNode cur = headA;

        while (cur != null) {
            setA.add(cur);
            cur = cur.next;
        }

        cur = headB;

        while (cur != null) {
            if (setA.contains(cur)) return cur;
            cur = cur.next;
        }

        return null;
    }
}