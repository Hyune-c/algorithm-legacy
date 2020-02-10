package leetcode.peakindexinamountainarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakindexinamountainarrayTest {

  Solution sol;
  int[] A;
  int expected;

  @BeforeEach
  void setUp() {
    this.sol = new Solution();
  }

  @Test
  void peakIndexInMountainArray() {
    A = new int[]{0, 1, 0};
    expected = 1;

    assertEquals(expected, sol.peakIndexInMountainArray(A));
  }

  @Test
  void peakIndexInMountainArray2() {
    A = new int[]{0, 2, 1, 0};
    expected = 1;

    assertEquals(expected, sol.peakIndexInMountainArray(A));
  }

  @Test
  void peakIndexInMountainArray3() {
    A = new int[]{0, 10, 5, 2};
    expected = 1;

    assertEquals(expected, sol.peakIndexInMountainArray(A));
  }
}

