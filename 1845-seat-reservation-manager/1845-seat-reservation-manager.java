class SeatManager {
    int marker;
    PriorityQueue<Integer> seats;
    public SeatManager(int n) {
        marker = 1;
        seats = new PriorityQueue<>();
    }
    
    public int reserve() {
        if(!seats.isEmpty()) {
            return seats.poll();
        }
        
        int seat = marker;
        marker++;
        return seat;
    }
    
    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */