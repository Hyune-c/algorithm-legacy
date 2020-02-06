# 703. Kth Largest Element in a Stream   
[링크](https://leetcode.com/problems/kth-largest-element-in-a-stream/)

## 문제 설명

Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.

> Example:
```java
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);   // returns 4
kthLargest.add(5);   // returns 5
kthLargest.add(10);  // returns 5
kthLargest.add(9);   // returns 8
kthLargest.add(4);   // returns 8
```

## 풀이
> class KthLargest
###### public KthLargest(int k, int[] nums)
- PriorityQueue 를 활용 합니다.
- input 으로 들어온 nums 배열을 PriorityQueue 의 add 나 offer 가 아닌 클래스의 add 를 이용해서 넣어줍니다. 

###### public int add(int val)
- add 메소드는 배열과 add 된 값 모두를 합쳤을 때 k 번째로 큰 수를 return 해야 합니다.
- PriorityQueue<Integer> 의 기본 정렬 순서는 오름차순 입니다. 
따라서 Queue 의 size 를 k 와 같을 때까지 poll 을 하면 자동적으로 peek 값이 return 값이 됩니다.

## Test    
> SolutionTest


## 그외
