// Time Complexity                              :  O(N*M), N is the row size and M is column size of the given matrix
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int n = mat.size();
        int m = mat[0].size();
        
            int dir = 1;
            vector<int> ans(n*m);
            int index = 0;
            int r = 0, c = 0;
        
            while(index < m*n) {
                
                ans[index++] = mat[r][c];
                
                if(dir == 1) {            // moving in upward diagonal direction
                    if(c == n-1) {        // after hitting the last column, the row increases by 1 and direction reverses
                        r++;
                        dir = -1;
                    } else if (c == 0) {  // after hitting column 0, the column increases and direction reduces.
                        c++;
                        dir = -1;
                    } else {              // in normal case, we keep moving up and right
                        r--;
                        c++;
                    }
                } else {                    // moving in downward diagonal direction
                    if(r == m-1) {          // after hitting the last row, the column increases by 1 and direction reverses.
                        c++;
                        dir = 1;
                    } else if (r == 0) {   // after hitting the last row, row increases and direction reverses
                        r++;
                        dir = 1;
                    } else {               // in normal case, we keep moving down and left.
                        r++;
                        c--;
                    }
                }
           
            }
        
        return ans;
        
    }
};