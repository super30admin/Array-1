// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //null check
        if(mat == null || mat.length == 0)
            return new int[]{};

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r=0, c=0, dir=1;
        int idx = 0;

        while(idx<result.length){ //check if we covered all the elements
            result[idx] = mat[r][c];
            idx++;

            //up direction
            if(dir == 1){
                if(c == n-1){
                    r++;
                    dir = -1;
                }
                else if(r == 0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }

            //down direction
            else{
                if(r == m-1){
                    c++;
                    dir = 1;
                }
                else if(c == 0){
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