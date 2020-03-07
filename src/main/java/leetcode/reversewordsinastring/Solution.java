package leetcode.reversewordsinastring;

class Solution {

  public String reverseWords(String s) {
    String[] answerArr = s.trim().split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = answerArr.length - 1; i >= 0; i--) {
      if (answerArr[i].equals("")) continue;
      result.append(answerArr[i] + " ");
    }

    return (result.length() == 0) ? "" : result.substring(0, result.length() - 1);
  }
}


