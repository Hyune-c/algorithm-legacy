# 581. Shortest Unsorted Continuous Subarray   
[링크](https://leetcode.com/problems/shortest-unsorted-continuous-subarray/)

## 문제 설명

Given an integer array, 
you need to find one continuous subarray that if you only sort this subarray in ascending order,
 then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

> Example 1:
``
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
``

> Note:

Then length of the input array is in range [1, 10,000].  
The input array may contain duplicates, so ascending order here means <=.

## 풀이
###### public List<Integer> findDisappearedNumbers(int[] nums)
- nums 를 순회하면서 index 를 표시하고 그 index 를 기준으로 없는 값을 추출하여 List 로 만들 수 있습니다.
    
## Test    
> SolutionTest


## 추가로 해볼 것

