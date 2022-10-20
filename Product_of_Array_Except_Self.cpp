/*
Time Complexity: O(n)
Space Complexity: O(n)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);
        int prefixM = 1;
        int suffixM = 1;
        for(int i = 0;i < n; i++){
            ans[i] = prefixM;
            prefixM *= nums[i];
        }
        for(int i = n-1; i >= 0; i--){
            ans[i] *= suffixM;
            suffixM *= nums[i]; 
        }
        return ans;
    }
};