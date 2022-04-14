// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : We either travel up or down
// So we maintain a variable direction and then based on that we can calculate the element and change the direction based on conditions

public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[] {};
        }
        
        int m = mat.length;
        int n = mat[0].length;
        int r = 0, c = 0;
        boolean isGoingUp = true;
        int[] result = new int[m * n];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = mat[r][c];
            
            if(isGoingUp) {
                
                if(c == n - 1) {
                    r++;
                    isGoingUp = false;
                } else if(r == 0) {
                    c++;
                    isGoingUp = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r == m - 1) {
                    c++;
                    isGoingUp = true;
                } else if(c == 0) {
                    r++;
                    isGoingUp = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        
        return result;
    }
}
