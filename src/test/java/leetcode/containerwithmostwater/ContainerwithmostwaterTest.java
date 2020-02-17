package leetcode.containerwithmostwater;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerwithmostwaterTest {

  Solution sol;
  int[] input;
  int expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void maxArea() {
    input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    expected = 49;

    assertEquals(expected, sol.maxArea(input));
  }
}