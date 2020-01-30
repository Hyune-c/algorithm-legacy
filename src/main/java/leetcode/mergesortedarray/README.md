# 88. Merge Sorted Array   
[링크](https://leetcode.com/problems/merge-sorted-array/)

## 문제 설명

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

> Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.  
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

> Example:
```
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
```


## 풀이
> Solution
######  public int maxSubArray(int[] nums)
- sum = Math.max(0, sum) + nums[i];
    - sum 값이 0 보다 작은 경우, max 를 구하기 위한 subarray 를 다시 시작하게 됩니다.


## Test    
> SolutionTest


## 추가로 해볼 것
