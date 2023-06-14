// Time Complexity : O(n)

// Space Complexity: O(1)

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> result(nums.size(), 0);
        int ps = 1;
        int ss = 1;  

        result[0] = 1;

        for(int i = 1; i < nums.size(); i++) {
            result[i] = ps * nums[i-1];
            ps = result[i];

        }

        for(int i = nums.size()-2; i >= 0; i--) {
            result[i] = result[i] * ss * nums[i+1];
            ss = ss * nums[i+1];
        }

        return result; 
    }
};