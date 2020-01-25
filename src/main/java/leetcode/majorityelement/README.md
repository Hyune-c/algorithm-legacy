# 169. Majority Element   
[링크](https://leetcode.com/problems/majority-element/)

## 문제 설명

Given an array of size n, find the majority element. 
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

> Example 1:
```
Input: [3,2,3]
Output: 3
```
> Example 2:
```
Input: [2,2,1,1,1,2,2]
Output: 2
```
## 풀이
> Solution

###### public int majorityElement(int[] nums)  
문제의 조건에 nums 배열은 비지 않고, majority 값이 항상 존재한다고 전제되어 있습니다.  
이 배열을 정렬하면 그 개수가 2/n 보다 큰 수는 배열의 정중앙에 위치하게 됩니다. 


## Test    
> SolutionTest


## 그외
