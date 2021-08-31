// Time Complexity: O(m*n) as we are traversing whole matrix to add into resultant array.
// Space Complexity: O(1) only few constant space variables are used.
// Did you complete it on leetcode: Yes
// Any issues faced: didn't assign value first into result causing tle and no result.

// Write your approach here
// Idea here is to simulate the whole matrix by traversing it as shown in question
// we start by assigning first element to 0th index of result and when direction is upwards
// on right limit we increment row and change direction and
// on upper limit we increment column, rest we move previous row next column
// similarly when moving downwards on bottom limit we increment column and
// on left limit we increment row, rest we move next row previous column and keep storing
// values in result array which is returned
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result  =new int[m*n];
        int i=0; int dir = 1;
        int r = 0; int c = 0;
        while(i<m*n) {
            result[i] = mat[r][c];
            i++;
            if(dir==1) {
                if(c==n-1) {
                    dir = -1;
                    r++;
                } else if(r==0) {
                    dir = -1;
                    c++;
                } else {
                    c++; r--;
                }
            } else {
                if(r==m-1) {
                    dir = 1;
                    c++;
                } else if(c==0) {
                    dir = 1;
                    r++;
                } else {
                    c--; r++;
                }
            }
        }
        return result;
    }
}