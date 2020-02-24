package leetcode.lettercombinationsofaphonenumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class lettercombinationsofaphonenumberTest {

  Solution sol;
  String input;
  List<String> expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void letterCombinations() {
    input = "23";
    expected = new ArrayList<>(
        Arrays.asList(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}));
    assertLinesMatch(expected, sol.letterCombinations(input));
  }
}
