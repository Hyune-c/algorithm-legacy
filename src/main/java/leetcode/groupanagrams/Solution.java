package leetcode.groupanagrams;

import java.util.*;

class Solution {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String sortedStr = String.valueOf(chars);

      List<String> findList = map.get(sortedStr);

      if (findList == null) {
        List<String> newList = new LinkedList<>();
        newList.add(str);
        map.put(sortedStr , newList);
      } else {
        findList.add(str);
      }
    }

    return new LinkedList<>(map.values());
  }
}

