package leetcode.generateparentheses;

import java.util.LinkedList;
import java.util.List;

class Solution {

  List<String> parenthes = new LinkedList<>();

  public void helper(int leftOpenCount, int leftCloseCount, String bracket) {
    if (leftCloseCount == 0) {
      parenthes.add(bracket);
      return;
    }

    if (leftOpenCount > 0)
      helper(leftOpenCount - 1, leftCloseCount, bracket + "(");
    if (leftCloseCount > leftOpenCount)
      helper(leftOpenCount, leftCloseCount - 1, bracket + ")");
  }

  public List<String> generateParenthesis(int n) {
    helper(n, n, "");
    return parenthes;
  }
}
