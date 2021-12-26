// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Your code here along with comments explaining your approach
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat == null ) return new int[]{};
           
           int m = mat.length; 
           int n = mat[0].length; 
           int dir = 1; 
           int[] result = new int[m*n];
           int index = 0, i = 0, j = 0;
           
           while(index < m * n){
               result[index] = mat[i][j];
               index ++ ; 
               if(dir == 1){
                   if(j == n - 1){
                       dir = -1;
                       i++;
                   }
                   else if(i == 0){
                       dir = -1; 
                       j++;
                   }
                   else{
                       i--;
                       j++;
                   }
               }
               else{
                   if(i == m -1){
                       dir = 1; 
                       j++;
                   }
                   else if(j == 0){
                       dir = 1;
                       i++;
                       
                   }
                   else{
                       i++;
                       j--;
                   }
               }
           }
           return result;
       }
}
