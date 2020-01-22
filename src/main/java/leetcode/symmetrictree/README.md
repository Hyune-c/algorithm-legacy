# 101. Symmetric Tree
[링크](https://leetcode.com/problems/symmetric-tree/)


## 문제 설명
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
``` 

But the following [1,2,2,null,3,null,3] is not:
```
    1
   / \
  2   2
   \   \
   3    3
```

## 풀이
###### twoSumByDoubleFor 
- 이중 for 문을 통하여 모든 배열을 검사 합니다.

###### twoSum 
- HashMap seen 을 만듭니다.
    - nums 중 이미 본 값을 <value, key> 순으로 넣어주게 됩니다.
- nums 배열을 돌면서 'target - index 의 값' 이 seen 배열에 존재하는지 확인합니다.
    - 존재한다면 혹시 같은 index 의 값인지 비교 후 아니라면 정답으로 출력합니다.
    - 존재하지 않는다면 해당 값은 seen 에 넣어줍니다.   

## Test    


## 추가로 해볼 것
 
