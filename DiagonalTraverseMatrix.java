// Time Complexity :O(m*n)
// Space Complexity :O(1)
public class DiagonalTraverseMatrix {
	 public int[] findDiagonalOrder(int[][] matrix) {
	        //null
	        if(matrix == null || matrix.length == 0) return new int[0];
	        int m = matrix.length; 
	        int n = matrix[0].length;
	        int [] result = new int [m*n];
	        int r = 0; 
	        int c = 0; 
	        int dir = 1;
	        int i = 0 ; // index on resultant array
	        while (i< m * n){
	            result[i] = matrix[r][c];
	            if(dir == 1){
	                if(c == n - 1){
	                    r++; dir = -1;
	                }else if (r == 0){
	                    c++; dir = -1;
	                }else{
	                    r--; c++;
	                }
	            } else {
	                if (r == m-1){
	                    c++; dir = 1;
	                } else if (c == 0){
	                    r++; dir = -1;
	                }else {
	                    c--; r++;
	                }
	            }
	            i++;
	        }
	    return result;
	    }
}
