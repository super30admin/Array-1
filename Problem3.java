// Time Complexity : O(m*n) where m = number of rows, n = number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;
public class Problem3 {
    
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int firstrow = 0, firstcol = 0, lastrow = rows-1, lastcol = cols - 1;
        List<Integer> res = new ArrayList<>();
        while (firstrow <= lastrow && firstcol <= lastcol) {
            // move right
            for (int j = firstcol; j <= lastcol; j++) {
                res.add(matrix[firstrow][j]);
            }
            firstrow++; 
            
            // move down
            for (int i = firstrow; i <= lastrow; i++) {
                res.add(matrix[i][lastcol]);
            }
            lastcol--; 
            
            // move left
            if (firstrow <= lastrow) {
                for (int j = lastcol; j >= firstcol; j--) {
                    res.add(matrix[lastrow][j]);
                }
                lastrow--; 
            }
            
            
            // move up
            if (firstcol <= lastcol) {
                for (int i = lastrow; i >= firstrow; i--) {
                    res.add(matrix[i][firstcol]);
                }
                firstcol++; 
            }      
                
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = spiralOrder(mat);
        System.out.println(ans);
    }
}
