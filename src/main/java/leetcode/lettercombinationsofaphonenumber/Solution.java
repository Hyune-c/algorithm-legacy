package leetcode.lettercombinationsofaphonenumber;

import java.util.*;

class Solution {
  String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits.length() == 0) return result;

    // 0. 번호에 대응되는 digitsMapping 과 digitsMapping 의 index 에 대응되는 innerIndex 은
    // carry 값 계산을 위해 모두 1 크게 만듭니다.

    // 1. digits 의 숫자에 대응하는 digitsMapping 배열을 만듭니다.
    // {"abc", "def", "ghi}
    String[] digitsMapping = new String[digits.length() + 1];
    for (int i = 0; i < digits.length(); i++) {
      digitsMapping[i] = mapping[digits.charAt(i) - '0'];
    }

    // 2. digitsMapping 의 각 String 마다 index 를 지정해줍니다.
    // {0, 0, 0}
    int[] innerIndex = new int[digits.length() + 1];

    // 3. 제일 큰 carry 값이 1이 되면 while 을 중지합니다.
    while (innerIndex[digits.length()] != 1) {
      // 4. String 의 innerIndex char 값을 더해 List 에 추가해줍니다.
      StringBuilder sb = new StringBuilder("");
      for (int i = 0; i < digits.length(); i++) {
        sb.append(digitsMapping[i].charAt(innerIndex[i]));
      }
      result.add(sb.toString());

      // 5. innerIndex 의 carry 값 계산을 수행합니다.
      innerIndex[0]++;
      for (int j = 0; j < digits.length() && innerIndex[j] > digitsMapping[j].length() - 1; j++) {
        innerIndex[j] = 0;
        innerIndex[j + 1]++;
      }
    }

    return result;
  }
}
