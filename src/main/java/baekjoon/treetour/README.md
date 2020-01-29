# 트리 순회 
[링크](https://www.acmicpc.net/problem/1991)

## 문제
이진 트리를 입력받아 전위 순회(preorder traversal), 중위 순회(inorder traversal), 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.

예를 들어 위와 같은 이진 트리가 입력되면,

- 전위 순회한 결과 : ABDCEFG // (루트) (왼쪽 자식) (오른쪽 자식)
- 중위 순회한 결과 : DBAECFG // (왼쪽 자식) (루트) (오른쪽 자식)
- 후위 순회한 결과 : DBEGFCA // (왼쪽 자식) (오른쪽 자식) (루트)

가 된다.

### 입력
첫째 줄에는 이진 트리의 노드의 개수 N(1≤N≤26)이 주어진다. 
둘째 줄부터 N개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드, 오른쪽 자식 노드가 주어진다. 
노드의 이름은 A부터 차례대로 영문자 대문자로 매겨지며, 항상 A가 루트 노드가 된다. 
자식 노드가 없는 경우에는 .으로 표현된다.

### 출력
첫째 줄에 전위 순회, 둘째 줄에 중위 순회, 셋째 줄에 후위 순회한 결과를 출력한다. 
각 줄에 N개의 알파벳을 공백 없이 출력하면 된다.

> 예제 입력 1 
```
7
A B C
B D .
C E F
E . .
F . G
D . .
G . .
```

> 예제 출력 1 
```
ABDCEFG
DBAECFG
DBEGFCA
```

## 풀이
> Main
###### public static void main(String[] args)
입력 값을 받아 Tree 를 만든 후 순회를 해줍니다.

###### public static String[] getInput(boolean needInputLength)
입력 값을 받기 위한 template 함수.
 
###### public static Node makeTree(String[] input) 
- root 부터 node 를 만드는 경우 자식 node 를 찾기 위해 순회를 해야됨으로 비효율적입니다.
- 입력 값의 역순으로 자식 node 부터 만들어 배열에 넣는 방법으로 만들었습니다. 
    
    
## Test    


## 추가로 해볼 것
