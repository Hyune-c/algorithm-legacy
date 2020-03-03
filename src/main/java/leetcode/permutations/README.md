# 46. Permutations   
[링크](https://leetcode.com/problems/permutations/)

## 문제 설명

Given a collection of distinct integers, return all possible permutations.

> Example:
```
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
```

## 풀이
> Solution
###### public int removeDuplicates(int[] nums)
- nums 배열을 순회하면서 index 의 값보다 큰 경우 index+1 에 값을 가져온다.
    - 이미 정렬이 된 배열임으로 뒤로 갈수록 큰 수만 나오며, return 값이 곧 length 임으로 swap 의 필요성도 없다.


## Test    


## 추가로 해볼 것
