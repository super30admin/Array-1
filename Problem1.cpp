// Time Complexity : O(N) #of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 


// Your code here along with comments explaining your approach:
// 1. Find running product for left side of element. 
// 2. In same array traverse backwards and take a temp variable.
// 3. Multiply temp with current element and update temp with curr.

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans;
        ans.push_back(1);
        for(int i=1;i<nums.size();i++){
            //cout<<ans[i-1]<<' ';
            ans.push_back( (ans[i-1])*(nums[i-1]) );
            cout<<ans[i]<<' ';
        }
        int r=1;
        for(int i=nums.size()-1;i>=0;i--){
            ans[i]=ans[i]*r;
            r=nums[i]*r;
        }
        return ans;
    }
};