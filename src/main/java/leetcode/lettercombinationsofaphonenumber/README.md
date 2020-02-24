# 17. Letter Combinations of a Phone Number   
[링크](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

## 문제 설명

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



> Example:
```
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
```

Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.


## 풀이
0. 번호에 대응되는 digitsMapping 과 digitsMapping 의 index 에 대응되는 innerIndex 는 carry 값 계산을 위해 모두 1 크게 만듭니다.

1. digits 의 숫자에 대응하는 digitsMapping 배열을 만듭니다.  
{"abc", "def", "ghi}

2. digitsMapping 의 각 String 마다 index 를 지정해줍니다.  
{0, 0, 0}

3. String 의 innerIndex char 들을 더해 List 에 추가해줍니다.

4. innerIndex 의 carry 값 계산을 수행하고 제일 큰 carry 값이 1이 되면 while 을 중지합니다.


## Test    
> SolutionTest


## 마치며
Queue 를 이용하면 좀 더 가독성이 좋게 만들 수 있을 것 같지만 속도를 위해 배열과 수동 index 를 사용하였습니다.
