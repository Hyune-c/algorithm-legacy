# Reverse Integer   
[링크](https://leetcode.com/problems/reverse-integer/)

## 문제 설명
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123  
Output: 321  
Example 2:  

Input: -123  
Output: -321  
Example 3:  

Input: 120  
Output: 21
  
Note:  
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## 풀이
###### reverse
- reverseByInteger 를 사용하는 경우 reverse 한 값을 다시 reverse 하여 비교하는 것으로 검증합니다.
    - x 의 1의 자리가 0으로 들어올 수 있기에 이를 보정하는 로직을 넣어줍니다.

###### reverseByString
- x 를 절대값 처리 후 toCharArray() 를 통해서 charStringX 배열을 만듭니다.
- charStringX 를 역순으로 정렬하여 result 를 만듭니다.
- x 가 음수면 result 에 음수를 붙여줍니다.
- Integer.parseInt 시 try-catch 문을 통해 오버플로우를 방지합니다.
 
###### reverseByInteger
- x 를 절대값 처리 후 나머지 값을 이용한 방법으로 reverse 를 구합니다.
- 오버플로우가 예상되는 부분에 방어 로직을 넣어줍니다.
    
## Test    
> SolutionTest

###### before() 
    
###### after()

## 추가로 해볼 것
- reverseByInteger 의 방어 로직이 여러번 들어가야 하는가? 줄일 수 있는 방법이 없는가?
    
- junit 의 리팩토링. assert 사용해보기.

