package design;

import java.util.PriorityQueue;

class SeatManager {

    PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();

    public SeatManager(int n) {
        for(int i=0;i<n;i++)
        {
            priorityQueue.add(i+1);
        }

    }

    public int reserve() {
        return !priorityQueue.isEmpty()? priorityQueue.poll() : 0;

    }

    public void unreserve(int seatNumber) {
        priorityQueue.add(seatNumber);

    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
