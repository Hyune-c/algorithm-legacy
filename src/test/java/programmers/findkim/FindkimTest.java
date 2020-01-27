package programmers.findkim;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindkimTest {
    Solution sol;
    String[] seoul;
    String expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void solution() {
        seoul = new String[]{"Jane", "Kim"};
        expected = "김서방은 1에 있다";

        assertEquals(expected, sol.solution(seoul));
    }
}