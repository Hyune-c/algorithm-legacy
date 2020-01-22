# 202. Happy Number 
[링크](https://leetcode.com/problems/happy-number/)

## 문제 설명

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

> Example:

```
Input: 19
Output: true
Explanation: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
```

## 풀이
> Solution

###### public boolean isHappy(int n)
- 같은 수가 반복되는 경우 happynunber 가 아니다.
- HashSet 을 이용해서 이미 본 수를 기록하고 반복문마다 HashSet 에 존재 여부를 확인한다. 


## Test    


## 그외
