# 26. Remove Duplicates from Sorted Array   
[링크](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 문제 설명
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

> Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

> Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.

> Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:
```
// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
```
## 풀이
> Solution
###### public int removeDuplicates(int[] nums)
- nums 배열을 순회하면서 index 의 값보다 큰 경우 index+1 에 값을 가져온다.
    - 이미 정렬이 된 배열임으로 뒤로 갈수록 큰 수만 나오며, return 값이 곧 length 임으로 swap 의 필요성도 없다.


## Test    


## 추가로 해볼 것
