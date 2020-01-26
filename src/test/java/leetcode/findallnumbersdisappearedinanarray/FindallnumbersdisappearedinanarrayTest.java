package leetcode.findallnumbersdisappearedinanarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FindallnumbersdisappearedinanarrayTest {
    Solution sol;
    int[] input;
    int[] expected;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void findDisappearedNumbers() {
        input = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        expected = new int[]{5, 6};

        assertEquals(Arrays.stream(expected).boxed().collect(Collectors.toList()), sol.findDisappearedNumbers(input));
    }

    @Test
    void findDisappearedNumbers2() {
        input = new int[]{};
        expected = new int[]{};

        assertEquals(Arrays.stream(expected).boxed().collect(Collectors.toList()), sol.findDisappearedNumbers(input));
    }

    @Test
    void findDisappearedNumbers3() {
        input = new int[]{1, 1};
        expected = new int[]{2};

        assertEquals(Arrays.stream(expected).boxed().collect(Collectors.toList()), sol.findDisappearedNumbers(input));
    }
}