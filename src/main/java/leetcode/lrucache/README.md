# 146. LRU Cache   
[링크](https://leetcode.com/problems/lru-cache/)

## 문제 설명

Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

- get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
- put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.

> Follow up:

Could you do both operations in O(1) time complexity?

> Example:
```java
LRUCache cache = new LRUCache( 2 /* capacity */ );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
```

## 풀이
- LinkedHashMap 을 활용하여 풀었습니다.  
https://github.com/Hyune-c/TIL/blob/master/Java/Collection%20Framework.md#-linkedhashmap
## Test    

## 마치며
LinkedHashMap 자료 구조에 대해 알 수 있었습니다.
