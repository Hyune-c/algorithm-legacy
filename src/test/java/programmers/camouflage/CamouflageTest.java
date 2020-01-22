package programmers.camouflage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamouflageTest {
    Solution sol;
    String[][] input;
    int expected;

    @BeforeEach
    void beforeEach() {
        sol = new Solution();
    }

    @Test
    void solution_1() {
        input = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        expected = 5;

        assertEquals(expected, sol.solution(input));
    }

    @Test
    void solution_2() {
        input = new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        expected = 3;

        assertEquals(expected, sol.solution(input));
    }
}