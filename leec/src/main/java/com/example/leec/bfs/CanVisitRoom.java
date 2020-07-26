package com.example.leec.bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CanVisitRoom {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();

        ArrayList<Integer> r0 = new ArrayList<>();
        Collections.addAll(r0, 1, 3);
        rooms.add(r0);

        ArrayList<Integer> r1 = new ArrayList<>();
        Collections.addAll(r1, 3, 2, 1);
        rooms.add(r1);

        ArrayList<Integer> r2 = new ArrayList<>();
        Collections.addAll(r2, 2);
        rooms.add(r2);

        ArrayList<Integer> r3 = new ArrayList<>();
        Collections.addAll(r3, 0);
        rooms.add(r3);

        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashMap<Integer, Boolean> seen = new HashMap<>();
        seen.put(0, true);
        LinkedList<Integer> keys = new LinkedList<>();
        keys.add(0);

        while (!keys.isEmpty()) {
            int tryKey = keys.pollLast();
            List<Integer> roomAllKey = rooms.get(tryKey);
            for (Integer key : roomAllKey) {
                if (!seen.containsKey(key)) {
                    seen.put(key, true);
                    keys.addLast(key);
                }
            }
        }
        return seen.size() == rooms.size();
    }

}
