// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//1. Edge case
//A. if matrix size() =0 or 1 just return the matrix

//2. Filling up the result
//A. Copy the element into the result
//B. Determine the row and element for the next copy based on the direction of the diagonal
//C. Check the inbound conditions of the row and the column calculated
//D. Update the direction

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
       //1.A
     if(matrix.size()==0){
         vector<int> result;
         return result;
    }
    if(matrix.size()==1){
         vector<int> result(matrix[0]);
         return result;
    }
    
    int matrix_rows = matrix.size(), next_row=0;
    int matrix_cols = matrix[0].size(), next_col=0;
    vector<int> result (matrix_rows*matrix_cols, 0);
        
    //1:right and 0: left -1: no side movement
    int horizontal_direction = 1;
    //1:up and 0: down -1: no up and down movement
    int vertical_direction = -1;
    int result_index = 0;
    
    int matrix_row_upper_bound = matrix_rows, matrix_row_lower_bound =0;
    int matrix_col_upper_bound = matrix_cols, matrix_col_lower_bound =0;
        
    //2.
    while(next_row<matrix_rows && next_col< matrix_cols && result_index<matrix_rows*matrix_cols){
        //2.A
        result[result_index] = matrix[next_row][next_col];
        result_index++;
        
        //2.B
        if(horizontal_direction!= -1){
            next_col = horizontal_direction==1? next_col+1 : next_col-1;
        }
        if(vertical_direction!= -1){
            next_row = vertical_direction==1? next_row-1 : next_row+1;
        }

        
        //2.C
        if(next_row == matrix_row_upper_bound || next_row< matrix_row_lower_bound || next_col<matrix_col_lower_bound || next_col == matrix_col_upper_bound){
            //Right
            if(horizontal_direction == 1){
               next_row = next_row+1;
               next_col = next_col-1;
               vertical_direction = 0; //down
               horizontal_direction = -1;
               matrix_row_lower_bound++;
            }
            //Left
            else if(horizontal_direction == 0){
               next_row = next_row-1;
               next_col = next_col+1;
               vertical_direction = 1; //up
               horizontal_direction = -1;
                matrix_row_upper_bound--;
            }
            //Up
            else if(vertical_direction ==1){
               next_row = next_row+1;
               next_col = next_col+1;
               vertical_direction = -1;
               horizontal_direction = 1; //right
                matrix_col_lower_bound++;
            }//Down
            else if(vertical_direction == 0){
               next_row = next_row-1;
               next_col = next_col-1;
               vertical_direction = -1;
               horizontal_direction = 0; //left
               matrix_col_upper_bound--;
            }
            
         }
        
         }
      return result;  
    }
};
