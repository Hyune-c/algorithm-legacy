package programmers.middleletter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleletterTest {
    Solution sol;
    String input;
    String expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void solution() {
        input = "abcde";
        expected = "c";

        assertEquals(expected, sol.solution(input));
    }

    @Test
    void solution2() {
        input = "qwer";
        expected = "we";

        assertEquals(expected, sol.solution(input));
    }
}