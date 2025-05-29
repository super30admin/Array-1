// Time Complexity: O(n) — We make two passes through the array.
// Space Complexity: O(1) (excluding output) — We use the output array for prefix products and a variable for suffix products without extra arrays.

// Approach in 3 lines:
// Build prefix products from left to right storing them in the output array.
// Traverse from right to left multiplying suffix products on the fly with the prefix products.
// The output array then contains the product of all elements except self at each index.

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans(nums.size());
        ans[0]=1;
        for(int i=1;i<nums.size();++i){
            ans[i] = ans[i-1]*nums[i-1];
        }
        int rp = 1;
        ans[nums.size()-1] = rp * ans[nums.size()-1];
        for(int i= nums.size()-2 ;i >=0; i--){
            rp *= nums[i+1];
            ans[i] = ans[i] * rp;
        }

        return ans; 
    }
};
