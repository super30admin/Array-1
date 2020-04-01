// Time Complexity : O(NxM) N=number of rows. M number of columns. 
// Space Complexity : O(1) return response not additional data structure.  Considering that the result is not taken into consideration for Space complexity
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Using the pattern of going up or not up,Checking the border cases row==0, row=M.length; M==0; M=M.length-1.
//Runtime: 3 ms, faster than 52.97% of Java online submissions for Diagonal Traverse.
//Memory Usage: 41.9 MB, less than 43.75% of Java online submissions for Diagonal Traverse.

     public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix==null|| matrix.length==0)
            return new int[0];
        int[] result=new int[matrix.length*matrix[0].length];
        int column=0;
        int row=0;
        int indexResult=0;
        result[indexResult++]=matrix[0][0];
        boolean canMove=false;
        boolean goingUp=true;
        while (!isLastCell(row,column,matrix)){
            canMove=canMove(column,row,matrix.length,matrix[0].length,goingUp);
            if (!canMove){
                if (goingUp&&column==matrix[0].length-1){
                    row++;
                    result[indexResult++]=matrix[row][column];
                }else if (goingUp&&column>=0){
                    column++;
                    result[indexResult++]=matrix[row][column];
                } else if (!goingUp&&row==matrix.length-1){
                    column++;
                    result[indexResult++]=matrix[row][column];
                }else{
                    row++;
                    result[indexResult++]=matrix[row][column];
                }
                goingUp=!goingUp;
            } else {
                if (goingUp){
                    row--;
                    column++;
                }else {
                    row++;
                    column--;
                }
                result[indexResult++]=matrix[row][column];
            }
        }
        return result;
    }

    private boolean canMove(int column, int row,int maxRow,int maxColumn, boolean goingUp) {
        if (goingUp && (row-1>=0) && (column+1<=maxColumn-1)){
            return true;
        }
        if (!goingUp && (row+1<=maxRow-1) && (column-1>=0)){
            return true;
        }
        return false;
    }

    private boolean isLastCell(int row, int column,int[][] matrix) {
        return row==matrix.length-1 && column==matrix[0].length-1;
    }