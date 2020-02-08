package leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) return false;

    Map<Character, Character> isomorphicMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (isomorphicMap.containsKey(s.charAt(i))) {
        if (isomorphicMap.get(s.charAt(i)) != t.charAt(i)) {
          return false;
        }
      } else if (isomorphicMap.containsValue(t.charAt(i))) {
        return false;
      }

      isomorphicMap.put(s.charAt(i), t.charAt(i));
    }

    return true;
  }
}