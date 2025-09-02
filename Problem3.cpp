// Problem - Spiral Order
//  Time Complexity : O(m*n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We first start traversing the matrix from top, then bottom, then go left
// and then up
// 2. Updating the variables and running loops accordingly
// 3. For the first two loops we don't check additionally since while loop
// checks it for us, but since we know have updated top and right, there might
// be case where top > bottom and left > right, so to prevent that we have these
// additional checks
#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
  vector<int> spiralOrder(vector<vector<int>> &matrix) {
    int m = (int)matrix.size();
    int n = (int)matrix[0].size();

    int top = 0;
    int bottom = m - 1;
    int left = 0;
    int right = n - 1;
    vector<int> res;

    while (left <= right && top <= bottom) {
      // going top
      for (int i = left; i <= right; i++) {
        res.push_back(matrix[top][i]);
      }
      top++;
      // going bottom
      for (int i = top; i <= bottom; i++) {
        res.push_back(matrix[i][right]);
      }
      right--;
      // going left
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          res.push_back(matrix[bottom][i]);
        }
      }
      bottom--;
      // going top
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          res.push_back(matrix[i][left]);
        }
      }
      left++;
    }

    return res;
  }
};
