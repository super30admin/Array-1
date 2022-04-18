//Time Complexity : O(nm)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         //base case
        if(mat==null||mat.length==0)
            return new int[]{};
        //dimensions of the matrix
        int rows=mat.length;
        int cols=mat[0].length;
        //result of the flattened array
        int[] output=new int[rows*cols];
        int index=0;
        int row=0,col=0, dir=1;
        //iterate when index<rows*cols
        while(index<rows*cols){
            output[index]=mat[row][col];
            index++;
            //checking the direction, if it 1 then going upward
            if(dir==1){
                //checking if the col is last, direction is reversed
                if(col==rows-1){
                    dir=-1;
                    row++;
                }
                //when reversing the direction
                else if(row==0){
                    dir=-1;
                    col++;
                }
                else{
                    //when going upwards
                    row--;
                    col++;
                }
            }
            //if dir is 1
            else{
                //we reserve the direction when, checking last row
                if(row==cols-1){
                    dir=1;
                    col++;
                }
                //changing the direction
                else if(col==0){
                    dir=1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }
                
            }
        } 
        return output;
    }
}