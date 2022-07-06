//Time complexity- O(m*n)
//Space Complexity- O(1)
//Successfully ran on leetcode

class Solution {
 public int[] findDiagonalOrder(int[][] mat) {
     
 if(mat.length==0 || mat==null) return new int[]{};
     
     int m= mat.length;
     int n= mat[0].length;
     int row=0;
     int col=0;
     int index=0;
     int[] result= new int[n*m];
     int dir=1;
     
     while(index< m*n){
         result[index]= mat[row][col];
         index++;
         if(dir==1){
             
             if(col==n-1){
                 dir= -1;
                 row++;
             }
             else if(row==0){
                 dir= -1;
                 col++;
             }
             else{
                 row--;
                 col++;
             }
         }
         
         else{
             if(row==m-1){
                dir=1;
                col++;
                 
                 
             }
             else if(col==0){
                 dir=1;
                 row++;
                 
             }
            
             else{
                 row++;
                 col--;
             }
             
             
             
         }
     }
     return result;
 }
}