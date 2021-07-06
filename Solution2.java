// Time Complexity : O(M*N), where M*N is the size of the matrix.
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/submissions/detail/517992045/

import java.util.*;

public class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length; 
                
        List<Integer> output = new ArrayList<Integer>(); 
        
        int lowi = 0, highi = m-1, lowj = 0, highj = n-1;
        while (lowi <= highi && lowj <= highj) {
            //moving from left to right. 
            for (int j = lowj; j <= highj; j++) {
                output.add(matrix[lowi][j]);
            }
            // increasing the low pointer for rows. 
            lowi++;
            if (lowi > highi)
               break;
            
            // moving from top to bottom
            for (int i = lowi; i <= highi; i++) {
                output.add(matrix[i][highj]);
            }
            // decreasing the high pointer for columns
            highj--; 
            if (lowj > highj)
                break;
            
            // moving from right to left
            for (int j = highj; j >= lowj; j--) {
                output.add(matrix[highi][j]);
            }
            //  decreasing the high pointer for rows
            highi--;
            if (lowi > highi)
                break; 

            // moving from bottom to top
            for (int i = highi; i >= lowi; i--) {
                output.add(matrix[i][lowj]);
            }
            // increasing the low pointer for columns
            lowj++;
            if (lowj > highj)
                break; 
        }
        
        return output;
    }
}