# 849. Maximize Distance to Closest Person   
[링크](https://leetcode.com/problems/maximize-distance-to-closest-person/)

## 문제 설명

In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to closest person.

> Example 1:
```
Input: [1,0,0,0,1,0,1]
Output: 2

Explanation: 
If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.
```
> Example 2:
```
Input: [1,0,0,0]
Output: 3

Explanation: 
If Alex sits in the last seat, the closest person is 3 seats away.
This is the maximum distance possible, so the answer is 3.
```
> Note:
```
1 <= seats.length <= 20000
seats contains only 0s or 1s, at least one 0, and at least one 1.
```
## 풀이
> 알고리즘
1. 1 과 1 사이의 값을 구해서 그 절반을 구하면 가장 먼 자리의 길이가 나옵니다.
2. 시작 또는 끝이 0 인 경우 절반이 아닌 전체 길이가 가장 먼 자리의 길이가 됩니다.
  
> Solution

###### public int maxDistToClosest(int[] seats)  
- 알고리즘을 만족하기 위해서 Deque 를 사용하였습니다.
- 알고리즘의 2번 조건을 만족하기 위하여 pollFirst(), pollLast() 를 사용해 시작과 끝의 길이를 먼저 체크 하였습니다.
- 이후는 모두 1번 조건에 만족하기 때문에 1/2 을 이용해 구하였습니다.  

## Test    
> SolutionTest


## 그외
