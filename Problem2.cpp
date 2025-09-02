// Problem - Find diagonal order
//  Time Complexity : O(m*n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We start in dir up and then check our top boundaries which is top wall,
// right wall or safe
// 2. Similarly we check for dir down, if we hit the wall conditions, we flip
// the direction
// 3. In the end, we return the result
#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
  vector<int> findDiagonalOrder(vector<vector<int>> &mat) {
    int m = (int)mat.size();
    int n = (int)mat[0].size();
    int row = 0;
    int col = 0;
    bool dir = true;
    vector<int> res;
    for (int i = 0; i < m * n; i++) {
      res.push_back(mat[row][col]);
      if (dir) {
        if (col ==
            n - 1) { // need to be check first to prevent edge case top right
          dir = !dir;
          row++;
        } else if (row == 0) {
          dir = !dir;
          col++;
        } else {
          row--;
          col++;
        }
      } else {
        if (row ==
            m - 1) { // need to be check first to prevent edge case bottom left
          dir = !dir;
          col++;
        } else if (col == 0) {
          dir = !dir;
          row++;
        } else {
          row++;
          col--;
        }
      }
    }
    return res;
  }
};
