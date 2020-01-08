# programmers : 완주하지 못한 선수

## 문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다.  
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

## 제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

## 입출력 예
participant	completion	return  
[leo, kiki, eden]	[eden, kiki]	leo  
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko  
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav  

## 입출력 예 설명
예제 #1
leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

## 풀이
> arraySolution

- participant 와 completion 를 정렬한다.
- 동일한 index 에 같은 값이 존재하지 않는 케이스를 찾아 리턴합니다.
 
> hashSolution
- participantHashMap 을 만듭니다.
    - participant 가 중복되는 경우 HashMap 의 value 를 +1 해줍니다.
- completion 에 이름이 있는 선수를 participantHashMap 에서 지워줍니다.
    - value 가 1이면 remove 해줍니다.
    - value 가 1보다 크면 -1 해줍니다.
    
## Test    
> UnfinishedplayerTest

- public void before() 
    - participant, completion, result 선언.
    
- public void after()
    - participant, completion 출력.
    - arraySolution, hashSolution 를 각각 실행해주며 시간을 측정한다.

- Test6
    - 이미 정렬된 최대 입력 값으로 들어올 때를 테스트. 
    - arraySolution : 37 ms, hashSolution : 73 ms

- Test7
    - 정렬되지 않은 최대 입력 값으로 들어올 때를 테스트.
    - arraySolution : 255 ms, hashSolution : 17 ms

## 추가로 해볼 것
- participant 과 completion 차가 1이 아니다.
    - 완주하지 못한 선수가 다수 있을 경우.

