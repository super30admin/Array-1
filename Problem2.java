//LeetCode Problem 498
//Time Complexity: O(m*n)
//Space Complexity: O(1), no extra space utilized, problem itself requires an array output.
//Code run successfully on LeetCode.


public class Problem2 {
   	public int[] findDiagonalOrder(int[][] mat) {
        
		if(mat == null || mat.length == 0)
			return new int[] {};
		
		int m = mat.length;
		int n = mat[0].length;
		
		int[] result = new int[m*n];
		int i =0;
		int r =0, c= 0;
		int dir =1;
		
		
		while(i < m*n) {
			
			result[i] = mat[r][c];
			
			if(dir == 1) {
				
				if(c == n-1) {
					r++;
					dir = -1;
				}
				else if(r == 0) {
					c++;
					dir = -1;
				}
				
				else {
					r--;
					c++;
				}
				i++;
		    }
			
			else if(dir == -1) {
				
				if(r == m-1) {
					c++;
					dir = 1;	
				}
             
				else if(c == 0) {
					r++;
					dir = 1;
				}
				
				else {
					r++;
					c--;
				}
				i++;
			}
		}
		return result;
    }

}
