// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// manipulated the index values of i& j of matrix along with a direction veriable to shift the direction and added the traversed variables into the newly initialised array

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return new int[0];
        }
        
        int n=matrix.length; int m=matrix[0].length;
        int[] output = new int[n*m]; int index=0;
        int i=0, j=0, dir=1;
        
        while(index< n * m){
            output[index]=matrix[i][j];
            index+=1;
            
            if(dir==1){
                if(j==m-1){
                    dir=-1;
                    i+=1;   
                }
                else if(i==0){
                    dir=-1;
                    j+=1;
                }else{
                    i-=1;
                    j+=1;
                    }
            }else{
                if(i==n-1){
                    dir=1;
                    j+=1;  
                }else if(j==0){
                    dir=1;
                    i+=1;  
                }else{
                    i+=1;
                    j-=1;
                }
            }
        }
        return output;
    }
}