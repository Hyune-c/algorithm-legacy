# Two Sum
[링크](https://leetcode.com/problems/two-sum/)

## 문제 설명
Given an array of integers, return indices of the two numbers such that they add up to a specific target.  
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,  
return [0, 1].

## 풀이
> StringCompression 
###### splitN 
- 입력받은 문자열을 단위에 맞게 자른 String array 를 만듭니다.

###### makeMinString 
- String array 를 위 조건에 맞게 압축하여 결과 String 을 만듭니다.

###### getMinLength 
- 만들어진 결과 String 중 가장 짧은 길이를 가져옵니다.

## Test    
> UnfinishedplayerTest

###### before() 
- participant, completion, result 선언.
    
###### after()
- participant, completion 출력.
- arraySolution, hashSolution 를 각각 실행해주며 시간을 측정한다.

###### Test6
- 이미 정렬된 최대 입력 값으로 들어올 때를 테스트. 
- arraySolution : 37 ms, hashSolution : 73 ms

###### Test7
- 정렬되지 않은 최대 입력 값으로 들어올 때를 테스트.
- arraySolution : 255 ms, hashSolution : 17 ms

## 추가로 해볼 것
- junit 의 리팩토링. 
