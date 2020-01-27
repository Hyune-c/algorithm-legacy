# LeetCode 단위 테스트에 필요한 템플릿

> List

[reverselinkedlist](https://github.com/Hyune-c/algorithm/blob/master/src/test/java/leetcode/reverselinkedlist/ReverselinkedlistTest.java)

###### ListNode makeListNode(int[] input) 
input 의 값을 가진 single linked list 를 만듭니다.

###### boolean isSameListNodes(ListNode nodeA, ListNode nodeB)
nodaA 와 nodeB 를 headnode 로 가지는 linkedList 가 같은지 확인합니다.

> Tree

[symmetrictree](https://github.com/Hyune-c/algorithm/blob/master/src/test/java/leetcode/symmetrictree/SymmetrictreeTest.java)
  
###### Node makeNodeTree(Node root, Integer[] arr, int i, int n) 
재귀적으로 NodeTree 를 만듭니다. 함수 호출은 아래와 같이 하면 됩니다.  
`makeNodeTree(root, input, 0, input.length);`