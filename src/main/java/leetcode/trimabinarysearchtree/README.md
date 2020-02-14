# 669. Trim a Binary Search Tree
[링크](https://leetcode.com/problems/trim-a-binary-search-tree/)


## 문제 설명
Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

> Example 1:
```
Input: 
    1
   / \
  0   2

  L = 1
  R = 2

Output: 
    1
      \
       2
```
> Example 2:
```
Input: 
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

Output: 
      3
     / 
   2   
  /
 1
```
## 풀이
###### public TreeNode trimBST(TreeNode root, int L, int R) 
- 재귀적으로 Node.val 이 L 과 R 사이인 경우에만 return 합니다. 


## Test    


## 추가로 해볼 것
 
