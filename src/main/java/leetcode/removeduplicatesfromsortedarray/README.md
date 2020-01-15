# 26. Remove Duplicates from Sorted Array   
[링크](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 문제 설명
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}

## 풀이
###### reverse
- reverseByInteger 를 사용하는 경우 reverse 한 값을 다시 reverse 하여 비교하는 것으로 검증합니다.
    - x 의 1의 자리가 0으로 들어올 수 있기에 이를 보정하는 로직을 넣어줍니다.

###### reverseByString
- x 를 절대값 처리 후 toCharArray() 를 통해서 charStringX 배열을 만듭니다.
- charStringX 를 역순으로 정렬하여 result 를 만듭니다.
- x 가 음수면 result 에 음수를 붙여줍니다.
- Integer.parseInt 시 try-catch 문을 통해 오버플로우를 방지합니다.
 
###### reverseByInteger
- x 를 절대값 처리 후 나머지 값을 이용한 방법으로 reverse 를 구합니다.
- 오버플로우가 예상되는 부분에 방어 로직을 넣어줍니다.
    
## Test    
> SolutionTest

###### before() 
    
###### after()

## 추가로 해볼 것
- reverseByInteger 의 방어 로직이 여러번 들어가야 하는가? 줄일 수 있는 방법이 없는가?
    
- junit 의 리팩토링. assert 사용해보기.

