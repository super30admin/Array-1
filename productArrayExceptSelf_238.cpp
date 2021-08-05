// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        if(nums.empty() || nums.size() == 0){
            vector<int> x;
            return x;
        }
        int rp=1;
        vector<int> res(nums.size());
        res[0] = 1;
        for(int i=1; i<res.size(); i++){
            rp = rp*nums[i-1];
            res[i] = rp;
        }
        rp=1;
        for(int i = res.size()-2; i>=0; i--){
            rp = rp*nums[i+1];
            res[i] = res[i]*rp;
        }
        return res;
    }
};
