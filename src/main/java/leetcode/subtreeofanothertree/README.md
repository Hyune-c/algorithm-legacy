# 572. Subtree of Another Tree
[링크](https://leetcode.com/problems/subtree-of-another-tree/)

## 문제 설명

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s.  
A subtree of s is a tree consists of a node in s and all of this node's descendants.   
The tree s could also be considered as a subtree of itself.

> Example 1:
```
Given tree s:

     3
    / \
   4   5
  / \
 1   2

Given tree t:
   4 
  / \
 1   2
```
Return true, because t has the same structure and node values with a subtree of s.


> Example 2:
```
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
   
Given tree t:
   4
  / \
 1   2
```
Return false.

## 풀이
###### 알고리즘
- preorder 순회 방식으로 Node 를 돌면서 val 이 같은 경우 하위 트리가 같은지 isSameTree() 를 통해 확인하였습니다.
 

## Test    


## 추가로 해볼 것
 
