# 605. Can Place Flowers   
[링크](https://leetcode.com/problems/can-place-flowers/)

## 문제 설명

Suppose you have a long flowerbed in which some of the plots are planted and some are not.   
However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty)  
, and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

> Example 1:
```
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
```
> Example 2:
```
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
```
> Note:

- The input array won't violate no-adjacent-flowers rule.
- The input array size is in the range of [1, 20000].
- n is a non-negative integer which won't exceed the input array size.

## 풀이
> Solution

###### public boolean canPlaceFlowers(int[] flowerbed, int n)
- flowerbed 을 순회하며서 자신, 앞, 뒤 칸의 값을 확인하여 PlaceFlower 의 여부를 확인합니다.
    - 이 때 배열의 가장 앞과 끝은 별도로 체크해주어야 한다.


## Test    
> SolutionTest


## 그외
