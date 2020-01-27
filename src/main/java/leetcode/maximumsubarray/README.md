# 53. Maximum Subarray   
[링크](https://leetcode.com/problems/maximum-subarray/)

## 문제 설명

Given an integer array nums, find the contiguous subarray 
(containing at least one number) which has the largest sum and return its sum.

> Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],  
Output: 6  
Explanation: [4,-1,2,1] has the largest sum = 6.  

> Follow up:

If you have figured out the O(n) solution, 
try coding another solution using the divide and conquer approach, 
which is more subtle.


## 풀이
> Solution
######  public int maxSubArray(int[] nums)
- sum = Math.max(0, sum) + nums[i];
    - sum 값이 0 보다 작은 경우, max 를 구하기 위한 subarray 를 다시 시작하게 됩니다.


## Test    
> SolutionTest


## 추가로 해볼 것
