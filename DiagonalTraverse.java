class DiagonalTraverse {

    // Time Complexity : 0(m*n) m is the column length of the matrix and n is the row length of the matrix
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: I divided the traversal into 2 parts, 1 is in upward direction traversal
    //the other is downward direction traversal representing by 1 and -1. Then I check if in the upward direction, if the elem.
    //is the last element in the last column or if the row is 0 because the direction changes from there. Same for the downward
    //direction. And perform operations accordingly keeping their trajectories and edge cases in mind.

// Your code here along with comments explaining your approach

    public int[] findDiagonalOrder(int[][] mat) {
        int rowlength = mat.length;
        int columnlength = mat[0].length;
        int row = 0;
        int column = 0;
        int index = 0;
        int dir = 1;
        int [] result = new int[rowlength*columnlength];
        while(index < rowlength * columnlength){
            result[index] = mat[row][column];
            index++;
            if(dir == 1){
                if(column == columnlength-1){
                    dir = -1;
                    row++;
                }
                else if(row == 0 ){
                    dir = -1;
                    column ++;
                }
                else{
                    row--;
                    column++;
                }
            }
            else{
                if(row == rowlength-1){
                    dir = 1;
                    column++;
                }
                else if(column==0){
                    dir = 1;
                    row ++;
                }
                else{
                    row++;
                    column--;
                }
            }
        }
        return result;
    }
}