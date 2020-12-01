//Time complexity - O(n)
//Space complexity - O(1)

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size(), prod = nums[0];
        vector<int> ans(n,1); 
        
        for(int i=1;i<n;i++){
            ans[i] = prod;
            prod = prod*nums[i];
        }
        
        
        prod = 1;
        for(int i=n-2;i>=0;i--){
            prod = prod * nums[i+1];
            ans[i] = ans[i]*prod;
        }
        return ans;
    }
};