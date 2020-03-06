package leetcode.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

  private int capacity;
  private Map<Integer, Integer> cacheMap;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.cacheMap = new LinkedHashMap<Integer, Integer>(capacity, 0.75F, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
      }
    };
  }

  public int get(int key) {
    return cacheMap.getOrDefault(key, -1);
  }

  public void put(int key, int value) {
    cacheMap.put(key, value);
  }
}
