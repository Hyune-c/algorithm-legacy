# 수 정렬하기 3
[링크](https://www.acmicpc.net/problem/10989)

## 문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

## 입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

## 출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

> 예제 입력 1   
```
10
5
2
3
1
4
2
3
5
1
7
```

> 예제 출력 1   
```
1
1
2
2
3
3
4
5
5
7
```

## 풀이
> Main
###### public static void countingSort() throws Exception

- 들어올 수 있는 최대 자연수의 개수만큼 배열을 만들어 줍니다.
- 들어온 자연수를 체크하여 그 인덱스에 count 를 증가시켜줍니다.
- numsCount 를 앞부터 count 개수 만큼 출력해주면 오름차순 정렬이 됩니다. 
    
## Test    


## 추가로 해볼 것
