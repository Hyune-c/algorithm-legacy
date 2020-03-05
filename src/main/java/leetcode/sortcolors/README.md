# 75. Sort Colors   
[링크](https://leetcode.com/problems/sort-colors/)

## 문제 설명

Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

> Example:
```
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```
> Follow up:

- A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
- Could you come up with a one-pass algorithm using only constant space?

## 풀이
- Counting Sort 알고리즘을 이용하여 풀었습니다.
    - 정석적인 Counting Sort 는 누적합을 이용해야되지만 굳이 그럴 필요 없이 index 라는 flag 를 만들어 처리하였습니다.
    
## Test    
> SolutionTest


## 추가로 해볼 것

더 좋은 알고리즘이 있었으나 정확히 이해하지 못했습니다. 후에 다시 풀어봐야될 듯 합니다.
