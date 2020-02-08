package leetcode.isomorphicstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicstringsTest {

  Solution sol;
  String s;
  String t;
  String expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void isIsomorphic() {
    String s = "egg";
    String t = "add";

    assertEquals(true, sol.isIsomorphic(s, t));
  }

  @Test
  void isIsomorphic2() {
    String s = "foo";
    String t = "bar";

    assertEquals(false, sol.isIsomorphic(s, t));
  }

  @Test
  void isIsomorphic3() {
    String s = "paper";
    String t = "title";

    assertEquals(true, sol.isIsomorphic(s, t));
  }

  @Test
  void isIsomorphic4() {
    String s = "ab";
    String t = "aa";

    assertEquals(false, sol.isIsomorphic(s, t));
  }
}