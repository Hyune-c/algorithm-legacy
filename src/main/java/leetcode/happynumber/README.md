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

###### static int way[]
- 해당 index 로 갈 수 있는 way 의 수를 저장한 배열 입니다.
 
###### private void init(int n) 
- way 의 초기 값을 지정하는 메서드입니다.
               
###### public int climbStairs(int n) 
- way 의 초기 값을 기준으로 way 를 계산합니다.


## Test    
> SolutionTest


## 그외
- 다른 코드 중에는 2개의 변수를 갱신하는 방법으로 구하는 코드도 있었습니다.
하지만 저는 way 를 직관적으로 보여주고 출력하는 것이 더 좋다고 생각하여 이렇게 작성하였습니다. 