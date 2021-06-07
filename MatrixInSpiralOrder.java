/*TC - O (M*N) 
 *SC - O (M*N) - 1D array of size of all the elements
 Ran on leetcode - yes
 * */

// approach - move from left to right, top to bottom, right to left, bottom to top in the same order mentioned. and with each move of direction, increment or decrement row or column based on the direction
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowBegin =0 ; 
        int colBegin = 0 ; 
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;
        List<Integer> ans  = new ArrayList<Integer>();
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            
		// move left to right
            for (int i = colBegin ; i <= colEnd; i++ ){
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin += 1;
            
	    // top to bottom
            
            for (int i = rowBegin ; i <=  rowEnd; i++ ){
                ans.add(matrix[i][colEnd]);
            }
            colEnd -= 1;
	    // right to left , additional check if all the rows are exhausted
            if (rowBegin <= rowEnd){
                for (int i =colEnd ; i >colBegin-1; i-- ){
                ans.add(matrix[rowEnd][i]);
                } 
                
                rowEnd -=1;
            }
            // bottom to top, additioanl check if all the columns are exhausted
            
            if (colBegin<= colEnd){
                for (int i = rowEnd ; i > rowBegin-1; i-- ){
                ans.add(matrix[i][colBegin]);
                }
                colBegin +=1;
            }
        
       
    }
         return ans; 
        
    }
}
