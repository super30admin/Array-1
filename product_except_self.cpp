// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Idea is to calculate running product from left and then multiply the running product 
// from right to the left running product.

// Your code here along with comments explaining your approach

#include <vector>

class Solution {
public:
    std::vector<int> productExceptSelf(std::vector<int>& nums) {
        int rp = 1;
        int n = nums.size();
        std::vector<int> result(n, 0);
        result[0] = 1;

        // Running product from left
        for(int i = 1; i<n; i++)
        {
            rp *= nums[i-1];
            result[i] = rp;
        }

        // reset starting elemt for right running product
        rp=1;
        
        // Running product from right
        for(int i = n-2; i >=0; i--)
        {
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;

    }
};
