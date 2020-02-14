# 543. Diameter of Binary Tree   
[링크](https://leetcode.com/problems/diameter-of-binary-tree/)

## 문제 설명

Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

> Example:
```
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
```

Note: The length of path between two nodes is represented by the number of edges between them.

## 풀이
> Solution
######  public int trailingZeroes(int n)
- n! 의 값 중 0이 나오는 경우는 2 와 5가 인수로서 곱해지는 경우 입니다.  
2는 충분히 많이 나옴으로 5가 나오는 경우에 대해 계산해주면 됩니다. 
    - 5의 제곱수인 경우 해당 수만큼 수를 늘려줍니다. 


## Test    
> SolutionTest


## 추가로 해볼 것
