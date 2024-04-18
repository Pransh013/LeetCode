class Solution {
public:
    bool check(long long mid, vector<int>& time, int totalTrips) {
        long long total_trips = 0;
        int n = time.size();
        for(int i = 0; i < n; i++) {
            total_trips += mid / time[i];
            if(total_trips >= totalTrips) return 1;
        }
        return 0;
    }
    long long minimumTime(vector<int>& time, int totalTrips) {
        long long lo = 1, hi = 1LL * time[0] * totalTrips;
        long long ans = -1;
        
        while(lo <= hi) {
            long long mid = lo + (hi - lo) / 2;
            
            if(check(mid, time, totalTrips)) {
                ans = mid;
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return ans;
    }
};