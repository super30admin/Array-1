// TC - O(m*n)
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
         int m = mat.length;
         int n = mat[0].length;

         int[] result = new int[m*n];

         int r = 0, c = 0;
         boolean flag = true;

         for(int i = 0; i < result.length; i++) {
             result[i] = mat[r][c];
             // up
             if(flag) {
                 // boundary condition for column
                 if(c == n-1) {
                     flag = false;
                     r++;
                 } 
                 // boundary condition for row
                 else if(r == 0) {
                     flag = false;
                     c++;
                 } 
                 else {
                     r--;
                     c++;
                 }
             }
             // down
             else {
                 // boundary condition for row
                 if(r == m-1) {
                     flag = true;
                     c++;
                 } 
                 // boundary condition for column
                 else if(c == 0) {
                     flag = true;
                     r++;
                 } 
                 else {
                     r++;
                     c--;
                 }
             }
         }
         return result;
    }   
}