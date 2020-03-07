package leetcode.reversewordsinastring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ReversewordsinastringTest {

  Solution sol;
  String s;
  String expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void reverseWords() {
    s = "the sky is blue";
    expected = "blue is sky the";

    assertEquals(expected, sol.reverseWords(s));
  }

  @Test
  void reverseWords2() {
    s = "  hello world!  ";
    expected = "world! hello";

    assertEquals(expected, sol.reverseWords(s));
  }

  @Test
  void reverseWords3() {
    s = "a good   example";
    expected = "example good a";

    assertEquals(expected, sol.reverseWords(s));
  }

  @Test
  void reverseWords4() {
    s = " ";
    expected = "";

    assertEquals(expected, sol.reverseWords(s));
  }
}
