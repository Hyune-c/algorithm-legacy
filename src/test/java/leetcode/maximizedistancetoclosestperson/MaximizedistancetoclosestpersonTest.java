package leetcode.maximizedistancetoclosestperson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizedistancetoclosestpersonTest {

  Solution sol;
  int[] input;
  int expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void maxDistToClosest() {
    input = new int[]{1, 0, 0, 0, 1, 0, 1};
    expected = 2;

    assertEquals(expected, sol.maxDistToClosest(input));
  }

  @Test
  void maxDistToClosest2() {
    input = new int[]{1, 0, 0, 0};
    expected = 3;

    assertEquals(expected, sol.maxDistToClosest(input));
  }

  @Test
  void maxDistToClosest3() {
    input = new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0};
    expected = 3;

    assertEquals(expected, sol.maxDistToClosest(input));
  }

  @Test
  void maxDistToClosest4() {
    input = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1};
    expected = 1;

    assertEquals(expected, sol.maxDistToClosest(input));
  }
}
