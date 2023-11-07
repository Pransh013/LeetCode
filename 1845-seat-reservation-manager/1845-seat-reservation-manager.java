class SeatManager {
    int marker;

    TreeSet<Integer> availableSeats;

    public SeatManager(int n) {
        marker = 1;
        availableSeats = new TreeSet<>();
    }

    public int reserve() {
        if (!availableSeats.isEmpty()) {
            int seatNumber = availableSeats.first();
            availableSeats.remove(seatNumber);
            return seatNumber;
        }

        int seatNumber = marker;
        marker++;
        return seatNumber;
    }

    public void unreserve(int seatNumber) {
        availableSeats.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */