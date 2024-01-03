// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Idea is we traverse the matrix diagonally with boundary conditions. We use a flag to determine if we are 
// going up/down. If we are in top most row but not right most column then we update column index and change direction.
// If we are in left most column but not last row, we change the direction and update row index. 
// Similarly when we reach right most column we update the row index and change direction. When we reach bottom row we update 
// column index and change direction.


// Your code here along with comments explaining your approach

#include <vector>
class Solution {
public:
    std::vector<int> findDiagonalOrder(std::vector<std::vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();

        int i = 0;
        int j = 0;

        std::vector<int> result(m*n, 0);

        bool dir = true;  // for up direction.

        for(int idx = 0; idx < result.size(); idx++)
        {
            result[idx] = mat[i][j];
            if(dir) //up
            {
                // top most row
                if((i == 0) & (j != n-1))
                {
                    j++;
                    dir = false;
                }
                else if(j == n-1) // right most column
                {
                    i++;
                    dir = false;
                }
                else // other cases
                {
                    i--;
                    j++;
                }
            }
            else //down
            {
                // left most column
                if((j == 0) && (i != m-1))
                {
                    i++;
                    dir = true;
                }
                // bottom row
                else if(i == m-1 )
                {
                    j++;
                    dir = true;
                }
                else // other cases 
                {
                    i++;
                    j--;
                }
            }
        } 
        return result;
    }
};