// Time Complexity : O(MN), M-> number of row, M-> number of columns  (Traversing all the elements in array)
// Space Complexity : O(1), No additional space used 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Base case-checking whether the input matrix is empty or not. We maintain four variables to keep track of the valid indices. A while loop to check the boundary violation. Traveling from top to bottom and decrement right, traveling from top to bottom and decrement right, traveling from right to left and decrement bottom, traveling from bottom to top and increment left


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix{
	 public List<Integer> spiralOrder(int[][] matrix) {
		 
		 List<Integer> result = new ArrayList<Integer>();

         //base case: checking whether the input matrix is empty or not
		 if(matrix==null || matrix.length==0) {
			 return result;
		 }
		 
		 int rows = matrix.length;
		 int cols = matrix[0].length;		 
		 int top=0, bottom = rows-1, left=0,right=cols-1;    //four variables to keep track of the valid indices

         // while loop to check the boundary violation		 
		 while(top<=bottom && left<=right) {
             //traveling from left to right and increment top 
			 for(int i=left;i<=right;i++) {
				result.add(matrix[top][i]);				
			 }
			 top = top+1;
			 
             //traveling from top to bottom and decrement right 
			 if(top<=bottom && left<=right) {
				 for(int i=top;i<=bottom;i++) {
					 result.add(matrix[i][right]);
				 }
				 right = right-1;
			 }
			 
			 //traveling from right to left and decrement bottom
			 if(top<=bottom && left<=right) {
				 for(int i=right;i>=left;i--) {
					 result.add(matrix[bottom][i]);
				 }
				 bottom = bottom -1;
			 }
			 
              //traveling from bottom to top and increment left
			 if(top<=bottom && left<=right) {
				 for(int i=bottom;i>=top;i--) {
					 result.add(matrix[i][left]);
				 }
				 left = left+1;
			 } 
		 }      
		return result;
	    }
	 
	public static void main(String[] args) {
		SpiralMatrix ob = new SpiralMatrix();
	    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		System.out.println(ob.spiralOrder(matrix));
		
	}
}