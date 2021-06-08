package Array1;
//Time Complexity : o(m*n) - m rows and n cols
//Space Complexity :o(1) = m rows and n cols 
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this :No

//Your code here along with comments explaining your approach
// use 4 pointers for all the boundaries and iterate through

import java.util.Arrays;
import java.util.LinkedList;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		LinkedList<Integer> result = spiralMatrix(matrix);
		
		System.out.println(result);
	}

	private static LinkedList spiralMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		
     	int m = matrix.length;
		int n = matrix[0].length;
		
		LinkedList<Integer> result = new LinkedList<>();
		
		
		int top = 0, bottom = m-1, left =0, right=n-1;
		
		while(top<=bottom && left<= right) {
			for(int i=left; i<=right; i++) {
				result.add(matrix[top][i]);
			}
			top++;
			if(top<=bottom && left<= right) {
				for(int i=top; i<=bottom; i++) {
					result.add(matrix[i][right]);
				}	
				right--;			
			}
			if(top<=bottom && left<= right) {
				for(int i=right; i>=left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;				
			}
			if(top<=bottom && left<= right) {
				for(int i=bottom; i>=top; i--) {
					result.add(matrix[i][left]);
				}		
				left++;				
			}

		}
		
		return result;
	}

}
