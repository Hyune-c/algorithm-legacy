package leetcode.generateparentheses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateparenthesesTest {

  Solution sol;
  int input;
  String expected;
  String actual;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void generateParenthesis() {
    input = 3;
    expected = Arrays.stream(
        new String[]{"((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"}).sorted().collect(Collectors.joining(" "));
    actual = sol.generateParenthesis(3).stream()
        .sorted().collect(Collectors.joining(" "));

    assertEquals(expected, actual);
  }
}
