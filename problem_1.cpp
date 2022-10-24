/ Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ret(nums.size(), 0);
        
        int pp = 1;
        for (int i = 0; i < nums.size(); i++) {
            ret[i] = pp;
            pp *= nums[i];
        }
        
        int sp = 1;
        
        for (int i = nums.size() - 1; i >= 0; i--) {
            ret[i] *= sp;
            sp *= nums[i];
        }
        
        return ret;
        
    }
};
