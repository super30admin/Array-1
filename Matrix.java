
// Time Complexity :O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols= mat[0].length;
        int[] result = new int[rows*cols];
        int dir = 1;
        int n = 0;
        int i = 0;
        int j = 0;
        while(n<rows*cols){
            result[n] = mat[i][j];
            n++;
            if(dir==1){
                if(i==0 && j!=cols-1){
                    dir =-1;
                    j++;
                }else if(j==cols-1){
                    dir=-1;
                    i++;
                }else{
                    i--;
                    j++;
                    
                }
            }else{
                if(j==0 && i!=rows-1){
                    dir =1;
                    i++;
                }else if(i==rows-1){
                    dir=1;
                    j++;
                }else{
                    i++;
                    j--;
                    
                }
                
                
            }
         
            
        }
           return result;
    }
}