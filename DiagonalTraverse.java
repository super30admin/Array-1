// Time Complexity : o(n*m)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
public class DiagonalTraverse {
	
public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0) return new int [0];
        int m = matrix.length, n= matrix[0].length;
        int [] result = new int [m*n];
        int i = 0,j =0, idx=0, dir = 1;
        
        // run till m*n length
        while(idx < result.length) {
            result[idx] = matrix[i][j];
            //up direction
            if(dir == 1) {
            	//edge case - first check n-1
                if(j == n-1) {
                    i++; dir = -1;
                } else if(i == 0) {
                    j++; dir = -1;
                } else {
                    i--; j++;
                }
            }
            //down direction
            else {
            	//mirror
                if(i == m-1) {
                    j++; dir = 1;
                } else if (j == 0) {
                    i++; dir = 1;
                } else {
                    i++; j--;
                }
            }
            idx++;      
        }
        return result;
    }

}
