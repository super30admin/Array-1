
public class Diagonal_Traverse {
	 public int[] findDiagonalOrder(int[][] matrix) {
		 //Approach: 1. To diagonal traverse, we should be able to move diagonally left in the downward direction and diagonal right in the upward direction.
		 //2. While moving diagonally upward, we check if we have reached column boundary, if so we will increment the row and start moving downwards. Else if we are at 0th row,
		 //then we  move increment the column and start moving downward else we move diagonally right upward.
		 //3. While moving downward, we check if we have reached the row boundaries, if so we will increment the column and move upward. Else we will check if we are at Oth column,
		 //if so we will increment row and start moving upward or else we keep moving diagonally left in downward direction.
		 if(matrix == null || matrix.length == 0)
	            return new int[0];
	        
	        int row = 0, column = 0, m = matrix.length, n = matrix[0].length;
	        int[] result = new int[m*n];
	        int direction =1, i=0;
	        while(i < m*n)
	        {            
	            result[i] = matrix[row][column];
	            if(direction == 1)
	            {
	                if(column == n-1)
	                {
	                    row++;
	                    direction =-1;
	                }else if(row == 0)
	                {
	                    column++;
	                    direction = -1;
	                }
	                else{
	                    row--;
	                    column++;
	                }
	            }else
	            {
	                if(row == m-1)
	                {
	                    column++;
	                    direction =1;
	                }else if(column == 0)
	                {
	                    row++;
	                    direction = 1;                   
	                }else
	                {
	                    row++;column--;
	                }
	            }
	            i++;
	        }
	        return result;
	    }
}

//Time Complexity : O(m*n) where m and n are row length and column length of matrix
//Space Complexity : O(m*n) where m and n are row length and column length of matrix
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :
