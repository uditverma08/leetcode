package main.Trie;

public class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }
    public void insert(String word) {
        Node node = root;

        for(char ch : word.toCharArray()) {
            if(!node.contains(ch)) {
                node.put(ch);
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        Node node = root;
        for(char ch : word.toCharArray()) {
            node = node.get(ch);
            if(node == null)
                return false;
        }
        return node.flag;
    }

    public boolean startsWith(String prefix) {

        Node node = root;
        for(char ch : prefix.toCharArray()) {
            node = node.get(ch);
            if(node == null)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("word");
        trie.insert("world");
        trie.insert("dog");
        trie.insert("dolphin");
        System.out.println(trie.startsWith("don"));
        System.out.println(trie.search("world"));
    }
}
