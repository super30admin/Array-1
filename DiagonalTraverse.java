// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Use directions and look for edge conditions

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat == null || mat.length == 0)
            return new int[]{};
        
        int m = mat.length;
        int n = mat[0].length;
        
        int[] res = new int[m*n];
        
        int i=0;
        int r=0;
        int c=0;
        int dir = 1;
        
        while(i < m*n){
            
            res[i] = mat[r][c];
            
//           going up
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
//          going down
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
                    c--;
                    r++;
                }
            }
                   
            i++;
        }
        return res;
    }
}

