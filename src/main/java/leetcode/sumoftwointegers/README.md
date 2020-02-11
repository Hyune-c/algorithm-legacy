# 371. Sum of Two Integers
[링크](https://leetcode.com/problems/sum-of-two-integers/)


## 문제 설명

Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

> Example 1:
```
Input: a = 1, b = 2
Output: 3
```
> Example 2:
```
Input: a = -2, b = 3
Output: 1
```

## 풀이
###### public int getSum(int a, int b)  
- XOR 과 AND 연산을 통해 합을 구합니다.
    - XOR 연산으로는 carry 를 제외한 합을, AND 연산을 통해서는 carry 를 구합니다.
- carry 가 존재하지 않으면 값을 그대로 return 하고  
carry 가 존재하면 메소드를 다시 호출합니다. 

## Test    


## 추가로 해볼 것
 
