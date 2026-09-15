// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/**
 * Since we traversing in two direction i.e. up & down 
 * While going in up direction we will check the edge case of column getting out of bound.
 * While going in down direction we will check the edge case of row getting out of bound.
 */


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] res = new int[m*n];
        boolean dir = false; // false = up here
        int r = 0, c = 0;
        
        for (int i = 0; i < res.length; i++){
            res[i] = mat[r][c];
            if(!dir){// up
                if(r == 0 && c < n-1){ // ceiling
                    dir = true;
                    c++;
                }else if(c == n-1){ // right wall
                    dir = true;
                    r++;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(c == 0 && r < m-1){ // left wall
                    dir = false;
                    r++;
                }else if(r == m-1){ // bottom
                    dir = false;
                    c++;
                }else{
                    r++;
                    c--;
                }
            }
        }
        

        return res;
    }
}
