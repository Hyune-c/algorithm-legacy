package leetcode.groupanagrams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupanagramsTest {

  Solution sol;
  String[] strs;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void groupAnagrams() {
    strs = new String[]{"eat" , "tea" , "tan" , "ate" , "nat" , "bat"};

    sol.groupAnagrams(strs);
  }
}
