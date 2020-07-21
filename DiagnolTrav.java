// Time Complexity :O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
  //from 0,0 look at uper diagnol by x-1, y+1. once on top
  // move down by moving to next diagnols first value.
  //simillarly for when reaching bottom move to next diagnols first elem.

// Your code here along with comments explaining your approach

class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {
        int x = 0;
        int y = 0;

        if(matrix.length == 0)
            return new int[0];

        int ret[] = new int[matrix.length* matrix[0].length];
        int i = 0;

        while(x >= 0 && y >= 0 &&
              x < matrix.length && y < matrix[x].length){

            //keep getting top diagnol elems
            while(x >= 0 && y >= 0 &&
              x < matrix.length && y < matrix[x].length){
                ret[i++] = matrix[x][y];
                x--;
                y++;
            }
            //normalize to last valid location.
            x++;y--;

            //move down
            if(y == matrix[x].length-1)
                x++;
            else
                y++;

            //keep getting bottom diagnol elems
            while(x >= 0 && y >= 0 &&
              x < matrix.length && y < matrix[x].length){
                ret[i++] = matrix[x][y];
                x++;
                y--;
            }
            //normalize to last valid location.
            x--;y++;

            //move up.
            if(x == matrix.length-1)
                y++;
            else
                x++;
        }
        return ret;
    }
}
