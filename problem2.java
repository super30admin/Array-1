public class problem2 {
// Time Complexity : O(m*n) -> m and n are number of elements in rows and coloumns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : 
//First, we are check upward direction and we are changing the direction as per requirement. We also put some base cases to avoid  Arrays out of bound.

public int[] findDiagonalOrder(int[][] mat) {
    if(mat == null || mat.length == 0) return new int[] {};
  
     int m = mat.length;
     int n = mat[0].length;
     int[] res = new int[m*n];
     
     int r = 0;
     int c = 0;
     int idx = 0;
     int dir = 1; // 1 -> upwards , -1-> downwards
     
     while(idx < m*n){
         res[idx] = mat[r][c];
         idx++;
         
         //Upwards direction
         if(dir == 1){
             if(c == n - 1){
                 dir = -1;
                 r++;
             }else if(r == 0){
                 dir = -1;
                 c++;
             }else{
                 r--;
                 c++;
                 }
         }else{// downwards direction
             if(r == m - 1){
                 dir = 1;
                 c++;
             }else if(c == 0){
                 dir = 1;
                 r++;
             }else{
                 r++;
                 c--;
                 }
         }
     }
     return res;
 }
}
