# 104. Maximum Depth of Binary Tree   
[링크](https://leetcode.com/problems/intersection-of-two-linked-lists/)

## 문제 설명

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

> Example:

Given binary tree [3,9,20,null,null,15,7],
```
    3
   / \
  9  20
    /  \
   15   7
```
return its depth = 3.

## 풀이
> Solution

###### public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
- headA 의 리스트를 HashSet 으로 저장하고 headB 의 리스트를 순회하면서 같은 ListNode 가 나오면 리턴 합니다. 


## Test    
> SolutionTest


## 그외
또 다른 풀이로는 headA, headB 의 ListNodes 를 각각 만들고 length 를 비교하여 그 차 만큼을 이용하는 방법도 있었습니다. 
