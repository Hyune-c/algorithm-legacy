# 705. Design HashSet   
[링크](https://leetcode.com/problems/design-hashset/)

## 문제 설명

Design a HashSet without using any built-in hash table libraries.

To be specific, your design should include these functions:

- add(value): Insert a value into the HashSet. 
- contains(value) : Return whether the value exists in the HashSet or not.
- remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

> Example:
``` java
MyHashSet hashSet = new MyHashSet();
hashSet.add(1);         
hashSet.add(2);         
hashSet.contains(1);    // returns true
hashSet.contains(3);    // returns false (not found)
hashSet.add(2);          
hashSet.contains(2);    // returns true
hashSet.remove(2);          
hashSet.contains(2);    // returns false (already removed)
```

## 풀이
> class MyHashSet

HashSet 은 key 값으로 한번에 접근하며, 이를 위해 충분히 큰 boolean 배열을 만들었습니다.
유동적으로 하기 위해서는 들어온 값에 따라 Hash 의 크기를 조절하는 메서드가 필요할 것으로 보입니다. 
 

## Test    
> SolutionTest


## 추가로 해볼 것
