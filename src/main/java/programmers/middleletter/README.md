# 가운데 글자 가져오기
[링크](https://programmers.co.kr/learn/courses/30/lessons/12903)

## 문제 설명

단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

> 재한사항

s는 길이가 1 이상, 100이하인 스트링입니다.

> 입출력 예

s	return  
abcde	c  
qwer	we  

## 풀이
> Solution
###### public String solution(String s)
- input 의 길이가 홀수, 짝수임에 따라 다른 결과를 리턴해줍니다.
    - 홀수 : 가운데가 한 글자 임으로 length / 2 의 index 글자를 리턴해줍니다.
    - 짝수 : 가운데가 두 글자 임으로 length / 2 와 (length / 2) + 1 의 index 글자를 리턴해줍니다.
     
    
## Test    


## 그 외
