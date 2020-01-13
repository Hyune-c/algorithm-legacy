# 20. Valid Parentheses
[링크](https://leetcode.com/problems/valid-parentheses/)

## 문제 설명
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:
```
Input: "()"  
Output: true  
```

Example 2:
```
Input: "()[]{}"  
Output: true  
```

Example 3:
```
Input: "(]"
Output: false
```

Example 4:
```
Input: "([)]"
Output: false
```

Example 5:
```
Input: "{[]}"
Output: true
```
## 풀이
###### public boolean isMatchedBracket(char bracket1, char bracket2) 
- 괄호의 쌍이 맞는지 검사합니다.

###### public boolean isValid(String s) 
- 입력값을 앞부터 검사하여 열린 괄호인 경우 bracketsQueue 에 add 해줍니다.
    - 열린 괄호가 아닌 경우 pop 한 값이 닫는 괄호가 아닌 경우 false 를 리턴 합니다.
- 입력값에 대한 검사가 끝났는데도 bracketsQueue 가 남아있다면 false 를 리턴 합니다.
- 입력값이 닫는 괄호로 시작하는 경우 bracketsQueue 가 빈 상태로 pop 하여 에러가 발생하는데 try-catch 문을 통해 잡아줍니다. 
 

## Test    

## 추가로 해볼 것
 
