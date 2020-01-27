package programmers.caesarcipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarcipherTest {
    Solution sol;
    String s;
    int n;
    String expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void solution() {
        s = "AB";
        n = 1;
        expected = "BC";

        assertEquals(expected, sol.solution(s, n));
    }

    @Test
    void solution2() {
        s = "z";
        n = 1;
        expected = "a";

        assertEquals(expected, sol.solution(s, n));
    }

    @Test
    void solution3() {
        s = "a B z";
        n = 4;
        expected = "e F d";

        assertEquals(expected, sol.solution(s, n));
    }
}