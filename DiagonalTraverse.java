// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    /*
       Directions Flag:
        1: upward  
        –1: downwards 

For Upwards 
    If(j==m-1) 
        Change dir: dir=-1 
        I++ 
    else If(i==0) 
      Change dir: dir = -1 
      j++ 
    Else 
        i--  
        j++

For downwards 
    If(i==n-1) 
        Change dir: dir=+1 
        j++ 
    else If(j==0) 
      Change dir: dir = +1 
      i++ 
    Else 
        i++ 
        j--  
        
    */
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return new int[0];
        
        int R=matrix.length;
        int C=matrix[0].length;
        
        int res[] = new int[R*C];
        int dir = 1;
        int i=0;
        int j=0;
        int index = 0;
        while(index < R*C){
            res[index] = matrix[i][j];
            index++;
            
            if(dir==1){
                if(j==C-1){
                    dir = -1;
                    i++;
                }else if(i==0){
                    dir=-1;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i==R-1){
                    dir = 1;
                    j++;
                }else if(j==0){
                    dir=1;
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}