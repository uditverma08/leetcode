package main.Trie;

public class Node {

    Node[] ref = new Node[26];
    boolean flag = false;

    public boolean contains(char ch) {
        return this.ref[ch - 'a'] != null;
    }

    public void put(char ch) {
        this.ref[ch - 'a'] = new Node();
    }

    public Node get(char ch ) {
        return this.ref[ch - 'a'];
    }

    public void setEnd() {
        this.flag = true;
    }

    public boolean isEnd() {
        return flag;
    }
}
