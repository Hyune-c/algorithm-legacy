package leetcode.reverseinteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    static Solution sol;
    static int inputX;
    static int result;

    @Before
    public void before() {
        sol = new Solution();
        inputX = 0;
        result = 0;
    }

    @After
    public void after() {
        System.out.println("# inputX : " + inputX);

        long startTime;
        long estimatedTime;

        startTime = System.currentTimeMillis();

        result = sol.reverse(inputX);
        System.out.println("# result : " + result);

        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime + " ms");

        System.out.println("-------------------------");
    }

    @Test
    public void Test1() {
        inputX = 5101;
    }

    @Test
    public void Test2() {
        inputX = -1022;
    }

    @Test
    public void Test3() {
        inputX = 556900900;
    }

    @Test
    public void Test4() {
        inputX = -55690090;
    }

    @Test
    public void Test5() {
        inputX = -2147483648;
    }

    @Test
    public void Test6() {
        inputX = 2147438647;
    }

    @Test
    public void Test7() {
        inputX = 1534236469;
    }
}