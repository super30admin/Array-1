// Time Complexity : O(rows*cols)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Checked for the boundaries and changed the direction while printing the elements of the matrix

public class DiagonalPrintMatrix {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[rows*cols];

        int i=0; int j=0;
        int index =0; String direction = "up";

        while(index < rows*cols){
            result[index] = matrix[i][j];
            if(direction == "up"){
                if(j == cols-1){
                    i++;
                    direction = "down";
                }else if(i == 0){
                    j++;
                    direction = "down";
                }else{
                    i--; j++;
                }
            }else if(direction == "down"){
                if(i == rows-1){
                    j++;
                    direction = "up";
                }else if(j == 0){
                    i++;
                    direction = "up";
                }else{
                    i++; j--;
                }
            }
            index++;
        }//end of while

        return result;
    }
}
