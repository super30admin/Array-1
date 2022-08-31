// Time Complexity : O(m*n)
// Space Complexity : O(1) , output space is not considered as extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * For this problem, we have to traverse the matrix in a diagonal pattern. There are two possible directions
 * of moving upwards and downwards. We are taking  a flag variable called direction which is set to one initially and
 * it is changing to -1 when the direction is changing . We will be increasing the index of our resultant array
 * that stores the values from our matrix. In order to travel diagonally, we are increasing or decreasing our
 * row nad column variables as well.
 *
 */

// Your code here along with comments explaining your approach
//

public class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {

        int m= mat.length;
        int n = mat[0].length;

        //null check
        if(mat==null || mat.length==0) return new int[] {};

        //result array
        int[] result = new int[m*n];

        //denotes row and column
        int r = 0;
        int c = 0;

        //direction for going up to down
        int dir =1;

        //index of the result array
        int index=0;

        while(index<result.length){

            result[index ] = mat[r][c];
            index++;

            //for upward direction
            if(dir ==1){
                if(c==n-1){
                    dir = -1;
                    r++;
                }
                else if(r==0){
                    c++;
                    dir = -1;

                }
                else{
                    c++;
                    r--;
                }



            }
            else{
                if(r==m-1){
                    dir = 1;
                    c++;
                }
                else if(c==0 && r!=m-1){
                    r++;
                    dir = 1;

                }
                else{
                    r++;
                    c--;
                }



            }

        }

        return result;
    }
}
