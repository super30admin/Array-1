//Time complexity : O(rows * columns)
//Space complexity : O(1)
//Leetcode : Yes
//Approach
            // Keep track of boundaries at each iteration
            // First go right, update the boundary,
            // Then go down, update the boundary,
            // Then go left, update the boundary,
            // Then go up, update the boundary

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int rowmin = 0;
        int rowmax = matrix.size() - 1;
        int colmin = 0;
        int colmax = matrix[0].size() - 1;
        vector<int> temp;
        while((rowmin <= rowmax) && (colmax >= colmin))
        {
            
            //Go right // Column is changing keep the row constant
            for(int j = colmin; j <= colmax; j++)
            {
                temp.push_back(matrix[rowmin][j]);
            }
            rowmin++;
            
            //Go down // At the end of columns
            for(int i = rowmin; i <= rowmax; i++)
            {
                temp.push_back(matrix[i][colmax]);
            }
            colmax--;
            
            //Check for edge case
            if(rowmax >= rowmin)
            {
                //Go backwards // At the end of rows
                for(int j = colmax; j >= colmin ; j--)
                {
                    temp.push_back(matrix[rowmax][j]);
                }
                rowmax--;
            }
            
            //Check for edge case
            if(colmax >= colmin)
            {
                //Go upwards // Last iteration
                for(int i = rowmax; i >= rowmin; i--)
                {
                    temp.push_back(matrix[i][colmin]);
                }
                colmin++;
            }
        }

        return temp;
    }
};