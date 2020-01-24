# 141. Linked List Cycle
[링크](https://leetcode.com/problems/linked-list-cycle/)


## 문제 설명
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, 
we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.  
 If pos is -1, then there is no cycle in the linked list.


> Example 1:

```
Input: head = [3,2,0,-4], pos = 1  
Output: true  
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```

> Example 2:
```
Input: head = [1,2], pos = 0  
Output: true  
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```

> Example 3:
```
Input: head = [1], pos = -1  
Output: false  
Explanation: There is no cycle in the linked list.
``` 

> Follow up:

Can you solve it using O(1) (i.e. constant) memory?


## 풀이
###### public boolean hasCycle(ListNode head) 
- walker 가 n 만큼 갈 때, runner 는 2n 만큼 노드를 순회합니다.
    - 순환되는 list 라면 n 이 순환되는 노드의 길이와 같아질 때 runner 와 walker 는 같게 됩니다.
    - 순환되지 않는 list 라면 runner 는 null 을 만나게 됩니다.


## Test    


## 추가로 해볼 것
 
