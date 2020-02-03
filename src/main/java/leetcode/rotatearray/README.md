# 189. Rotate Array   
[링크](https://leetcode.com/problems/rotate-array/)

## 문제 설명

Given an array, rotate the array to the right by k steps, where k is non-negative.

> Example 1:
```
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```
> Example 2:
```
Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```
> Note:

- Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
- Could you do it in-place with O(1) extra space?


## 풀이
> Solution
###### public void rotate(int[] nums, int k)
- 전체를 reverse 한 후, 시작부터 k 까지 reverse, k 부터 끝까지 reverse 를 해주면 rotate 와 같은 결과를 보여줄 수 있습니다.
- 이 때 k 가 nums 의 최대 길이 보다 큰 경우 의미 없는 회전이 반복됨으로 나머지 값을 활용해줍니다.

###### public void reverse(int[] nums, int start, int end)
- start 와 end 를 받아 배열을 뒤집어 줍니다.

## Test    
> SolutionTest


## 추가로 해볼 것
