// Space Complexity: O(1)
// Time Complexity: O(m*n)

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        // 0 -> downwards
        // 1 -> upwards
        vector<int> result;
        int direction = 1; 
        int nrows = mat.size(); 
        int ncols = mat[0].size(); 
        int i = 0; 
        int j = 0; 

        while(i < nrows && j < ncols) {
            result.push_back(mat[i][j]);
            if(direction == 1) {
                if( j == ncols-1) {
                    i = i + 1; 
                    direction = 0;  
                }
                else if(i == 0) {
                    j = j + 1; 
                    direction = 0; 
                } else {
                    i--;
                    j++; 
                }
            }   
            else {
                if(i == nrows-1) {
                    j = j + 1; 
                    direction = 1; 
                } else if(j == 0) {
                    i = i + 1; 
                    direction = 1; 
                } else {
                    i++; 
                    j--; 
                }
            } 
        }

        return result;                           
    }
};