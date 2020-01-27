# 198. House Robber   
[링크](https://leetcode.com/problems/house-robber/)

## 문제 설명

You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.

> Example 1:
```
Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
```
> Example 2:
```
Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
```


## 풀이
> Solution
###### public int rob(int[] nums)
배열을 순회하면서 해당 index 에 나올 수 있는 최대의 수를 계산 합니다.
최대 값을 계산한 배열에서 가장 마지막 index 와 마지막에서 한칸 앞의 index 값을 비교하여 큰 값을 return 합니다. 

## Test    
> SolutionTest


## 그외
