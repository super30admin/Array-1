// Time Complexity :
//=> O(m*n)
// Space Complexity :
//=> O(1)
// Did this code successfully run on Leetcode :
//yes
// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[]{};
        }
        int m = mat.length;
        int n = mat[0].length;
        int dir = 1;
        //1->bottom to top
        //-1-> top to bottom
        int[] result = new int[m*n];
        int index = 0;
        int r = 0, c = 0;
        while(index < m * n){
            result[index] = mat[r][c];
            index++;
            if(dir == 1) {
                if(c ==n-1) {
                    dir = -1;
                    r++;

                }
                else if(r==0) {
                    dir = -1;
                    c++;

                }
                else {
                    r--;
                    c++;
                }
            
            }
            else {
                if(r == m-1) {
                    dir = 1;
                    c++;
                }
                else if(c == 0) {
                    dir = 1;
                    r++;
                }
                else {
                    r++;
                    c--;
                }
                
            }
        }
        return result;

    }
}