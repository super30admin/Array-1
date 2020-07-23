// Time Complexity : O(N) where N=Number of anagrams each having length K
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> res;
        int temp =1 ,prod = 1;
        if(nums.size()==0)
        {
            return res;
        }
        for(int i=0;i<nums.size();i++)
        {
            prod = prod*temp;
            temp = nums[i];
            res.push_back(prod);
        }

        temp = 1;
        prod = 1;

        for(int i=nums.size()-1;i>=0;i--)
        {
            prod = prod * temp;
            temp = nums[i];
            res[i] = res[i]* prod;
        }
        return res;
    }
};
