package leetcode.kthlargestelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {
  KthLargest kthLargest;
  int[] arr;
  int k;
  int expected;

  @BeforeEach
  void setUp() {

  }

  @Test
  void add() {
    arr = new int[]{4, 5, 8, 2};
    k = 3;

    kthLargest = new KthLargest(k, arr);
    assertEquals(4, kthLargest.add(3));
    assertEquals(5, kthLargest.add(5));
    assertEquals(5, kthLargest.add(10));
    assertEquals(8, kthLargest.add(9));
    assertEquals(8, kthLargest.add(4));
  }

  @Test
  void add2() {
    arr = new int[]{};
    k = 1;

    kthLargest = new KthLargest(k, arr);
    assertEquals(-3, kthLargest.add(-3));
    assertEquals(-2, kthLargest.add(-2));
    assertEquals(-2, kthLargest.add(-4));
    assertEquals(0, kthLargest.add(0));
    assertEquals(4, kthLargest.add(4));
  }
}

