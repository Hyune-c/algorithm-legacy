# 206. Reverse Linked List   
[링크](https://leetcode.com/problems/reverse-linked-list/)

## 문제 설명

Reverse a singly linked list.

> Example:
```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
```
> Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

## 풀이
> Solution
###### public ListNode reverseList(ListNode head)
- reverseList 에서 head.next 를 null 로 바꾸지만, 이후 재귀 종료 후 second.next 를 head 로 해줌으로 인해서 reverse 를 구현할 수 있습니다.
    
## Test    
> SolutionTest


## 추가로 해볼 것

