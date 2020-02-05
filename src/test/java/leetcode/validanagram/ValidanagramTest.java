package leetcode.validanagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidanagramTest {
    Solution sol;
    String input, input2;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void isAnagram() {
        input = "anagram";
        input2 = "nagaram";

        assertEquals(true, sol.isAnagram(input, input2));
    }

    @Test
    void isAnagram2() {
        input = "rat";
        input2 = "car";

        assertEquals(false, sol.isAnagram(input, input2));
    }
}