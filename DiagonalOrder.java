// Time Complexity :O(N*M) n are the rows and m are the columns in the given array.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix== null||matrix.length==0)
            return new int[0];
        int m=matrix.length,n=matrix[0].length,index=0,dir=1,i=0,j=0;
        int result[] =new int[m*n];
        while(index<m*n){
            
                //System.out.println("starti "+i+" j "+j);
            if(dir==1){  
                //System.out.println("i "+i+" j "+j);
                result[index++]=matrix[i][j];
                if(j==n-1){
                    dir=-1;
                    i++;
                }
                else if(i==0){
                    dir=-1;
                    j++;
                }
                else    {                
                i--;j++;}
            }
            else{
                
                //System.out.println("i "+i+" j "+j);
                result[index++]=matrix[i][j];
                if(i==m-1){
                    j++;
                    dir=1;
                }
                else if(j==0){
                    i++;
                    dir=1;
                }
                else   {                 
                j--;i++;}
            }
        }
        return result;
    }
}