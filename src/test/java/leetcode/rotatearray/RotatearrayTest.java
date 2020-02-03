package leetcode.rotatearray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatearrayTest {
    Solution sol;
    int[] inputArr;
    int inputK;
    int[] expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void rotate1() {
        inputArr = new int[]{1, 2, 3, 4, 5, 6, 7};
        inputK = 3;
        expected = new int[]{5, 6, 7, 1, 2, 3, 4};

        sol.rotate(inputArr, inputK);
        assertArrayEquals(expected, inputArr);
    }

    @Test
    void rotate2() {
        inputArr = new int[]{-1, -100, 3, 99};
        inputK = 2;
        expected = new int[]{3, 99, -1, -100};

        sol.rotate(inputArr, inputK);
        assertArrayEquals(expected, inputArr);
    }

    @Test
    void rotate3() {
        inputArr = new int[]{1, 2};
        inputK = 2;
        expected = new int[]{2, 1};

        sol.rotate(inputArr, inputK);
        assertArrayEquals(expected, inputArr);
    }

    @Test
    void rotate4() {
        inputArr = new int[]{1, 2, 3, 4, 5, 6, 7};
        inputK = 7;
        expected = new int[]{7, 6, 5, 4, 3, 2, 1};

        sol.rotate(inputArr, inputK);
        assertArrayEquals(expected, inputArr);
    }
}