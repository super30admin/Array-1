//Time complexity : O (n)
//Space complexity : O (1)
//Leetcode : Yes

//Approach :
            // Calculate a left side product of entire array meaning,
            // Calculate product of all the elements on the left side of the array.
            // Now calculate product of all the elements on the right side of the array,
            // Multiply them together, we get the final array.
            // As a space optimization, keep right side array product in a single variable.

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        if(nums.size() == 0)
            return {};
        
        vector<int> retVal(nums.size());
        int rp = 1;
        retVal[0] = rp;
        for(int i = 1 ; i < nums.size(); i++)
        {
            rp *= nums[i - 1];
            retVal[i] = rp;
        }
        
        rp = 1;
        for(int i = nums.size() - 2; i >= 0; i--)
        {
            rp *= nums[i+1];
            retVal[i] *= rp;
        }
        
        return retVal;
    }
};