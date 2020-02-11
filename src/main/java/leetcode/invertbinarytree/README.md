# 226. Invert Binary Tree   
[링크](https://leetcode.com/problems/invert-binary-tree/)

## 문제 설명

Invert a binary tree.

> Example:
```
Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

> Trivia:

This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.

## 풀이
> Solution

###### public boolean isIsomorphic(String s, String t)  
- 각 문자열의 index 값을 HashMap 을 통해 비교합니다.
    - s 의 값을 key, t 의 값을 value 로 생각하였습니다.
    - key 값이 존재하면 value 가 같은지 체크 후 다르면 false.
    - key 값이 존재하지 않는데, value 만 존재하는 경우 false. 
    - 위 조건을 모두 통과하는 경우는 key, value 둘 다 존재하지 않는 경우임으로 추가해 줍니다. 

- 다른 사람의 풀이 중에는 입력 값을 key/value 로 한 번, value/key 로 체크하여 모두 true 인 경우를 찾는 방법도 있었습니다. 

## Test    
> SolutionTest


## 그외
