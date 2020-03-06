package leetcode.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

  private int capacity;
  private Map<Integer, Integer> cacheMap = new LinkedHashMap<Integer, Integer>() {
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
      return size() > capacity;
    }
  };

  public LRUCache(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key) {
    int result = cacheMap.getOrDefault(key, -1);
    if (result != -1) {
      cacheMap.remove(key, result);
      cacheMap.put(key, result);
    }

    return result;
  }

  public void put(int key, int value) {
    cacheMap.put(key, value);
    cacheMap.remove(key, value);
    cacheMap.put(key, value);
  }
}
