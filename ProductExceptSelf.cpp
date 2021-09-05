// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> result(nums.size(), 0);
        if(nums.size() == 0) return result;
        int rightProduct = 1;
        
        for(int i = 0; i < nums.size(); i++)
        {
            if(i == 0) result[i] = 1;
            else result[i] = nums[i - 1] * result[i - 1];
        }
        
        for(int i = nums.size() - 2; i >=0 ; i--)
        {
                rightProduct = rightProduct * nums[i + 1];
                result[i] = result[i] * rightProduct;
        }
        return result;
    }
};
