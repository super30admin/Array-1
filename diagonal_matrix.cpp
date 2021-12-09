//Time complexity : O(rows * columns)
//Space complexity : O(1)
//Leetcode : Yes
//Approach:
            // Consider the direction of the traversal.
            // Handle edge cases while traversing
            // Manage indices accordingly

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        if(mat.size() == 0 || mat[0].size() == 0)
        {
            return {};
        }
        
        vector<int> result_array(mat.size() * mat[0].size());
        int m = mat.size();
        int n = mat[0].size();
        int dir = 1;
        int index = 0, i = 0, j = 0;
        
        while(index < m * n)
        {
            result_array[index] = mat[i][j];
            index++;
            
            //Up direction
            if(dir == 1)
            {
                if(j == n - 1)
                {
                    dir = -1;
                    i++;
                    
                }
                else if(i == 0)
                {
                    dir = -1;
                    j++;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else // Down direction
            {
                if(i == m -1)
                {
                    dir = 1;
                    j++;
                }
                else if(j == 0)
                {
                    dir = 1;
                    i++;
                }
                else
                {
                    j--;
                    i++;   
                }
            }
        }
        return result_array;
    }
};