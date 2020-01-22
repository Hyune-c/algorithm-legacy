package programmers.phonenumberslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonenumberslistTest {
    Solution sol;
    String[] input;
    boolean expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void solution() {
        input = new String[]{"119", "97674223", "1195524421"};
        expected = false;

        assertEquals(expected, sol.solution(input));
    }

    @Test
    void solution2() {
        input = new String[]{"123", "456", "789"};
        expected = true;

        assertEquals(expected, sol.solution(input));
    }

    @Test
    void solution3() {
        input = new String[]{"12", "123", "1235", "567", "88"};
        expected = false;

        assertEquals(expected, sol.solution(input));
    }
}