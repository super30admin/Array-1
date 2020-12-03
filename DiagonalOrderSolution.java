// Time Complexity : O(M*N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// COnsider upward direction and see how i and j changes, similarly do it for dir=-1

class DiagonalOrderSolution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int dir = 1;//upward
        int[] result = new int[rows*cols];
        int i=0, j=0, index=0;
        while(index < rows * cols) {
            result[index] = matrix[i][j];
            if(dir==1) {
                if(j==(cols-1)) {
                    dir = -1;
                    i++;
                } else if(i==0) {
                    dir=-1;
                    j++;
                } else{
                    i--;
                    j++;
                }
                    
            } else {
                if(i==(rows-1)) {
                    dir = 1;
                    j++;
                } else if(j==0) {
                    dir = 1;
                    i++;
                } else{
                    j--;
                    i++;
                }
            }
            index++;
            
        }
        return result;
    }
}