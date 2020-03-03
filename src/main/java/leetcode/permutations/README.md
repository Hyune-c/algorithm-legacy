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

1. index 는 0 부터 시작하여 입력 값 nums 의 길이까지 재귀 호출을 해줍니다.

2. swap 을 도는 for 문을 시작하는 i 값은 index 로 지정합니다.
    - 재귀적으로 호출되기에 index 이전의 값은 이미 swap 이 되었습니다. 

3. 모든 케이스를 하기 위해서 재귀 호출을 한 이후에는 배열을 다시 원상태로 돌립니다.

## Test    


## 마치며 ..
