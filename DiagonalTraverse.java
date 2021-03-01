// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/*
To traverse in upward and downward direction alternatively from (0,0) of the matrix diagonally.
While traversing upward, has to check if col has reached end or row has reached starting.
While traversing downward, has to check if row has reached end or col has reached starting.
Then at every step increment and decrement row and col respectively during downward and vice versa during upward traversing.
*/

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix == null) return new int[0];
        int n=matrix.length;
        int m = matrix[0].length;
        int[] result = new int[n*m];
        int r = 0,c = 0,k=0;
        int dir = 1;
        while(k < n*m){
            result[k] = matrix[r][c];
            // upward direction
            if(dir == 1){
                if(c == m-1){ r++;dir=-1;}
                else if(r == 0){ c++;dir=-1;}
                else{ r--;c++;}
            }
            //downward direction
            else{
                if(r == n-1){ c++;dir=1;}
                else if(c == 0){ r++;dir=1;}
                else{ r++;c--;}
            }
            k++;
        }
        return result;
    }
}
