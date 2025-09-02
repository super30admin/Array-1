// Problem - Product of Array except self
//  Time Complexity : O(n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We imagine the array as suffix and prefix like elements to right of the
// element and elements to left
// 2. We first calculate the prefix and store in our result
// 3. For suffix, we take a variable suf and calculate on the go, and start
// saving the product in the result this gives us O(1) space

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  vector<int> productExceptSelf(vector<int> &nums) {
    int n = (int)nums.size();
    vector<int> res(n);
    res[0] = 1;

    for (int i = 1; i < n; i++) {
      res[i] = res[i - 1] * nums[i - 1];
    }

    int suf = 1;
    for (int j = n - 2; j >= 0; j--) {
      suf *= nums[j + 1];
      res[j] *= suf;
    }

    return res;
  }
};
