# 234. Palindrome Linked List   
[링크](https://leetcode.com/problems/palindrome-linked-list/)

## 문제 설명

Given a singly linked list, determine if it is a palindrome.

> Example 1:
```
Input: 1->2
Output: false
```
> Example 2:
```
Input: 1->2->2->1
Output: true
```
> Follow up:

Could you do it in O(n) time and O(1) space?

## 풀이
###### public boolean isPalindrome(ListNode head)
입력 값을 deque 에 받은 후 deque 의 양쪽에서 값을 빼서 비교하면 대칭임을 확인할 수 있습니다.

    
## Test    
> SolutionTest


## 추가로 해볼 것

