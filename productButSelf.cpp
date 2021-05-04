// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans;
        ans.push_back(1);
        int rP = 1;
        for(int i=1; i<nums.size();i++){
            rP *= nums[i-1];
            ans.push_back(rP);
        }
        rP = 1;
        for(int i = nums.size()-2;i>=0;i--){
            rP*=nums[i+1];
            ans[i] *=rP;
        }
        return ans;
    }
};