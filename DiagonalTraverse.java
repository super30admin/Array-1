// Time Complexity : O(MN), M-> number of rows, N-> number of columns
// Space Complexity : O(1), No auxiliary space used
// Did this code successfully run on Leetcode : No
// Three line explanation of solution in plain english: Finding the order of elements when diagonally traversed through the given input array. We maintain the direction variable (dir), dir=1 indicates upward direction, dir=-1 indicates downward direction. When we reach the end of the columns and rows, then we change the direction of the traversal by incrementing or decrementing the indices. 

public class DiagonalTraverse{
	
	public int[] findDiagonalOrder(int[][] matrix) {

		//checking whether the input matrix is empty or not
		if(matrix==null || matrix.length==0) {
			return new int[0];
		}
		
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[] result = new int[rows*cols];
		int dir=1;		
		int index = 0;
		int i=0,j=0;
		
        //changing the direction accordingly by incrementing the row and column
		while(index<rows*cols) {
			result[index] = matrix[i][j];
			if(dir==1) {
				if(j==cols-1) {     //when we reach end of the col, the move downward
					dir=-1;
					i++;
				}else if(i==0) {       //when we reach first row, the move downward
					dir=-1;
					j++;
				}else {
					i--;
					j++;
				}
			}else {
				if(i==rows-1) {      //when we reach end of the rows, the move upward
					dir=1;
					j++;
				}else if(j==0) {     //when we reach first col, the move downward
					dir=1;
					i++;
				}else {
					i++;
					j--;
				}				
			}
			index = index+1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		DiagonalTraverse ob = new DiagonalTraverse();
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[] printRes = ob.findDiagonalOrder(matrix);
		
		for(int i=0;i<printRes.length;i++) {
			System.out.println(printRes[i]);
		}
	}
}