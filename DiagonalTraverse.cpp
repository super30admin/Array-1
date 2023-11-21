//Time Complexity:O(mxn)
//Space Complexity: O(1)

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {

        int m = mat.size();
        int n = mat[0].size();

        vector<int> result(m*n);

        int row = 0, col = 0 ;
        bool dir = true;

        for(int i = 0; i<m*n;i++)
        {
            result[i] = mat[row][col];
            if(dir)
            {
                if(col == n-1)
                {
                    row++;
                    dir = false;
                } else if(row == 0)
                {
                    col++;
                    dir = false;
                }
                else
                {
                    row--;
                    col++;
                }                
            }
            else
            {
                if(row == m-1)
                {
                    col++;
                    dir = true;
                } else if(col == 0)
                {
                    row++;
                    dir = true;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }
        
        return result;
    }
};