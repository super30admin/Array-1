// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// Alternate lines of traversal is observed. Bottom to top and top to bottom.
// During iteration next indices follow 2 patterns with edge cases at boundary conditions.
// Traverse the whole array by calculating the next indices until we reach the end.

// Your code here along with comments explaining your approach
// A direction of value true/false is assigned for a pattern. 
// Bottom to top - row is decremented and column is incremented.(No direction change)
// Top to Bottom - Column is decremented and row is incremented.(No direction change)
// Edge cases at start and end of row/column (Direction change)



class DiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
		//edge case
		if(matrix == null || matrix.length == 0) return new int[]{};
		int m = matrix.length;
		int n = matrix[0].length;
		int row = 0, column = 0;
		boolean dir = true;
		int[] result = new int[m*n];
        int index = 0;
		while(row < m && column < n){
            result[index] = matrix[row][column];
			if(dir){
				if(column == n-1){
					row++;
					dir = false;
				} else if(row == 0){
					column++;
					dir = false;
				} else{
					row--;
					column++;
                    dir = true;
				}
			}else{
				if(row == m-1){
					column++;
					dir = true;
				} else if(column == 0){
					row++;
					dir = true;
				} else{
					column--;
					row++;
                    dir = false;
				}				
			}
            index++;
		}
        return result;
        
    }
}