package Array1;

/*
-------------------------------------------------------------------------------------------------------
    Time complexity :o(n)
    space complexity: o(1) 
    Did this code run successfully in leetcode : yes
    problems faces : no
*/

public class DiagonalTraverse {
    
  public int[] findDiagonalOrder(int[][] mat) {
      
      int m = mat.length;
      int n = mat[0].length;
      
      int[] result = new int[m*n];
      int r=0;
      int c=0;
      
      int i =0; //index of result array
      int direction = 1; // inital direction up
      
     while(i < m*n)
     {
         result[i] = mat[r][c];
         
         if(direction == 1) // moving up
         {
             if(c == n-1)
             {
                 r++;
              direction = -1;
             }else if(r == 0)
             {
                 c++;
                 direction = -1;
             }
             else {
                 r--;c++;
             }
             
         }
         else  // moving down
         {
             if(r == m-1)
             {
                 c++;
                 direction = 1;
             }
             else if(c == 0)
             {
                 r++;
                 direction = 1;
             }
             else {
                 r++;c--;
             }
         }
        
        i++; 
     }

      return result;
}
}
