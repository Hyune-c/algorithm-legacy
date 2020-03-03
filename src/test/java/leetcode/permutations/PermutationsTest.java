package leetcode.permutations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermutationsTest {

  Solution sol;
  int[] nums;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void permute() {
    nums = new int[]{1, 2, 3};

    System.out.println(sol.permute(nums).toString());
  }
}
