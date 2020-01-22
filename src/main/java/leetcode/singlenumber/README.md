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

###### public int singleNumber_linearSearch(int[] nums) 
- 모든 값을 검사하여 처음에는 HashSet 에 넣고, HashSet 에 값이 존재하면 지우는 로직으로 최종적으로 남는 1개의 값을 return 합니다.
- HashSet 으로 인한 메모리 사용과 add, remove 의 반복으로 인한 속도 지연이 발생하였습니다.  

###### public int singleNumber_sort(int[] nums) 
- 입력 값을 정렬 후 똑같은 수가 반복되지 않으면 그 값이 singlenumber 입니다.
- 정렬에 대한 비용이 듭니다.  

###### public int singleNumber(int[] nums)
- XOR 연산자를 사용하는 경우 같은 수는 서로 상쇄됨으로 최종적으로 한개의 수만 남습니다. 


## Test    


## 그외
