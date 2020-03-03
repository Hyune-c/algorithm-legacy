package leetcode.rotateimage;

class Solution {

  public void rotate(int[][] matrix) {
    int[][] matrix2 = new int[matrix.length][];
    for (int i = 0; i < matrix.length; i++) {
      matrix2[i] = matrix[i].clone();
    }

    for (int i = 0; i < matrix2.length; i++) {
      for (int j = 0, k = matrix2[0].length - 1
           ; j < matrix2[0].length
          ; j++ , k--) {
        matrix[i][j] = matrix2[k][i];
      }
    }
    System.out.println();
  }
}
