package leetcode.reversewordsinastringIII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversewordsinastringIIITest {

  Solution sol;
  String s;
  String expect;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void reverseWords() {
    s = "Let's take LeetCode contest";
    expect = "s'teL ekat edoCteeL tsetnoc";

    assertEquals(expect, sol.reverseWords(s));
  }
}