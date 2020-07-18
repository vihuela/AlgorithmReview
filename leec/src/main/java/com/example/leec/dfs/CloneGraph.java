package com.example.leec.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {


    public static void main(String[] args) {
        ArrayList<Node> arr = new ArrayList<>();
        arr.add(new Node(2, new ArrayList<Node>()));
        Node n = new Node(1, arr);
        Node clone = copyWrapper(n);
        System.out.println(clone);
    }

    public static Node copyWrapper(Node node) {
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        return copy(node, map);
    }

    public static Node copy(Node node, Map<Node, Node> map) {
        if (map.containsKey(node)) return map.get(node);
        Node copy = new Node();
        copy.val = node.val;
        copy.neighbors = new ArrayList<>();
        map.put(node, copy);
        for (Node item : node.neighbors) {
            copy.neighbors.add(copy(item, map));
        }
        return copy;
    }

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
