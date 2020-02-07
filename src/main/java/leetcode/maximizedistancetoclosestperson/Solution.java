package leetcode.maximizedistancetoclosestperson;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

  public int maxDistToClosest(int[] seats) {
    Deque<Integer> seatDeque = new ArrayDeque<>();
    double maxDistance = 0;
    double curDistance = 0;

    for (int seat : seats) seatDeque.add(seat);

    while (seatDeque.size() > 0 && seatDeque.pollFirst() == 0) maxDistance++;
    while (seatDeque.size() > 0 && seatDeque.pollLast() == 0) curDistance++;
    maxDistance = Math.max(curDistance, maxDistance);
    curDistance = 0;

    while (seatDeque.size() > 0) {
      if (seatDeque.poll() == 0) curDistance++;
      else {
        maxDistance = Math.max(Math.ceil(curDistance / 2), maxDistance);
        curDistance = 0;
      }
    }

    maxDistance = Math.max(Math.ceil(curDistance / 2), maxDistance);

    return (int) maxDistance;
  }
}