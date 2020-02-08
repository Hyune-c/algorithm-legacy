# 205. Isomorphic Strings   
[링크](https://leetcode.com/problems/isomorphic-strings/)

## 문제 설명

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

> Example 1:
```
Input: s = "egg", t = "add"
Output: true
```
> Example 2:
```
Input: s = "foo", t = "bar"
Output: false
```
> Example 3:
```
Input: s = "paper", t = "title"
Output: true
```
Note:
You may assume both s and t have the same length.

## 풀이
> Solution

###### public boolean isIsomorphic(String s, String t)  
- 각 문자열의 index 값을 HashMap 을 통해 비교합니다.
    - s 의 값을 key, t 의 값을 value 로 생각하였습니다.
    - key 값이 존재하면 value 가 같은지 체크 후 다르면 false.
    - key 값이 존재하지 않는데, value 만 존재하는 경우 false. 
    - 위 조건을 모두 통과하는 경우는 key, value 둘 다 존재하지 않는 경우임으로 추가해 줍니다. 

- 다른 사람의 풀이 중에는 입력 값을 key/value 로 한 번, value/key 로 체크하여 모두 true 인 경우를 찾는 방법도 있었습니다. 

## Test    
> SolutionTest


## 그외
