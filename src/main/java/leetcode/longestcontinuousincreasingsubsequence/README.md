# 674. Longest Continuous Increasing Subsequence
[링크](https://leetcode.com/problems/longest-continuous-increasing-subsequence/)

## 문제 설명

Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

> Example 1:
```
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
```

> Example 2:
```
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
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
 
