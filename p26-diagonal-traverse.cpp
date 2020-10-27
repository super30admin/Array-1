// Time Complexity : O(m*n) - m = #rows and n = #columns
// Space Complexity: O(1) - The 'res' vector is returned. So, it won't be considered as extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach:
/*
    1. Using direction variable to maintain the direction of traversal of diagonal elements
    2. When we are traversing in a particular direction and reach an edge or corner of the matrix,
    we change the direction of the traversal, and also update row and column pointers accordingly.
*/

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        if(matrix.size() == 0) return res;
        
        int i = 0, j = 0;
        int rows = matrix.size();
        int columns = matrix[0].size();
        int direction = 1;
        
        while(res.size() != rows*columns) {
            res.push_back(matrix[i][j]);
            
            // upward direction
            if(direction == 1) {
                //order of the conditions 'j == columns-1' and 'i == 0' matters
                if(j == columns-1) {
                    direction = -1;
                    i++;
                }
                else if(i == 0) {
                    direction = -1;
                    j++;
                }
                else {
                    i--;
                    j++;
                }
            }
            else if(direction == -1) { // downward direction
                //order of the conditions 'i == rows-1' and 'j == 0' matters
                if(i == rows-1) {
                    direction = 1;
                    j++;
                }
                else if(j == 0) {
                    direction = 1;
                    i++;
                }
                else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
};
