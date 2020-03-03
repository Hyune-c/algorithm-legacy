# 48. Rotate Image   
[링크](https://leetcode.com/problems/rotate-image/)

## 문제 설명

You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

> Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

> Example 1:
```
Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
```
> Example 2:
```
Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
```    

## 풀이

- matrix 를 유지한채 swap 을 하는 알고리즘이 있지만 로직을 직관적으로 보기위해 matrix2 를 만들어 복사하는 방법을 선택하였습니다.
- matrix 는 이중 배열로 깊은 복사를 하였습니다.
- i ,j 외에 k 를 두어 로직을 보기 편하게 했습니다.
    - i, j : matrix 에 채울 index 로 순차적으로 증가합니다.
    - k, i : 90도 이전의 index로 k 는 순차적으로 감소합니다. 

## Test    

## 추가로 해볼 것

