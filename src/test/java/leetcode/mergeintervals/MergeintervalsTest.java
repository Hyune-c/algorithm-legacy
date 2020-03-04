package leetcode.mergeintervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.*;

class MergeintervalsTest {

  Solution sol;
  int[][] intervals;
  int[][] expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void merge() {
    intervals = new int[][]{{1 , 3} , {2 , 6} , {8 , 10} , {15 , 18}};

    sol.merge(intervals);
  }

  @Test
  void merge2() {
    intervals = new int[][]{{1 , 4} , {0, 1}};

    sol.merge(intervals);
  }

  @Test
  void merge3() {
    intervals = new int[][]{{1 , 4} , {0 , 0}};

    sol.merge(intervals);
  }

  @Test
  void merge4() {
    intervals = new int[][]{{2 , 3} , {2 , 2} , {3 , 3} , {1 , 3} , {5 , 7} , {2 , 2} , {4 , 6}};

    sol.merge(intervals);
  }
}
