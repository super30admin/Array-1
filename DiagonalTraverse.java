// Time Complexity : O(rowscount*columnscount) - Since we are iterating over whole matrix
// Space Complexity : O(1) - No auxiliary space used
// Did this code successfully run on Leetcode : Yes
 // when going upwards, we have direction as 1 and the general step is to reduce the row by 1 and increase the column by 1.
 // There will be 2 edge cases ; last column->row is increased by 1 and if its first row->column is increased by 1.\
 // and change the direction to downwards.

  // when going downwards, we have direction as -1 and the general step is to reduce the column by 1 and increase the row by 1.
 // There will be 2 edge cases ; last row->column is increased by 1 and if its first column->row is increased by 1.
// and change the direction by upwards.

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int total_col = mat[0].length;
        int total_row = mat.length;
       
        if(mat.length==0) return new int[]{};
        int result[]= new int[total_col*total_row];
        int current_row=0;
        int current_col=0;
        int direction =1;
        int i = 0;
        while(i<total_row*total_col){
            result[i]=mat[current_row][current_col];
            System.out.println(result[i]);
            if(direction==1){
              
                if(current_col==total_col-1){ //last column->row is increased by 1
                    current_row++;
                    direction=-1;
                }
                  else if(current_row==0){   //first row->column is increased by 1.
                    current_col++;
                    direction=-1;
                }
                else{
                    current_row--;
                    current_col++;
                }
            }
               else if(direction==-1){
              
                if(current_row==total_row-1){ //last row->column is increased by 1
                    current_col++;
                    direction=1;//change the direction
                }
                else if(current_col==0){  //if its first column->row is increased by 1.
                   current_row++;
                    direction=1;
                }
                else{
                    current_row++;
                    current_col--;
                }
            }
            i++;
        }
        return result;
        
        
    }
}