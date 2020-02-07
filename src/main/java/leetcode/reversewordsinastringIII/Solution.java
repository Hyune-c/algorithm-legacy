package leetcode.reversewordsinastringIII;

class Solution {
  public String reverseWords(String s) {
    String[] sArr = s.split(" ");
    StringBuilder result = new StringBuilder("");

    for (String sub : sArr) {
      result.append(new StringBuilder(sub).reverse());
      result.append(" ");
    }

    return result.toString().trim();
  }
}