
public class DiagonalTraverse {

	/**
	 * Time: O(n)
	 * Space: O(1)
	 * Leetcode accepted: yes
	 * Problems faced: NA
	 */
	
	public static int[] findDiagonalOrder(int[][] matrix) {
		if(matrix == null || matrix.length == 0) return new int[1];
        int dir = 1; //1 => up; 0 => down 
        int nrows = matrix.length;
        int ncols = matrix[0].length;
        int[] result = new int[nrows * ncols];
        
        int row = 0, col = 0;
        for(int i=0; i<result.length; i++) {
        		result[i] = matrix[row][col];
        		System.out.println(result[i]);
        		//Direction up  => edges: top row and right column
        		if(dir == 1) {
        			//Top row except last column
        			if(row-1 < 0 && col != ncols-1) {
        				col++;
        				dir = -1;
        			//Right most column except last row
        			} else if(col+1 >= ncols && row != nrows-1) {
        				row++;
        				dir = -1;
        			} else {
        				row--;
            			col++;
        			}
        		//Direction down => edges: bottom row and left column
        		} else {
        			//Bottom row except last column
        			if(row+1 >= nrows && col != ncols-1) {
        				col++;
        				dir = 1;
        			//Left most column except last row
        			} else if(col-1 < 0 && row != nrows-1) {
        				row++;
        				dir = 1;
        			} else {
        				row++;
                		col--;
        			}
        		}
        }
        return result;
    }
	
	public static void main(String[] args) {
		int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		findDiagonalOrder(matrix);
	}

}
