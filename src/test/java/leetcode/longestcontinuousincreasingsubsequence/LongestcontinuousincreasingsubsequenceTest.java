package leetcode.longestcontinuousincreasingsubsequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestcontinuousincreasingsubsequenceTest {

  Solution sol;
  int[] input;
  int expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void findLengthOfLCIS() {
    input = new int[]{1, 3, 5, 4, 7};
    expected = 3;

    assertEquals(expected, sol.findLengthOfLCIS(input));
  }

  @Test
  void findLengthOfLCIS2() {
    input = new int[]{2, 2, 2, 2, 2};
    expected = 1;

    assertEquals(expected, sol.findLengthOfLCIS(input));
  }

  @Test
  void findLengthOfLCIS3() {
    input = new int[]{2, 2, 3, 4, 5};
    expected = 4;

    assertEquals(expected, sol.findLengthOfLCIS(input));
  }

  @Test
  void findLengthOfLCIS4() {
    input = new int[]{1};
    expected = 1;

    assertEquals(expected, sol.findLengthOfLCIS(input));
  }
}

