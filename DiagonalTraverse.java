package Array1;
//Time Complexity : o(m*n) - m rows and n cols
//Space Complexity :o(1) 
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this :No

//Your code here along with comments explaining your approach
//starting with upward direction check boundary conditions for row and col and change direction accordingly


import java.util.Arrays;

public class DiagonalTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {1,2,3} , {4,5,6} , {7,8,9} };
		
		int [] result = diagonalTraverse(matrix);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] diagonalTraverse(int[][] matrix) {
		// TODO Auto-generated method stub
		int m = matrix.length; 
		int n = matrix[0].length;
		int[] result = new int[m*n];
		
		int dir = 1;
		int i = 0; 
		int r = 0;
		int c = 0;
		
		while(i < m*n) {
			result[i] = matrix[r][c];
			if(dir == 1) {
				if(c == n-1) {
					dir = -1;
					r++;
				}
				else if(r == 0) {
					c++;
					dir = -1;
				}
				else {
					r--;
					c++;
				}				
			}
			else if(dir == -1) {
				if(r == m-1) {
					dir = 1;
					c++;
				}
				else if(c == 0) {
					r++;
					dir = 1;
				}
				else {
					r++;
					c--;
				}				
			}
		i++;	
		}

		return result;
	}

}
