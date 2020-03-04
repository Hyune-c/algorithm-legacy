package leetcode.groupanagrams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

  public List<List<String>> groupAnagrams(String[] strs) {
    char[][] sortedChars = new char[strs.length][];
    String[] sortedStrs = new String[strs.length];
    for (int i = 0; i < strs.length; i++) {
      sortedChars[i] = strs[i].toCharArray();
      Arrays.sort(sortedChars[i]);
      sortedStrs[i] = String.valueOf(sortedChars[i]);
    }

    List<List<String>> answer = new LinkedList<>();
    List<String> key = new LinkedList<>() {
    };

    for (int i = 0; i < sortedStrs.length; i++) {
      int answerIndex = key.indexOf(sortedStrs[i]);
//      int answerIndex = -1;
//      key.indexOf(sortedChars[i]);

      if (answerIndex == -1) {
        key.add(sortedStrs[i]);
        List<String> newList = new LinkedList<>();
        newList.add(strs[i]);
        answer.add(newList);
      } else {
        answer.get(answerIndex).add(strs[i]);
      }
    }

    return answer;
  }
}

