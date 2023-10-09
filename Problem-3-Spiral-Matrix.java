// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* We are traversing the matrix provided in a spiral manner using four variables rowBeg,
rowEnd,colBeg,colEnd. These are check values and they are updated as soon as we traversed through that specific row or column while storing the elements in a arraylist which is eventually returned*/


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>(); // creating arraylist res which will store the elements

        if(matrix.length <= 0)
        {
            return res;
        }

        int rowBeg = 0;
        int rowEnd = matrix.length - 1; //index of the last row
        int colBeg = 0;
        int colEnd = matrix[0].length -1 ; // index of the last column

        while(rowBeg <= rowEnd && colBeg <= colEnd){//exit condtion for the program to terminate
		
				for(int i = colBeg; i <= colEnd; i++){ // the matrix traverses from left to right on the beginning row
		
						res.add(matrix[rowBeg][i]);
				}
		
				rowBeg++; // increments the rowBeg variable to show that particular row was covered

				for(int i = rowBeg; i <= rowEnd; i++){ // the matrix traverses from top to bottom on the end column
		
						res.add(matrix[i][colEnd]);
				}
		
				colEnd--; // decrements the colEnd variable to show that particular column was covered
				
				if(rowBeg <= rowEnd){ // since we have changed our rowBeg value in between the while loop we are checking the exit condition again
				for(int i = colEnd; i >= colBeg; i--){  // the matrix traverses from right to left on the end row
		
						res.add(matrix[rowEnd][i]);
				}
		
				rowEnd--;
				}
				
				if(colBeg <= colEnd){// since we have changed our colEnd value in between the while loop we are checking the exit condition again
				for(int i = rowEnd; i >= rowBeg; i--){
		
						res.add(matrix[i][colBeg]);// the matrix traverses from bottom to the top the beginning column
				}
				
				colBeg++;
				}
		
		}
		
		return res; // returning the list

        
    }
}
