//Time complexity is o(row*column) as we are iterating through the entire matrix
//Space complexity is O(1) as we are not using any extra space
//This code is submitted on leetcode

public class DiagonalTranversalBigN26 {
	 public int[] findDiagonalOrder(int[][] matrix) {
		 //edge
		 if(matrix.length ==0 || matrix == null) {
			 return new int [] {};
		 }
		 int row = matrix.length;
		 int column = matrix[0].length;
		 int [] result = new int [row*column];
	     int i = 0; // index for result array
	     int direction  = 1; // for upward and downward direction
	     int r = 0; // for row
	     int c = 0; // for column
	     while (i<row*column) {
	    	 result[i] = matrix[r][c];
	    	 if (direction ==1) {
	    		 //case1:
	    		 if (c == column-1) {
	    			 direction =-1;
	    			 r ++;
	    		 }
	    		 else if(r==0) {
	    			 direction =-1;
	    			 c++;
	    		 }
	    		 else {
	    			 r--;
	    			 c++;
	    		 }
	    	 }
	    	 else {
	    		 // do exact mirror image
	    		 if(r == row-1) {
	    			 direction= 1;
	    			 c++;
	    		 }
	    		 else if (c== 0) {
	    			 direction =1;
	    			 r++;
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

	public static void main(String[] args) {
		DiagonalTranversalBigN26 dia = new DiagonalTranversalBigN26();
		int [] [] matrix = {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9}};
		dia.findDiagonalOrder(matrix);
	}
}
