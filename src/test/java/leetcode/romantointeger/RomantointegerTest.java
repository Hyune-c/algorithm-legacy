package leetcode.romantointeger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomantointegerTest {
    Solution sol;
    String input;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void romanToInt3() {
        input = "III ";
        expected = 3;

        assertEquals(expected, sol.romanToInt(input));
    }

    @Test
    void romanToInt4() {
        input = "IV";
        expected = 4;

        assertEquals(expected, sol.romanToInt(input));
    }

    @Test
    void romanToInt5() {
        input = "V";
        expected = 5;

        assertEquals(expected, sol.romanToInt(input));
    }

    @Test
    void romanToInt9() {
        input = "IX";
        expected = 9;

        assertEquals(expected, sol.romanToInt(input));
    }

    @Test
    void romanToInt58() {
        input = "LVIII";
        expected = 58;

        assertEquals(expected, sol.romanToInt(input));
    }

    @Test
    void romanToInt1994() {
        input = "MCMXCIV";
        expected = 1994;

        assertEquals(expected, sol.romanToInt(input));
    }
}