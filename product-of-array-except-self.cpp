// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <iostream>
#include <vector>
using namespace std;

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        // Edge case
        if (nums.empty())
            return {};

        int n = nums.size();
        vector<int> result(n, 1);

        int rp = 1;
        int temp = 1;

        // Left pass
        for (int i = 0; i < n; i++) {
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }

        rp = 1;
        temp = 1;

        // Right pass
        for (int i = n - 1; i >= 0; i--) {
            rp = rp * temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }

        return result;
    }
};