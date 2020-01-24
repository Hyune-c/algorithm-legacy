package leetcode.linkedlistcycle;


public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode walker = head;
        ListNode runner = head.next;

        while (runner != null && runner.next != null) {
            if (walker == runner) {
                return true;
            }
            walker = walker.next;
            runner = runner.next.next;
        }
        
        return false;
    }
}



