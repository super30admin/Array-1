//TC =O(n^2)
//SC = O(1)

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        int i = 0, j = 0; int cols = 0; 
        vector<int> res;
        
        int rows = matrix.size(); 
        if(matrix.size())
            cols = matrix[0].size();
        else return res;
        
        int uc = rows % 2 ? rows/2 + 1 : rows/2; 
        
        while(i < uc){
            j = i;
            while(j < cols - i){             // 1. horizonal, left to right( first to last column)
               res.push_back(matrix[i][j++]);
            }
            
            j = i + 1;                                  // 2. vertical, top + 1 to bottom
            while(j < rows - i && i <= cols - 1 - i){// Single column multiple row case, avoid negative column number  
                res.push_back(matrix[j++][cols - 1 - i]);
            } 
           
            j = cols - 2 - i;                      // 3. horizonal, right to left  
            while(j > i && i < rows - 1 - i){ //Also check for the case where the last row is being processed twice(Avoid repetion)
                res.push_back(matrix[rows - 1 - i][j--]);
            }
            
            j = rows - 1 - i;                    // 4. vertical, bottom to  top
            while(j > i && i < cols - 1 - i){ //Also check for the case where the last column is begin processed twice(Avoid repetion)
                res.push_back(matrix[j--][i]);
            }
            i++;
        }   
        return res;
    }
    };
