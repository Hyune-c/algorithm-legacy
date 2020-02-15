package leetcode.longestpalindromicsubstring;

class Solution {

  public boolean isPalindrome(String subString) {
    if (subString.length() < 3) return true;

    for (int i = 0, j = subString.length() - 1; j - i > 0; i++, j--) {
      if (subString.charAt(i) != subString.charAt(j)) return false;
    }

    return true;
  }

  public String longestPalindrome(String s) {
    if (s.length() < 2) return s;

    String result = "";

    for (int i = 0; result.length() < s.length() - i; i++) {
      for (int j = s.length() - 1; result.length() < j + 1 - i; j--) {
        result = (s.charAt(i) == s.charAt(j)
            && isPalindrome(s.substring(i, j + 1)))
            ? s.substring(i, j + 1) : result;
      }
    }

    return result;
  }
}