package com.example.leec.bfs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    public static void main(String[] args) {

    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> lookup = new HashMap<>();
        Node clone = new Node(node.val, new ArrayList<Node>());
        lookup.put(node, clone);
        //队列就是添加node，然后遍历
        Deque<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            //把node的neighbors的子node添加到map
            for (Node n : tmp.neighbors) {
                if (!lookup.containsKey(n)) {
                    lookup.put(n, new Node(n.val, new ArrayList<Node>()));
                    queue.offer(n);
                }
                //赋值clone中的neighbors
                lookup.get(tmp).neighbors.add(lookup.get(n));
            }
        }
        return clone;
    }


    public class Node {
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
