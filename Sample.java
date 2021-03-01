
//problem number: Array-1, problem 1
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
/*
 * I initially calculated the prefix product and suffix product at each element.
 * Calculated the final product for each element by multiplying the prefix product and the suffix product
 * I am trying to reduce the space complexity to O(1)
 */

// Your code here along with comments explaining your approach

class Solution{
	
	//problem number: Array-1, problem 1
    public int[] productExceptSelf(int[] nums) {
        //prefix product
        int[] prefix = new int[nums.length];
        
        //suffix product
        int[] suffix = new int[nums.length];
        
        //final product
        int[] product = new int[nums.length];
        
        //initial prefix value is set to 1
        prefix[0] = 1;
        
        //suffix value in the nth index start with 1
        suffix[nums.length - 1] = 1;
        
        
        //calculate the prefix
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        
        //calculate the suffix
        for(int i=suffix.length-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
        
        //calculate the final product
        for(int i=0;i<product.length;i++){
            product[i] = prefix[i]*suffix[i];
        }
        
        return product; 
    }

  //problem number: Array-1, problem 2
 // Time Complexity : O(n)
 // Space Complexity : O(1)
 // Did this code successfully run on Leetcode :Yes
 // Three line explanation of solution in plain english
 /*
  * Two things to be noticed: 1. up direction 2. down direction
  * Identified the boundary conditions -> when the direction is up, should make sure that index should not exceed first row and last column. If it is in tact then row should be decremented and col should be incremented.
  * Similar logic goes in the down direction.
  * */
    public int[] finalDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[]{};
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] arr = new int[m*n];
        
        int i = 0;
        int row=0;
        int col=0;
        
        boolean up = true;
        
        while(row<m && col<n){
            if(up){
                while(row>0 && col<n-1){
                    arr[i] = matrix[row][col];
                    row--;
                    col++;
                    i++;
                }
                arr[i] = matrix[row][col];
                i++;
                if(col==n-1){
                    row++;
                }else{
                    col++;
                }
            }
            
            else{
                while(row<m-1 && col>0){
                    arr[i] = matrix[row][col];
                    row++;
                    col--;
                    i++;
                }
                arr[i] = matrix[row][col];
                i++;
                if(row == m-1)
                    col++;
                else
                    row++;
            }
            
            up = !up;
        }
        
        return arr;
    }
    
    //problem number: Array-1, problem 3
    // Time Complexity : O(n)
    // Space Complexity : O(1) -> discarding the resultant list
    // Did this code successfully run on Leetcode :Yes
    // Three line explanation of solution in plain english
    /*
     * four pointers are kept -> startRow, startCol, endRow, endCol
     * boundary values are made sure to be not exceeded at any point.
     * each iteration is performed copying the values of the 2D array into a resultant list in spiral order.
     * Edge case is handled when only a single row or single column is present in order not to repeat the printing of elements.
     * */
    
    
    public static List<Integer> spiralTraverse(int[][] array) {
    		
    		if(array.length == 0) return new ArrayList<>();
    		
    		List<Integer> result = new ArrayList<>();
    		int startRow = 0;
    		int startCol = 0;
    		int endRow = array.length-1;
    		int endCol = array[0].length-1;
    		
    		while(startRow<=endRow && startCol<=endCol){
    			
    			for(int i=startCol;i<=endCol;i++){
    				result.add(array[startRow][i]);
    			}
    			
    			for(int i=startRow+1;i<=endRow;i++){
    				result.add(array[i][endCol]);
    			}
    			
    			for(int i=endCol-1;i>=startCol;i--){
    				/*Edge case when a single row is present*/
    				if(startRow == endRow) break;
    				result.add(array[endRow][i]);
    			}
    			
    			for(int i=endRow-1;i>startRow;i--){
    				/*Edge case when a single column is present*/
    				if(startCol==endCol)break;
    				result.add(array[i][startRow]);
    			}
    			
    			startRow++;
    			startCol++;
    			endRow--;
    			endCol--;
    		}
    		
    		
        return result;
      }
    
}