//Time Complexity : O(n);
//Space Complexity : O(1)

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        
        int n = nums.size();
        vector<int> ans(nums.size());
        int rp = 1;
        ans[0] = 1;
        for(int i=1;i<n;i++){
            rp = rp*nums[i-1];  
            ans[i] = rp;
        }
        rp=1; 
        for(int i=n-2;i>=0;i--){
            rp = rp*nums[i+1];
            ans[i] = ans[i]*rp;
        }
        return ans;    
    }
};