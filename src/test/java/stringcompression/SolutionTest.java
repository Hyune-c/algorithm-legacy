package stringcompression;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    static Solution sol;
    static String input;
    static int result;
    static int expected;

    @Before
    public void before() {
        sol = new Solution();
        input = "";
        result = 0;
        expected = 0;
    }

    @After
    public void after() {
        result = sol.solution(input);
        assertEquals(expected, result);
    }

    @Test
    public void Test1() {
        input = "aabbaccc";
        expected = 7;
    }

    @Test
    public void Test2() {
        input = "ababcdcdababcdcd";
        expected = 9;
    }

    @Test
    public void Test3() {
        input = "abcabcdede";
        expected = 8;
    }

    @Test
    public void Test4() {
        input = "abcabcabcabcdededededede";
        expected = 14;
    }

    @Test
    public void Test5() {
        input = "xababcdcdababcdcd";
        expected = 17;
    }
}