package leetcode.sortcolors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortcolorsTest {

  Solution sol;
  int[] input;
  int[] expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void sortColors() {
    input = new int[]{2 , 0 , 2 , 1 , 1 , 0};
    expected = new int[]{0 , 0 , 1 , 1 , 2 , 2};

    sol.sortColors(input);
    assertArrayEquals(expected , input);
  }
}
