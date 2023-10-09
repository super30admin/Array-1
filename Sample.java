// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*  Used a flag variable named up to check whether we are going up or down in diagonal traversal. Based on it we are changing the calues of row and column and storing the elements in the result array ans.*/

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int row=0,col=0;
        int m = mat.length;
        int n = mat[0].length;
		int ans[] = new int[m*n];
		boolean up = true;
		int idx=0;
		
		while(row < m && col < n){// exit condition
		
			if(up == true){ // flag to check whether the array is going up or down
		
				while(row > 0 && col < n-1){ // traversal for all condtion except the boundary edge
		
				ans[idx++] = mat[row][col];
				row--;
				col++;
		
			}
		
		ans[idx++] = mat[row][col];
		
			if(col == n-1){ // boundary edge condition
		
			row++;
			}
			else{
		
			col++;
			}
		
		}
		else{
		
			while(row < m-1 && col > 0){ // traversal for all condtion except the boundary edge
		
				ans[idx++] = mat[row][col];
				row++;
				col--;
		
			}
		
		ans[idx++] = mat[row][col];
		
			if(row == m-1){ // boundary edge condition
		
				col++;
			}
			else{
		
				row++;
			}
		
		}
		
		up =!up; // changing the up to down
		}
		
		return ans;
    }
}
