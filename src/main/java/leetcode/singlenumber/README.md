# 136. Single Number
[링크](https://leetcode.com/problems/single-number/)


## 문제 설명
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

> Example 1:
```
Input: [2,2,1]
Output: 1
```
> Example 2:
```
Input: [4,1,2,1,2]
Output: 4
```


## 풀이
> Solution

###### public boolean isHappy(int n)
- 같은 수가 반복되는 경우 happynunber 가 아닙니다.
- HashSet 을 이용해서 이미 본 수를 기록하고 반복문마다 HashSet 에 존재 여부를 확인합니다. 


## Test    


## 그외
