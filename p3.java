// TC: O(n*m)
// SC: O(1)






class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    int left = 0, top = 1, item = 0;
    int right = matrix[0].length;
    int bottom = matrix.length;
    int nItems = right * bottom;
    right--; bottom--; // Getting the max index positions

    // Traverse all items in the matrix until the traversed item count == total no. of items in the matrix
    while(item < nItems){
      // Traverse right from left margin to right margin
      for(int i=left; i<= right && item < nItems; i++){
        result.add(matrix[left][i]);
        item++;
      }

      // Traverse down from top margin to bottom margin
      for(int i=top; i <= bottom && item < nItems; i++){
        result.add(matrix[i][right]);
        item++;
      }

      // Traverse left from right margin to left margin
      for(int i=right-1; i >= left && item < nItems; i--){
        result.add(matrix[bottom][i]);
        item++;
      }

      // Traverse up from bottom margin to top margin
      for(int i=bottom-1; i >= top && item < nItems; i--){
        result.add(matrix[i][left]);
        item++;
      }
      left++; // incrementing as we are going from left to right
      top++;  // incrementing as we are going from top to bottom
      right--; // decrementing as we are going from right to left
      bottom--; // decrementing as we are going from bottom to top
    }
    return result;
  }
}