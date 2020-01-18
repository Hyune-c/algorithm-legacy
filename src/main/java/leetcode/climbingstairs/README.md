# 70. Climbing Stairs   
[링크](https://leetcode.com/problems/climbing-stairs/)

## 문제 설명

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

> Example 1:
```
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```
> Example 2:
```
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
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