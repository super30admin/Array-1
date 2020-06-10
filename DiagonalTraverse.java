  
// Time Complexity : O(m*n). m is the length of the array. n is the length of the first row(column length)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
			return new int[0];

		
		int c=0,r=0;
		int rowLength = matrix.length;
		int columnLength = matrix[0].length;
		int[] resultMatrix = new int[rowLength*columnLength];
		int i=0;int dir=1;
		while(i<rowLength*columnLength) {
			resultMatrix[i]=matrix[r][c];
			if(dir==1) {
				if(c==columnLength-1) {
					r++;dir=-1;
				}else if(r==0) {
					c++;dir=-1;
				}else {
					r--;c++;
				}
			}else {
				if(r==rowLength-1) {
					c++;dir=1;
				}else if(c==0) {
					r++;dir=1;
				}else {
					c--;r++;
				}
			}
			i++;
			
		}
		return resultMatrix;
    }
}
