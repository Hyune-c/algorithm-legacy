# 581. Shortest Unsorted Continuous Subarray   
[링크](https://leetcode.com/problems/shortest-unsorted-continuous-subarray/)

## 문제 설명

Given an integer array, 
you need to find one continuous subarray that if you only sort this subarray in ascending order,
 then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

> Example 1:

```
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
```

> Note:

Then length of the input array is in range [1, 10,000].  
The input array may contain duplicates, so ascending order here means <=.

## 풀이
###### public int findUnsortedSubarray(int[] nums)
- nums 과 nums 를 정렬한 배열을 서로 비교하면서 서로 다른 값을 가진 index 를 체크하여 값을 찾습니다.
    
## Test    
> SolutionTest


## 추가로 해볼 것

더 좋은 알고리즘이 있었으나 정확히 이해하지 못했습니다. 후에 다시 풀어봐야될 듯 합니다.