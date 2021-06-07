// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this - 

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        int i;
        vector<int> ret_vect;
        int len = nums.size();
        
        // Variable for running product
        int p = 1;

        // Traverse in Forward Direction        
        for(i = 0; i < len; i++)
        {
            ret_vect.push_back(p);
            p *= nums[i];
        }
        
        p = 1;
        
        // Traverse in Reverse Direction
        for(i = len-1; i >= 0; i--)
        {
            ret_vect[i] *= p;
            p *= nums[i];
        }
        
        return ret_vect;
    }
};