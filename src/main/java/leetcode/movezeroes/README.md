# 283. Move Zeroes   
[링크](https://leetcode.com/problems/move-zeroes/)

## 문제 설명

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

> Example:
```
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
```
> Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

## 풀이
###### public void moveZeroes(int[] nums)
새로 만들 nums 의 index 를 지정한 후 nums 를 순회하면서 0 이 아닌 값이 나오면 index 에 맞춰 덮어씌움으로서 0의 값을 없애면서도 nums 의 순서를 유지할 수 있습니다. 그리고 나머지를 0으로 채웁니다.
    
## Test    
> SolutionTest


## 추가로 해볼 것

