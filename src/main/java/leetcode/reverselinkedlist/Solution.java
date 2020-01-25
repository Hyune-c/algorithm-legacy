package leetcode.reverselinkedlist;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head.next == null || head == null) return head;
        else if(head.next.next == null){
            head.next.next = head.next;
            head.next = null;
        }

        ListNode cur = head;
        ListNode curNext = head.next;
        ListNode curNextNext = head.next.next;

        return null;
    }
}