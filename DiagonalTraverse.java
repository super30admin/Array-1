// Time Complexity : O(n*m)
// Space Complexity : O(1) , no extra space other than the returning array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//We have to take care of going upwards and downwards according to the position. (pointer dir for direction)
//initially it goes up, and alternate up and down (so increase the i and j pointer accordingly)
//but we come across boundary cases (i==0/n-1 and j==0/m-1), we handle the cases separately
//return the array

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return new int[0];
        }
        int n=matrix.length, m=matrix[0].length;
        int[] res=new int[n*m];
        
        int i=0,j=0;
        int dir=1, index=0;
        while(index<n*m){
            res[index]=matrix[i][j];
            index++;
            if(dir==1){
                if(j==m-1){
                    i++;
                    dir=-1;
                }
                else if(i==0){
                    j++;
                    dir=-1;
                }
                else{
                    i--; j++;
                }
            }
            else{
                 if(i==n-1){
                    j++;
                    dir=1;
                }
                else if(j==0){
                    i++;
                    dir=1;
                }
                else{
                    i++; j--;
                }
            }
        
            }
        return res;
    }
}
    