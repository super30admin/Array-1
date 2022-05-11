// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> nums2(n,1);
        vector<int> nums3(n,1);
        vector<int> ans(n,1);
        nums2[0] = nums[0];
        
        for(int i=1;i<n;i++) {
            nums2[i] = nums[i] * nums2[i-1];
        }
        nums3[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            nums3[i] = nums[i] * nums3[i+1];
        }
        ans[0] = nums3[1];
        ans[n-1] = nums2[n-2];
        for(int i=1;i<=n-2;i++) {
            ans[i] = nums2[i-1] * nums3[i+1];
        }
        return ans;
    }
};