public class SpiralTraversal {
  /**
   * 
   * Iterative Solution:
   * 
   * Challenge/ Gotcha:
   *      Implementing the traversal in a while loop. We need to re-evaluate the base condition.
   * 
   * Time Complexity: O(m * n)
   * Space Complexity: O(1)
   * 
   * Were you able to solve this on Leetcode? Yes
   * Any issues solving this? No
   * 
   */
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    
    int rowMin = 0, rowMax = matrix.length - 1;
    int colMin = 0, colMax = matrix[0].length - 1;
    
    while(rowMin <= rowMax && colMin <= colMax){
        // iterate over top row
        for(int j = colMin; j <= colMax; j++){
            result.add(matrix[rowMin][j]);
        }
        rowMin++;
        
        // iterate over right column
        for(int i = rowMin; i <= rowMax; i++){
            result.add(matrix[i][colMax]);
        }
        colMax--;
        
        // iterate over bottom row
        if(rowMin <= rowMax){
            for(int j = colMax; j >= colMin; j--) {
                result.add(matrix[rowMax][j]);
            }
            rowMax--;
        }
        
        // iterate over left column
        if(colMin <= colMax){
            for(int i = rowMax; i >= rowMin; i--) {
                result.add(matrix[i][colMin]);
            }
            colMin++;
        }
    }
    
    return result;
  }

  /**
   * Recursive solution
   * 
   * Time Complexity: O(m * n)
   * Space Complexity: O(t)  t -> the number the concentric spirals you could have in the matrix.
   * 
   * Were you able to solve this on Leetcode? Yes
   * Any issues solving it? No
   */

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    
    spiralOrderHelper(matrix, 0, matrix.length-1, 0, matrix[0].length-1, result);
    return result;
}

void spiralOrderHelper(int[][] matrix, int rowMin, int rowMax, int colMin, int colMax, List<Integer> result){
    if(rowMin > rowMax && colMin > colMax) { return; }

    if(rowMin <= rowMax){
        // iterate over top row
        for(int j = colMin; j <= colMax; j++){
            result.add(matrix[rowMin][j]);
        }
        rowMin++;
    }
    

    if(colMin <= colMax){
        // iterate over right column
        for(int i = rowMin; i <= rowMax; i++){
            result.add(matrix[i][colMax]);
        }
        colMax--;
    }
    
    // iterate over bottom row
    if(rowMin <= rowMax){
        for(int j = colMax; j >= colMin; j--){
            result.add(matrix[rowMax][j]);
        }
        rowMax--;
    }

    // iterate over left column
    if(colMin <= colMax){
        for(int i = rowMax; i >= rowMin; i--){
            result.add(matrix[i][colMin]);
        }
        colMin++;
    }
    
    spiralOrderHelper(matrix, rowMin, rowMax, colMin, colMax, result);
  }
}
