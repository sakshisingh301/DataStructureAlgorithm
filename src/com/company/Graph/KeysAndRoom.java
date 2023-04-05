package com.company.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRoom {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int roomSize= rooms.size();
        HashSet<Integer> set=new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        set.add(0);
        while(!queue.isEmpty() )
        {

            int room=queue.poll();

            for(int x: rooms.get(room) )
            {
                if(!set.contains(x)) {
                    set.add(x);
                    queue.add(x);
                }

            }

        }



    return set.size()==roomSize;





    }

    public static void main(String[] args) {

       // rooms = [[1,3],[3,0,1],[2],[0]]

    }
}
