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
> Solution

###### public boolean isPalindrome(String subString)  
- 매개변수가 Palindrome 지 체크합니다.
    - 가장 앞의 index 와 가장 뒤의 index 를 하나씩 움직이며 틀린 경우 false 를 리턴 합니다.
    
###### public String longestPalindrome(String s)
- i 는 1씩 증가하며 isPalindrome() 을 체크할 문자열의 시작을 뜻합니다.
    - 이미 찾은 result 문자열의 길이가 대상이 된 문자열의 길이 (s.length() - i) 보다 커지면 조건문을 종료 합니다.
- j 는 1씩 감소하며 isPalindrome() 을 체크할 문자열의 끝을 뜻합니다.
    - j 가 줄어듬에 따라 이미 찾은 result 문자열의 길이가 대상이 된 문자열의 길이 (j + 1 - i) 보다 커지면 조건문을 종료 합니다.
- 위 조건문에 만족하는 i, j 번째의 문자가 같은 경우 isPalindrome() 을 체크하고 result 를 갱신해줍니다. 
       


## Test    
> SolutionTest


## 마치며
- Manacher's algorithm 라는 알고리즘으로 풀면 O(n) 으로 풀 수 있다고 합니다.
하지만 제가 만든 알고리즘으로는 O(n2) 인 듯 하고, 더 나은 알고리즘을 적용하는 것은 조금 더 공부가 필요할 것 같습니다. 
