//Leetcode 498. Diagonal Traverse
//Time complexity : O(n^2) // p*q==n^2 whehe p*q are total no of elements in matrix
//Space Complexity : O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new int[0];
        }
        int dir=1;
        int row= matrix.length;        
        int col= matrix[0].length;
        int[] res= new int[row*col];
        int i=0;
        int c=0;
        int r=0;
        while(i<row*col){
             res[i]=matrix[r][c];     
            if(dir==1){
                     if(c==col-1){
                        r++;
                        dir=-1;
                    }         
                    else{
                        if(r==0){
                        c++; dir=-1;
                        }
                        else{
                          r--;c++;
                        }
                   }
                }
            else{    
                if(r==row-1){
                    c++;dir=1;
                    }
                else{
                    if(c==0){
                        r++;dir=1;
                         }
                    else{
                            r=r+1; c=c-1;
                        }
                    }    
                }
            i++;          
         }
        return res;
        
    }
}