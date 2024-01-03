//Time complexity = m*n
//Space Complexity = O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english:
//This code generates a vector with elements from a given matrix in a diagonal order.
// It uses two pointers, i and j, to traverse the matrix in an upward or downward direction. 
//The direction flag "dir" is toggled based on boundary conditions, ensuring the diagonal movement. The result vector is populated with matrix elements in the specified diagonal order, and the final vector is returned.
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        
        int m = mat.size();
        int n = mat[0].size();
        int i = 0, j = 0;

        bool dir = true; // up
        vector<int> result(m * n, 0);

        for (int idx = 0; idx < result.size(); idx++) {
            result[idx] = mat[i][j];

            if (dir) {
                if (i == 0 && j != n - 1) {
                    j++;
                    dir = false;
                } else if (j == n - 1) {
                    i++;
                    dir = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != m - 1) {
                    i++;
                    dir = true;
                } else if (i == m - 1) {
                    j++;
                    dir = true;
                } else {
                    j--;
                    i++;
                }
            }
        }
        return result;
        
    }
};