package leetcode.linkedlistcycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<ListNode> seen = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        if (seen.contains(head)) return true;
        else if (head == null) return false;
        else {
            seen.add(head);
            return hasCycle(head.next);
        }
    }
}



