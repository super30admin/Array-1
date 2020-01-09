// Time Complexity : O(mn)
// Space Complexity : O(1) if output space is not considered
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// Print elements of outer elements of matrix and recursively print elements of inner matrices.

// Your code here along with comments explaining your approach
// Four pointers are initalized top, bottom, left and right at row = 0, row = m-1, column = 0 and column = n-1 respectively. 
// Increment top and left pointers after printing top and left elements of matrix. 
// Decrement bottom and right pointers after traversing those elements.
// Do this until top didnt cross bottom(top <= bottom) and left didnt cross right (left <= right)


class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        //edge case
        if(matrix == null || matrix.length == 0) return new ArrayList<Integer>();
        int m = matrix.length;
		int n = matrix[0].length;
		int top = 0;
		int bottom = m-1;
		int left = 0;
		int right = n-1;
		List<Integer> resultList = new ArrayList<Integer>(m*n);
		while(top <= bottom && left <= right){
			//top case
			for(int i = left; i<= right; i++){
				resultList.add(matrix[top][i]);				
			}
			top++;
			
			//right case
			for(int i = top; i<= bottom; i++){
				resultList.add(matrix[i][right]);				
			}
			right--;
			if(top <= bottom && left <= right){
				//bottom case
				for(int i = right; i>= left; i--){
					resultList.add(matrix[bottom][i]);				
				}
				bottom--;
			}
			if(top <= bottom && left <= right){
				//left case
				for(int i = bottom; i >= top; i--){
					resultList.add(matrix[i][left]);				
				}
				left++;
			}
		}
        return resultList;
    }
}