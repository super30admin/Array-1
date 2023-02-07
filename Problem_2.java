// Time Complexity : O(n * m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We traverse 2d matrix and maintain 2 pointers up and down to determine the direction. When dir = 1 and c == n - 1
   we change the direction and r++. When dir = 1 and r == 0, we change direction and c++. Similarly we handle the other 
   two cases when direction is down and keep on storing in array which we return.
*/

class Solution {
   public int[] findDiagonalOrder(int[][] mat) {
       if(mat == null || mat.length == 0)return new int[]{};

       int m = mat.length;
       int n = mat[0].length;
       int[] result = new int[m * n];
       int r = 0;
       int c = 0;
       int idx = 0;
       int dir = 1;

       while(idx < m * n){
           result[idx] = mat[r][c];
           idx++;
           if(dir == 1){
               if(c == n-1){
                   dir = -1;
                   r++;
               }
               else if(r==0){
                   dir = -1;
                   c++;
               }
               else{
                   r--;
                   c++;
               }
           }
           else{
               if( r == m - 1){
                   dir = 1;
                   c++;
               }
               else if(c == 0){
                    dir = 1;
                    r++;
               }
               else{
                   r++;
                   c--;
               }
           }
       }  
       return result;      
   }
}

