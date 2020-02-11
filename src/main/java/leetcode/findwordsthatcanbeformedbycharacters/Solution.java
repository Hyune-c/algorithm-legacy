package leetcode.findwordsthatcanbeformedbycharacters;

import java.util.*;

class Solution {
  class myHashMap extends HashMap<Character, Integer> {
    @Override
    public Integer put(Character key, Integer value) {
      if (super.containsKey(key)) return super.put(key, super.get(key) + 1);
      return super.put(key, value);
    }

    @Override
    public Integer remove(Object key) {
      if (super.containsKey(key) && super.get(key) != 1)
        return super.put((char) key, super.get(key) - 1);
      return super.remove(key);
    }
  }

  public boolean isInside(String word, Map<Character, Integer> charsMap) {
    for (Character w : word.toCharArray()) {
      if (!charsMap.containsKey(w)) return false;
      charsMap.remove(w);
    }

    return true;
  }

  public int countCharacters(String[] words, String chars) {
    Map<Character, Integer> charsMap = new myHashMap();
    int result = 0;

    for (char c : chars.toCharArray()) charsMap.put(c, 1);

    for (String word : words) {
      result += isInside(word, (Map<Character, Integer>) ((myHashMap) charsMap).clone()) ? word.length() : 0;
    }

    return result;
  }
}