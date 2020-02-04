package leetcode.designhashSet;

class MyHashSet {
    boolean[] hashArr;

    public MyHashSet() {
        hashArr = new boolean[Integer.MAX_VALUE >> 14];
    }

    public void add(int key) {
        hashArr[key] = true;
    }

    public void remove(int key) {
        hashArr[key] = false;
    }

    public boolean contains(int key) {
        return (hashArr[key]) ? true : false;
    }
}
