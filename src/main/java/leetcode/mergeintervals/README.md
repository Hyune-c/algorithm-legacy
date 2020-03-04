# 56. Merge Intervals   
[링크](https://leetcode.com/problems/merge-intervals/)

## 문제 설명

Given a collection of intervals, merge all overlapping intervals.

> Example 1:
```
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
```

> Example 2:
```
Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
```

NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.

## 풀이
- prev 와 cur 을 비교하여 합치는 것 보다는 동적 계획법을 사용해보았습니다.

1. nums 배열과 nums 사이의 interval 을 체크해주는 배열을 만들어 입력 값에 대해 채워주었습니다.  
  이 때 마지막 index 를 체크해줍니다.

2. 마지막 index 까지 돌며 interval 의 끝점인 경우 mergedList 에 추가해줍니다.

## Test    


## 마치며 ...
처음에는 nums 배열만을 가지고 알고리즘을 구상했는데, 이 경우 interval 이 없는 수가 단독으로 있는 경우 처리할 수 없었습니다.  
그래서 interval 을 체크해주는 배열을 따로 만들었는데, 동적 계획법을 사용하다보니 초기 배열의 크기를 잡기 힘들었습니다. 아마 실무에서는 hash 나 LinkedList 를 사용할 것으로 보입니다. 

알고리즘 자체는 쉽지만 코딩 길이는 생각보다 많았습니다.
