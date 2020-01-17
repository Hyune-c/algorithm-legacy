# 21. Merge Two Sorted Lists   
[링크](https://leetcode.com/problems/merge-two-sorted-lists/)

## 문제 설명
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

## 풀이
> Solution
###### public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
- val 가 작은 쪽의 next 에 한쪽의 ListNode 가 null 이 될 때까지 재귀함수를 호출해줍니다.  

- 한쪽의 ListNode 가 null 이면 반대쪽의 ListNode 가 return 됩니다.
    - return 을 받아주는 주체가 ListNode->next 기 때문에 반대쪽의 ListNode 가 null 이어도 상관 없습니다.


## Test    
> SolutionTest

###### static void insertNode(ListNode node, int input)
- ListNode 에 값을 추가하는 메서드.

###### static ListNode initListNode(int[] input) 
- 테스트를 위한 배열을 만드는 메서드.


## 추가로 해볼 것
