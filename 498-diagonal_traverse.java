//Overall Time Complexity: O(m*n)
//Overall Space Complexity: O(m*n)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[]{};
        
        // dir = 1 -> travel up
        // dir = -1 -> travel down
        
        int m = mat.length;
        int n = mat[0].length;
        
        int dir = 1;
        
        int r = 0, c = 0;
        int[] res = new int[m * n];
        int indx = 0; //Using this we will store in the resultant array
        
        // The ordering of the if conditions matters and the current mentioned ordering working, if we use the other way round then we would go into out of bounds error
        while(indx < m*n){
            
            res[indx] = mat[r][c];
            indx++;
            
            if(dir == 1){
                
                if(c == n - 1){
                    r++;
                    dir = -1;
                }else if(r == 0){
                    c++;
                    dir = -1;
                }else{
                    r--;
                    c++;
                }
                
            }else{
                if(r == m - 1){
                    c++;
                    dir = 1;
                }else if(c == 0){
                    r++;
                    dir = 1;
                }else{
                    r++;
                    c--;
                
                }
            }
        
        }
        return res;
    }
}