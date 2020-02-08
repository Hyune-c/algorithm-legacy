package leetcode.nondecreasingarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NondecreasingarrayTest {

  Solution sol;
  int[] input;
  boolean expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void checkPossibility() {
    input = new int[]{4, 2, 3};
    expected = true;

    assertEquals(expected, sol.checkPossibility(input));
  }

  @Test
  void checkPossibility2() {
    input = new int[]{4, 2, 1};
    expected = false;

    assertEquals(expected, sol.checkPossibility(input));
  }

  @Test
  void checkPossibility3() {
    input = new int[]{3, 4, 2, 3};
    expected = false;

    assertEquals(expected, sol.checkPossibility(input));
  }

  @Test
  void checkPossibility4() {
    input = new int[]{2, 3, 3, 2, 4};
    expected = true;

    assertEquals(expected, sol.checkPossibility(input));
  }

  @Test
  void checkPossibility5() {
    input = new int[]{-1, 4, 2, 3};
    expected = true;

    assertEquals(expected, sol.checkPossibility(input));
  }
}

