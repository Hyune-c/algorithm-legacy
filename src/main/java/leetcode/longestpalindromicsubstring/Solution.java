package leetcode.longestpalindromicsubstring;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

  public boolean isPalindrome(String subString) {
    if (subString.length() < 3) return true;

    Deque<Character> deque = new ArrayDeque<>();
    for (char c : subString.toCharArray()) {
      deque.addLast(c);
    }

    while (deque.size() > 1) {
      if (deque.pollFirst() != deque.pollLast())
        return false;
    }

    return true;
  }

  public String longestPalindrome(String s) {
    String result = "";

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)
            && j - i + 1 > result.length()
            && isPalindrome(s.substring(i, j + 1))) {
          result = s.substring(i, j + 1);
        }
      }
    }

    return (result == "" && s.length() > 0) ? s.charAt(0) + "" : result;
  }
}