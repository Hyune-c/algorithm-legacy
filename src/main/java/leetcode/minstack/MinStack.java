package leetcode.minstack;

class MinStack {
    Node peek;

    class Node {
        int value;
        Node before;

        public Node(int value, Node before) {
            this.value = value;
            this.before = before;
        }
    }

    public MinStack() {
        peek = null;
    }

    public void push(int x) {
        Node before = peek;
        peek = new Node(x, before);
    }

    public void pop() {
        peek = peek.before;
    }

    public int top() {
        return peek.value;
    }

    public int getMin() {
        int min = peek.value;
        Node checker = peek;

        while (checker != null && checker.before != null) {
            checker = checker.before;
            if (checker.value < min) min = checker.value;
        }

        return min;
    }
}
