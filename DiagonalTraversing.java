class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
    if(matrix == null || matrix.length == 0 ) return new int[0];  
      int m = matrix.length;
      int n = matrix[0].length;
      int dir = 1;
      int r= 0;int c = 0;int idx =0; int[] result = new int[m*n];
        while(idx < m*n){
            result[idx] = matrix[r][c];
            if(dir == 1){
                if(c == n-1){  // this has to be first condition or else at 6 there will be out of bounds error beacause we are increasing column index
                    r++;dir = -1;
                }
                else if(r == 0){
                    c++; dir = -1;
                }
                else{
                   r--;c++;
                }
            }
            else{
                if(r == m-1){
                    c++;dir =1;
                }
                else if(c == 0){
                    r++;dir = 1;
                }
                else{
                    c--;r++;
                }
                }
            idx++;
         }
          return result;
        }
       
}  

/*
TimeComplexity: O(mxn)
Space Complexity :O(1); input and output space used no computational space used
*/
