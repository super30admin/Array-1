// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* Maintain variable to store direction. Print the elements upwards if direction is true otherwise downwards. 
 * Update direction variables after reaching edge of the matrix.
 */

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> result;
        bool dir = true;
        int i, j;
        i = j = 0;
        int n = mat.size();
        int m = mat[0].size();
        
        for (int index = 0; index < m*n; index++)
        {
            result.push_back(mat[i][j]);
            
            if (dir)
            {
                if (j == m - 1)
                {
                    dir = false;
                    i++;
                }
                else if(i == 0)
                {
                    j++;
                    dir = false;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                if (i == n-1)
                {
                    dir = true;
                    j++;
                }
                else if(j == 0)
                {
                    dir = true;
                    i++;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
};