package sumoftwointegers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumoftwointegersTest {
    Solution sol;
    int a, b;
    int expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void getSum() {
        a = 1;
        b = 2;
        expected = 3;

        assertEquals(expected, sol.getSum(a, b));
    }

    @Test
    void getSum2() {
        a = -2;
        b = 3;
        expected = 1;

        assertEquals(expected, sol.getSum(a, b));
    }
}