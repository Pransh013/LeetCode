class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        unordered_map<int, int> map;
        for(int i=0; i<n; i++) {
            int t = target - nums[i];
            if(map.find(t) != map.end()) return {i, map[t]};
            map[nums[i]] = i;
        }
        return {};
    }
};