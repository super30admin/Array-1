// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Taking bottom, right, left, top walls to restrict the movement of the pointer.

// Your code here along with comments explaining your approach
class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		 int m = matrix.length;
		 int n = matrix[0].length;
		 int top = 0, right = n-1, bottom = m-1, left = 0;

		 List<Integer> res = new ArrayList<>();
		 while(top <= bottom && left <= right) {

			  if (top <= bottom && left <= right)
					for(int i = left; i <= right; i++) {
						 res.add(matrix[top][i]);
					}
			  top++;
			  
			  if (top <= bottom && left <= right)
					for(int i = top; i <= bottom; i++) {
						 res.add(matrix[i][right]);    
					}
			  right--;
			  
			  if (top <= bottom && left <= right)
					for(int i = right; i >= left; i--) {
						 res.add(matrix[bottom][i]);    
					}
			  bottom--;
			  
			  if(top <= bottom && left <= right)
					for(int i = bottom; i >= top; i--) {
						 res.add(matrix[i][left]);    
					}
			  left++;
		 }
		 return res;
	}
}