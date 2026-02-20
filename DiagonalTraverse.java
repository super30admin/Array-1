// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/*
Traverse the input array by setting boolean variable for upwards and downwards motion and play accordingly
depending upon edge cases.Make sure to insert each incoming matrix's element into output array.Usual upwards
traversal includes column++ and row--,but, we need to handle edge cases where column shouldnt exceed bounds and
when row=0. Similarly, for downwards traversal,usual route is row++ and column--, but,check edge cases where
row is about to exceed boundary and when column is 0.
 */
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;

        boolean direction = true; //upwards
        int[] traversedArray = new int[rowLen * colLen];
        int r = 0 , c = 0;

        for(int i = 0 ; i < rowLen * colLen ; i++) {
            traversedArray[i] = mat[r][c];
            if(direction) {
                if(c == colLen - 1) {
                    r++;
                    direction = false;
                } else if(r == 0) {
                    c++;
                    direction = false;
                }
                else {
                    r--;
                    c++;
                }

            }
            else { //downwards
                if(r == rowLen - 1) {
                    c++;
                    direction = true;
                } else if(c == 0) {
                    r++;
                    direction = true;
                }
                else {
                    r++;
                    c--;
                }
            }
        }
        return traversedArray;
    }
}