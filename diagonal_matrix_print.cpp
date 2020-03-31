// Time Complexity : O(mn)
// Space Complexity : O(1_
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : direction shifting was a bit tricky


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
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
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
        
        //1:up and 0: down
        int diagonal_direction = 1;
        int result_index = 0;
        //2.
        while(next_row<matrix_rows && next_col< matrix_cols && result_index<=matrix_rows*matrix_cols){
            //2.A
            result[result_index] = matrix[next_row][next_col];
            result_index++;
            
            //2.B
            next_row = diagonal_direction? next_row-1 : next_row+1; //up:down
            next_col = diagonal_direction? next_col+1 : next_col-1;
            
            //2.C
            if(next_row == matrix_rows || next_row< 0 || next_col<0 || next_col == matrix_cols){
                //Up
                if(diagonal_direction ==1){
                    //Column will be out of bounds only for the last element where we change the row
                    if(next_col == matrix_cols){
                        next_col = next_col-1;
                        next_row = next_row+2;
                    }
                    else if(next_col < matrix_cols ){
                        next_row = next_row+1;
                    }
                    
                }//Down
                if(diagonal_direction ==0){
                    //Column will be out of bounds only for the last element where we change the row
                    if(next_row == matrix_rows){
                        next_col = next_col+2;
                        next_row = next_row-1;
                    }
                    else if(next_row < matrix_rows ){
                        next_col = next_col+1;
                    }
                }
                //2.D
                diagonal_direction = diagonal_direction? 0:1;
            }
            
        }
        return result;
    }
};
