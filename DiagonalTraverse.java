package s30Coding;

//Time Complexity :- O(m*n) where m - rows and n = columns

//Space Complexity :- O(1) - No extra space except the aulixary space

//LeetCode :- Yes

public class DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] matrix) {
	      if(matrix == null || matrix.length == 0) return new int[0];
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int i = 0;
	        
	        int d = 1; int r = 0; int c = 0;
	        int[] result = new int[m*n];
	        
	        while(i < m*n){
	            result[i] = matrix[r][c];
	            if(d == 1){
	                if(c == n-1){
	                    r++;
	                    d = -1;
	                }
	                else if(r == 0){
	                    c++;
	                    d = -1;
	                }
	                else{
	                    r--;
	                    c++;
	                }
	            }
	            else{
	                if(r == m-1){
	                    c++;
	                    d = 1;
	                }
	                else if(c == 0){
	                    r++;
	                    d = 1;
	                }
	                else{
	                    r++;
	                    c--;
	                }
	            }
	            i++;
	        }
	        
	        return result;
	    }
}
