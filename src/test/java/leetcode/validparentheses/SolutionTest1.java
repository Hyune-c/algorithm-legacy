package leetcode.validparentheses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class SolutionTest {
    static Solution sol;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
    }

    @Test
    void isValid() {
        assertTrue(sol.isValid("()"));
        assertTrue(sol.isValid("()[]{}"));
        assertFalse(sol.isValid("(]"));
        assertFalse(sol.isValid("([)]"));
        assertTrue(sol.isValid("{[]}"));
        assertFalse(sol.isValid("["));
        assertFalse(sol.isValid("(("));
        assertFalse(sol.isValid("]"));
        assertTrue(sol.isValid(""));
    }
}