
// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes 498
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //direction if upward
        int dir=1;
        int m=mat.length;
        int n=mat[0].length;
        //ouput array must be of size m*n
        int[] output = new int[m*n];
        int k=0;
        int i=0;int j=0;
        //we need to stop until the output array is filled
        while(k<m*n){
            output[k]=mat[i][j];
            k++;
            //upwards
            if(dir==1){
                //if in upward and we are at last column, then we need to go to next row
                if(j==n-1){
                    i++;
                    dir=-1;
                }
                //if we are at top row then go to next column
                else if(i==0){
                    j++;
                    dir=-1;
                }
                //generally for upward we go to previous row and next column
                else{
                  i--;
                  j++;   
                }
            }
            //downwards
            else{
                //if we are last row then go to next column
                if(i==m-1){
                    j++;
                    dir=1;
                }
                //if we are at first column then go to next row
                else if(j==0){
                    i++;
                    dir=1;
                }
                //generally donwards we go to previous column and next row
                else{
                    j--;
                    i++;
                }
            }
        }
        return output;
    }
}