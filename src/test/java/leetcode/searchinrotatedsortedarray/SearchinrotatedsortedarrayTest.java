package leetcode.searchinrotatedsortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchinrotatedsortedarrayTest {

  Solution sol;
  int[] nums;
  int target;
  int expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void search() {
    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    target = 0;
    expected = 4;

    assertEquals(expected, sol.search(nums, target));
  }

  @Test
  void search2() {
    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    target = 3;
    expected = -1;

    assertEquals(expected, sol.search(nums, target));
  }
}
