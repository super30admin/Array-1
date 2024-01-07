// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Considering the running product from front and back 
// storing them in ans vector

#include<bits/stdc++.h>
using namespace std;

class Solution
{
public:
    vector<int> productExceptSelf(vector<int> &nums)
    {
        int n = nums.size();
        vector<int> ans;
        int rp = 1;
        ans.push_back(1);
        for (int i = 1; i < n; i++)
        {
            rp = rp * nums[i - 1];
            ans.push_back(rp);
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--)
        {
            rp = rp * nums[i + 1];
            ans[i] *= rp;
        }
        return ans;
    }
};