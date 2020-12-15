// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        if(nums.size()==0) {
            return {};
        }
        int temp = 1, rp = 1;
        vector<int> result(nums.size());
        for(int i=0;i<nums.size();i++){
            rp = rp*temp;
            result[i] = rp;
            temp = nums[i];
        }
        temp = rp=1;
        for(int i=nums.size()-1;i>=0;i--){
            rp = rp*temp;
            result[i] = result[i]*rp;
            temp = nums[i];
        }
        return result;
    }
};
