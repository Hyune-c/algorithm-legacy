# 49. Group Anagrams   
[링크](https://leetcode.com/problems/group-anagrams/)

## 문제 설명

Given an array of strings, group anagrams together.

> Example:
```
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
```
> Note:

All inputs will be in lowercase.
The order of your output does not matter.

## 풀이
0. 연산된 String 을 재귀적으로 전달하여 처리합니다. 

1. leftCloseCount (닫는 괄호) 가 0이 되면 List 에 추가하고 return 합니다.
 
2. leftOpenCount (여는 괄호) 가 0 보다 큰 경우 
    - 문자열에 "(" 를 붙이고 leftOpenCount 를 1 줄여 재귀 호출 합니다.
    - leftOpenCount 가 0 보다 큰 경우는 항상 여는 괄호를 사용할 수 있기 때문입니다.
3. leftCloseCount 가 leftOpenCount 보다 크다면
    - 문자열에 ")" 를 붙이고 leftCloseCount 를 1 줄여 재귀 호출 합니다.
    - 닫는 괄호의 남은 개수는 여는 괄호의 남은 개수보다 클 때만 사용할 수 있기 때문입니다.
          
## Test    

## 마치며...
Bracket 에 관한 문제이기에 처음에는 Stack 자료구조를 사용하면 될 것이라고 생각했는데, 풀고나니 재귀를 사용하는 것이 더 편했습니다.  
만약 좀 더 빠른 구조를 하려면 멤버 변수에 StringBuilder 를 두는 방법이 있겠지만, 지금의 형태가 좀 더 직관적이라고 생각합니다.
