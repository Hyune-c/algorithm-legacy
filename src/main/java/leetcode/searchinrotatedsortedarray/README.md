# 33. Search in Rotated Sorted Array   
[링크](https://leetcode.com/problems/search-in-rotated-sorted-array/)

## 문제 설명

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

> Example 1:
```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```
> Example 2:
```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```
## 풀이
0. 제일 단순한 풀이는 nums 를 모두 순회하면서 검색합니다.
    - leetcode 통과함.
1. 좀 더 빠른 검색을 위해 nums 의 시작 값과 끝 값을 비교하여 검색 속도를 개선합니다.
    
## Test    
> SolutionTest

## 마치며..

시간복잡도 O(logN) 을 만족하기 위해서는 이진 검색을 활용해야하지만 정상적으로 정렬된 배열이 아니기에 추가 로직이 필요할 듯 합니다.  
제가 만든 알고리즘은 이진 검색보다는 느리지만 충분히 빠르다고 생각되고, 실무에서는 자료구조를 쓸 것이기에 이정도만 하였습니다.
