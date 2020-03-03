package leetcode.rotateimage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateimageTest {

  Solution sol;
  int[][] matrix;
  int[][] expected;

  @BeforeEach
  void setUp() {
    sol = new Solution();
  }

  @Test
  void rotate() {
    matrix = new int[][]{
        {1 , 2 , 3} ,
        {4 , 5 , 6} ,
        {7 , 8 , 9}};
    expected = new int[][]{
        {7 , 4 , 1} ,
        {8 , 5 , 2} ,
        {9 , 6 , 3}};

    sol.rotate(matrix);

    assertArrayEquals(expected , matrix);
  }

  @Test
  void rotate2() {
    matrix = new int[][]{
        {5 , 1 , 9 , 11} ,
        {2 , 4 , 8 , 10} ,
        {13 , 3 , 6 , 7} ,
        {15 , 14 , 12 , 16}
    };
    expected = new int[][]{
        {15 , 13 , 2 , 5} ,
        {14 , 3 , 4 , 1} ,
        {12 , 6 , 8 , 9} ,
        {16 , 7 , 10 , 11}};

    sol.rotate(matrix);

    assertArrayEquals(expected , matrix);
  }
}
