package programmers.dartgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DartgameTest {
    Solution sol;
    String dartResult;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void solution() {
        dartResult = "1S2D*3T";
        expected = 37;

        assertEquals(expected, sol.solution(dartResult));
    }

    @Test
    void solution2() {
        dartResult = "1D2S#10S";
        expected = 9;

        assertEquals(expected, sol.solution(dartResult));
    }

    @Test
    void solution3() {
        dartResult = "1D2S0T";
        expected = 3;

        assertEquals(expected, sol.solution(dartResult));
    }

    @Test
    void solution4() {
        dartResult = "1S*2T*3S";
        expected = 23;

        assertEquals(expected, sol.solution(dartResult));
    }

    @Test
    void solution5() {
        dartResult = "1D#2S*3S";
        expected = 5;

        assertEquals(expected, sol.solution(dartResult));
    }

    @Test
    void solution6() {
        dartResult = "1T2D3D#";
        expected = -4;

        assertEquals(expected, sol.solution(dartResult));
    }

    @Test
    void solution7() {
        dartResult = "1D2S3T*";
        expected = 59;

        assertEquals(expected, sol.solution(dartResult));
    }
}