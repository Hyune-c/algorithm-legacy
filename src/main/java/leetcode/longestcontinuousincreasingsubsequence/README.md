# 674. Longest Continuous Increasing Subsequence
[링크](https://leetcode.com/problems/longest-continuous-increasing-subsequence/)

## 문제 설명

Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

> Example 1:
```
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
```

> Example 2:
```
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
```

## 풀이
###### public int findLengthOfLCIS(int[] nums)  
- 배열을 순회하며 increasing 한 경우 curCount++ 해줍니다.
- increasing 하지 않은 경우를 만날 경우 Math.max(curCount, longestCount) 를 통해 longestCount 를 갱신해줍니다.

## Test    


## 추가로 해볼 것
 
