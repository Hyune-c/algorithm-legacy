package leetcode.swapnodesinpairs;

class Solution {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode nodeB = head.next;
    head.next = swapPairs(head.next.next);
    nodeB.next = head;

    return nodeB;
  }
}
