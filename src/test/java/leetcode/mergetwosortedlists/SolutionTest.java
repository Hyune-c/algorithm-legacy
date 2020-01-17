package leetcode.mergetwosortedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    ListNode l1;
    ListNode l2;
    ListNode returnHeadNode;
    Solution sol;

    @BeforeEach
    void beforeEach(){
        sol = new Solution();
    }

    @Test
    void mergeTwoLists() {
        int[] input = new int[]{1, 2, 4};
        int[] input2 = new int[]{1, 3, 4};
        l1 = sol.initListNode(input);
        l2 = sol.initListNode(input2);

        returnHeadNode = sol.mergeSort(l1, l2);
    }
}