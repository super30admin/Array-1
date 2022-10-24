// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 

class Solution {
    int DOWN = 0, UP = 1;
    
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> ret;
        int m = mat.size();
        int n = mat[0].size();
        int dir = UP;
        int row = 0, col = 0;
        
        while(ret.size() != m*n) {
            ret.push_back(mat[row][col]);
            if (dir == UP) {
                //handle when direction is upwards
                if (col == n-1) {
                    dir = DOWN;
                    row++;
                } else if (row == 0) {
                    dir = DOWN;
                    ++col;
                } else {
                    --row; ++col;
                }
            } else {
                //handle if direction is downwards
                if (row == m-1) {
                    dir = UP;
                    ++col;
                } else if (col == 0) {
                    dir = UP;
                    ++row;
                } else {
                    --col; ++row;
                }
            }
        }
        
        return ret;
    }
};
