# 172. Factorial Trailing Zeroes   
[링크](https://leetcode.com/problems/factorial-trailing-zeroes/)

## 문제 설명

Given an integer n, return the number of trailing zeroes in n!.

> Example 1:
```
Input: 3
Output: 0
Explanation: 3! = 6, no trailing zero.
```
> Example 2:
```
Input: 5
Output: 1
Explanation: 5! = 120, one trailing zero.
```
Note: Your solution should be in logarithmic time complexity.


## 풀이
> Solution
######  public int trailingZeroes(int n)
- n! 의 값 중 0이 나오는 경우는 2 와 5가 인수로서 곱해지는 경우 입니다.  
2는 충분히 많이 나옴으로 5가 나오는 경우에 대해 계산해주면 됩니다. 
    - 5의 제곱수인 경우 해당 수만큼 수를 늘려줍니다. 


## Test    
> SolutionTest


## 추가로 해볼 것
