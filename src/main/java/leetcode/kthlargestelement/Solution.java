package leetcode.kthlargestelement;

import java.util.PriorityQueue;

class KthLargest {

  private int k;
  private PriorityQueue<Integer> numsQueue;

  public KthLargest(int k, int[] nums) {
    this.k = k;
    this.numsQueue = new PriorityQueue<Integer>();

    for (int num : nums) {
      this.add(num);
    }
  }

  public int add(int val) {
    numsQueue.add(val);

    while (this.numsQueue.size() > k) {
      this.numsQueue.poll();
    }

    return numsQueue.peek();
  }
}