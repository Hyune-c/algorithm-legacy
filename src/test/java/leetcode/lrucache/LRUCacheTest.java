package leetcode.lrucache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

  LRUCache cache;
  int capacity;

  @BeforeEach
  void setUp() {
    capacity = 2;
    cache = new LRUCache(capacity);
  }

  @Test
  void get() {
    cache.put(1, 1);
    cache.put(2, 2);
    assertEquals(1, cache.get(1));
    cache.put(3, 3);    // evicts key 2
    assertEquals(-1, cache.get(2));       // returns -1 (not found)
    cache.put(4, 4);    // evicts key 1
    assertEquals(-1, cache.get(1));       // returns -1 (not found)
    assertEquals(3, cache.get(3));       // returns 3
    assertEquals(4, cache.get(4));       // returns 4
  }

  @Test
  void get2() {
    cache.put(2, 1);
    cache.put(1, 2);
    cache.put(2, 3);
    cache.put(4, 1);
    assertEquals(-1, cache.get(1));
    assertEquals(3, cache.get(2));       // returns -1 (not found)
  }
}
