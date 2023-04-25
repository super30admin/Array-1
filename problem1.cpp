// Time Complexity : O(n)
// Space Complexity : O(1) as output array doesnot count as extra space.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// we initially calculated the left product at each particular index . next we multiply value at each index with right product 
// maintaining a variable for doing it.

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int>result(nums.size(),0);
        int rp = 1;
        for(int i = 0; i<nums.size();i++)
        {
            result[i] = rp;
            rp = rp*nums[i];
        }
        rp = 1;
        for(int i = nums.size()-2;i>=0;i--)
        {
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
        
    }
};