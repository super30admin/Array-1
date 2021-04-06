/*
 *  Time Complexity: O(N*M) Where N is the number of rows and M is the number of columns
 *  Space Complexity: O(1) Since we are using only additional space to return the values. We do not consider that to the space complexity.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 *  Explanation: We have four condition when we change the direction, when we hit the first row, last row, first column and last column. Based on the current direction we will have to write the if else cases to handle all the cases.  
 */
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[]{};
        int dir=1, i=0, j=0, n=matrix.length-1, m=matrix[0].length-1, index=0;
        int[] res = new int[matrix.length*matrix[0].length];
        
        while(index<(matrix.length * matrix[0].length)){
            res[index++]=matrix[i][j];
            if(dir==1){
                if(j==m) i++;
                else if(i==0) j++;
                else{
                    i--;
                    j++;
                    continue;
                }
                dir=-1;
            }else{                
                if(i==n) j++;
                else if(j==0) i++;
                else{
                    i++;
                    j--;
                    continue;
                }
                dir=1;
            }
        }
        return res;
    }
}
