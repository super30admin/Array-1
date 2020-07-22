//Time Complexity : O(m*n) m->rows, n->cols
//Space Complexity : O(1)
/*Approach
-taking two directions up and down switching directions whenever we reach the limit
-for up it can be reaching top row or reaching last column,otherwise we simply keep going 
diagonally up
-for down limit will be reaching last row or first column,otherwise we simply keep moving
diagonally down
-we flip direction whenever we reach limit in any case
*/
public class DiagonalMatrix {
   public static int[] diagonal(int[][] A) {
      int m = A.length;
      int n = A[0].length;
      int[] result = new int[m*n];
      if(A == null || A.length == 0){return new int[]{};}
      int i = 0;
      int row =0,col=0;
      int dir = 1;

      while(i < m*n){
         result[i] = A[row][col];
         if(dir == 1){
            if(row == 0){
               col++;
               dir = -1;
            }
            else if(col == n-1){
               row++;
               dir = -1;
            }
            else{
               row--;
               col++;
            }
         }
         //direction down
         else{
            if(row == m-1){
               col++;
               dir = 1;
            }
            else if(col == 0){
               row++;
               dir = 1;
            }
            else{
               row++;
               col--;
            }
         }
         i++;
      }
      return result;
   }
   public static void main(String args[]){
      int [][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      //int [][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
      int[] result = diagonal(A);
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]+" ");   
      }
   } 
}