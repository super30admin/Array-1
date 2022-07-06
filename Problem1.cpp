Problem1 - https://leetcode.com/problems/product-of-array-except-self/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> left(n);
        left[0] = 1;
        int rp = 1;
        for(int i=1;i<n;i++){
            rp = nums[i-1] * rp;
            left[i] = rp;
        }
        rp = 1;
        for(int i=n-2;i>=0;i--){
            rp = nums[i+1] * rp;
            left[i] = left[i] * rp;
        }
        return left;
    }
};
