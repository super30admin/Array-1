class DiagonalTraversal {
  /*
  https://leetcode.com/problems/diagonal-traverse/

  Time Complexity: O(m * n)
  Space Complexity: O(1) (space occupied by the result array doesn't matter)

  Were you able to solve this on leetcode? Yes
  Any issues solving this problem ? No
  */
  public int[] findDiagonalOrder(int[][] mat) {
    if(mat == null) { return new int[0]; }
    int[] result = new int[mat.length * mat[0].length];
    
    int i = 0, j = 0;
    boolean up = true;
    int idx = 0;
    while(idx < result.length){
        result[idx] = mat[i][j];
        idx++;
        if(up){
            if(j == mat[0].length-1){
                up = false;
                i++;
            } else if(i ==0){
                up = false;
                j++;
            } else {
                i--;
                j++;
            }
            
        } else {
            if(i == mat.length-1){
                up = true;
                j++;
            } else if(j == 0) {
                up = true;
                i++;
            } else {
                i++;
                j--;
            }   
        }
    }
    
    return result;
  }
}
