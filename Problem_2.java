// Time Complexity : O(nxm)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//Keeping direction variable, whenever direction is up and the traverse reaches the top row-0 or right col-n-1, reverse the direction
//whenever direction is down and the traverse reaches the down row-n-1 or left col-0, reverse the direction
//for moving up using row-- and col++
//for moving down row++ and col--

// Your code here along with comments explaining your approach

//498. Diagonal Traverse
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return null;
        
        int n = mat.length;
        int m = mat[0].length;
        
        int[] d = new int[n * m];
        
        int dir = 1;
        int i = 0, j = 0;
        int k = 0;
        
        while(k < n * m){
            d[k] = mat[i][j];
            k++;
            if(dir == 1){
                if(j == m - 1){
                    dir = -1;
                    i++;
                }
                else if(i == 0){
                    dir = -1;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else if(dir == -1){
                if(i == n - 1){
                    dir = 1;
                    j++;
                }
                else if(j == 0){
                    dir = 1; 
                    i++;
                }
                else{
                    j--;
                    i++;
                }
            }
        }
        return d;
    }
}