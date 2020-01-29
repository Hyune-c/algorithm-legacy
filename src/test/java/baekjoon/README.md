# Backjoon 단위 테스트에 유용한 템플릿

> 입력 값 받기
[reverselinkedlist](https://github.com/Hyune-c/algorithm/blob/master/src/test/java/leetcode/reverselinkedlist/ReverselinkedlistTest.java)

###### ListNode makeListNode(int[] input) 
input 의 값을 가진 single linked list 를 만듭니다.

###### boolean isSameListNodes(ListNode nodeA, ListNode nodeB)
nodaA 와 nodeB 를 headnode 로 가지는 linkedList 가 같은지 확인합니다.

> Tree
[symmetrictree](https://github.com/Hyune-c/algorithm/blob/master/src/test/java/leetcode/symmetrictree/SymmetrictreeTest.java)
  
###### TreeNode makeNodeTree(TreeNode root, Integer[] arr, int i) 
재귀적으로 NodeTree 를 만듭니다. i 값은 arr 배열의 index 로 초기 값은 0 입니다.  

###### public boolean isSameTree(TreeNode nodeA, TreeNode nodeB)
각 Tree 의 root 값을 받아 Tree 가 같은지 여부를 확인합니다.
