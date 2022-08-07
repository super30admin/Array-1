//time complexity: O(mn) //size of matrix 
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        //checking is matrix is empty
        if(mat == null || mat.length ==0)    return new int[] {};
        
        int m = mat.length;
        int n= mat[0].length;
        int [] result = new int[m*n];
        
        int r=0; int c=0; //traversal of rows and cols variables
        int dir=1; int idx=0; 
        
        while(idx < result.length){
            result[idx] = mat[r][c];
            idx++;
            //traversal upside
            if(dir==1){
                if(c==n-1){
                    r++; dir=-1;
                }else if(r==0){
                    c++; dir=-1;
                }else {
                    c++; r--; 
                }
            }else{ //traversal downside
                if(r==m-1){
                  c++; dir=1;              
                }else if(c==0){
                    r++; dir=1;
                }else {
                    r++; c--;
                }
            }
        }
        return result;
        
    }
}