// https://leetcode.com/problems/diagonal-traverse/

// Time Complexity : Optimized - O(MN), where M*N is the number of elements in input matrix
// Space Complexity : Optimized - O(1), only op array is used and it does not count as extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// We are going to start from index 0 and move upwards diagonally
// As soon as we hit a boundary, we change the direction
// We continue doing this until we have filled the output array

// Your code here along with comments explaining your approach



class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Variables to traverse the matrix
        int i=0, j=0;

        // dir==true means that we are moving upwards diagonally
        // dir==false means that we are moving downwards diagonally
        boolean dir=true;
        int m=mat.length;
        int n=mat[0].length;

        // Output array
        int[] op=new int[mat.length*mat[0].length];

        for(int idx=0;idx<op.length;idx++){
            op[idx]=mat[i][j];

            // Moving upwards
            if(dir){
                if(i==0 && j!=n-1){
                    // Case1. We hit the top row
                    j=j+1;
                    dir=false;
                }
                else if(j==n-1){
                    // Case2. We hit the rightmost col
                    i=i+1;
                    dir=false;
                }
                else{
                    // Case3. Rest of the cells
                    i=i-1;
                    j=j+1;
                }
            }
            // Moving downwards
            else{
                if(j==0 && i!=m-1){
                    // Case1. We hit the leftmost column
                    i=i+1;
                    dir=true;
                }
                else if(i==m-1){
                    // Case2. We hit the bottom most row
                    j=j+1;
                    dir=true; 
                }
                else{
                    // Case3. Rest of the cells
                    i=i+1;
                    j=j-1;
                }
            }
        }

        return op;
    }
}