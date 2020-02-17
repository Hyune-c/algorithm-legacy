# 11. Container With Most Water   
[링크](https://leetcode.com/problems/container-with-most-water/)

## 문제 설명

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

> Example:
```
Input: [1,8,6,2,5,4,8,3,7]
Output: 49
```
## 풀이
> Solution
######  public int maxArea(int[] height)
- 최대 면적을 구하는 알고리즘을 구현합니다.
    - 인덱스의 배열 값이 작은 쪽의 인덱스가 움직입니다.  
        이유는 큰 쪽의 배열 값이 유지되어야 면적이 더 커지기 때문입니다.

## Test    
> SolutionTest


## 추가로 해볼 것
