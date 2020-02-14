package leetcode.narytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;

class Solution {
  class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }

  public List<Integer> preorder(Node root) {
    List<Integer> returnList = new ArrayList<>();
    if (root == null) return returnList;

    returnList.add(root.val);
    for (int i = 0; i < root.children.size(); i++) {
      returnList.addAll(preorder(root.children.get(i)));
    }

    return returnList;
  }
}