# 101. Symmetric Tree
[링크](https://leetcode.com/problems/symmetric-tree/)


## 문제 설명
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
``` 

But the following [1,2,2,null,3,null,3] is not:
```
    1
   / \
  2   2
   \   \
   3    3
```

## 풀이
###### public boolean isSymmetric(TreeNode root)  
재귀 함수 isMirror 를 호출 합니다.

###### public boolean isMirror(TreeNode t1, TreeNode t2) 
TreeNode t1, t2 를 null 체크 후 val 값 비교와 좌우를 바꿔 재귀를 호출하면 대칭을 확인할 수 있습니다.


## Test    


## 추가로 해볼 것
 
