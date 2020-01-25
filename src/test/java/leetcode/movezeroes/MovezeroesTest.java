package leetcode.movezeroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.transform.SourceLocator;

import static org.junit.jupiter.api.Assertions.*;

class MovezeroesTest {
    Solution sol;
    int[] input;
    int[] expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void moveZeroes() {
        input = new int[]{0, 1, 0, 3, 12};
        expected = new int[]{1, 3, 12, 0, 0};

        sol.moveZeroes(input);

        assertArrayEquals(expected, input);
    }
}