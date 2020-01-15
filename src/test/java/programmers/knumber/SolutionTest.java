package programmers.knumber;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    static Solution sol;
    static int[] inputArr;
    static int[][] cmds;
    static int[] resultArr;
    static int[] expected;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
        inputArr = null;
        cmds = null;
        resultArr = null;
        expected = null;
    }

    @Test
    void solution() {
        inputArr = new int[]{1, 5, 2, 6, 3, 7, 4};
        cmds = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        //, {4, 4, 1}, {1, 7, 3}
        //[5, 6, 3]

        resultArr = sol.solution(inputArr, cmds);
        expected = new int[]{5, 6, 3};

        assertArrayEquals(expected, resultArr);
    }
}