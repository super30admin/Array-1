// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// loop through the vector, build prefix products and suffix products, combine them.

#include <vector>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = (int)nums.size();
        vector<int> out(n, 1);

        for (int i = 1; i < n; ++i) {
            out[i] = out[i - 1] * nums[i - 1];
        }

   
        int suffix = 1;
        for (int i = n - 1; i >= 0; --i) {
            out[i] = out[i] * suffix; 
            suffix *= nums[i];
        }
        return out;
    }
};