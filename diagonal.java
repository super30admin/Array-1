// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : No issues

// Your code here along with comments explaining your approach
// we are taking a boolean to track the direction .. if dir is true then we are moving up elese down. 
// if we are moving up consider a 3*3 matrix and u are moving along diagonal from left-bottom corner to top-right corner. 
// the index of i and j will be i-1 and j+1;
// now we need to take care of the edge cases .. if we are at the 0,0 element we dont have a i--,j++ elemnt then we need to move one step right .. i.e j++ and change the dir to false(down)
// also when we are at right corner we dont have a j++ element so we need to move to the next row i++ and change dir = down
// in the same way we will be doing for downward direction also.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; //rows
        int n = mat[0].length; //cols
        int result[] = new int[m*n];
        int index=0;
        int i=0; int j=0;
        boolean dir = true; //up
        while(index < result.length)
        {
            result[index] = mat[i][j];
            index++;
            if(dir)
            {
                //up
                if(i==0 && j!=n-1){
                    j++; dir=false;
                }
                else if(j==n-1){
                    i++; dir=false;
                }
                else{
                    i--; j++;
                }
            }else {
                //down
                if(j==0 && i!=m-1){
                    i++; dir=true;
                }
                else if(i==m-1){
                    j++; dir=true;
                }
                else{
                    i++;j--;
                }
            }
        }
    return result;
    }
}