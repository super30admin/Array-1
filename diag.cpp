//TC: O(m*n) where m is number of rows and n is number of columns
//SC: O(1) 

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        
        vector<int> result;
            
        if(matrix.size() == 0) return result;
        int dir = 1; //1=up, -1=down
        int r = 0; 
        int c = 0;
        int m = matrix.size(); //num_rows
        int n = matrix[0].size(); //num_cols
                
        while(result.size()<m*n){
            result.push_back(matrix[r][c]);
            if(dir == 1){
                //check if column goes out of bounds
                //if column is last, then increment row, change direction
                if(c == n-1){
                    r = r+1;
                    dir = -1;
                }
                else if(r==0){
                    c++;
                    dir = -1;
                }
                else {
                     r--;
                     c++;
                }
            }
            
            else {
                //if row is last, increment column, change direction
                if(r == m-1){
                    c = c+1;
                    dir = 1;
                }
                else if(c==0){
                    r++;
                    dir = 1;
                }
                else {
                     c--;
                     r++;
                }                
            }       
        }
    
    return result;
        
        
    }
};