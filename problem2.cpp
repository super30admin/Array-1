// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Start traversion from element at (0,0)
// Collect the element at each step and put it in the answer vector
// If we hit the boundary of the matrix (top most row, bottom most col, upper right element, bottom left element) change the direction

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        vector<int> ans(m*n);
        bool dir = true; // up
        int r=0;
        int c=0;
        for(int i=0; i<m*n; i++) {
            // collect the element
            ans[i] = (mat[r][c]);
            if(dir) { // up
                if(r == 0 && c != n-1) {
                    c++;
                    dir = false; // flip direction when we hit boundary
                } else if(c == n-1) {
                    r++;
                    dir = false; // flip direction when we hit boundary
                } else {
                    r--;
                    c++;
                }
            } else { // down
                if(c == 0 && r != m-1) {
                    r++;
                    dir = true; // flip direction when we hit boundary
                } else if(r == m-1) {
                    c++;
                    dir = true; // flip direction when we hit boundary
                } else {
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }
};