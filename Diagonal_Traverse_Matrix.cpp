// Time Complexity : O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
         int n = matrix.size();
        
        // return null if the input matrix is null
        if (n ==0){
            vector<int> result;
            return result;
        }
        int m = matrix[0].size();
      

        //initializing the variables
        int direction = 1;
        int iteration = 0;  
        int row = 0;
        int column = 0;
         vector<int> result(m*n, 0);
        // return null if the first row is null
        
    if (m ==0){
        return result;
    }
        
        while (iteration < (m)*(n)){
           
            result[iteration] = matrix[row][column]; // appending the value to the result array
            iteration +=1; // counter
           
            // code for moving up wards i.e. directio is 1
            if ( direction == 1){
               if ( column == m-1){
                   direction = -1;
                  row +=1;
               } 
                else if (row == 0) {
                    direction = -1;
                    column +=1;
                }
                else {
                    row -=1;
                    column +=1;
                }
            } else {
                
         // code for moving downwards i.e direction = -1
               if ( row == n-1){
                   direction = 1;
                  column +=1;
               } 
                else if (column == 0) {
                    direction = 1;
                    row +=1;
                }
                else {
                    row +=1;
                    column -=1;
                }
            }
            
            
            
            
            
        }
        
      return result;  
        
    }
};