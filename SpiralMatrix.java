package array1;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	//Time Complexity : O(m*n), where m is the number of rows and n is the number of columns
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Inner if loops
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = m - 1;
        int colEnd = n - 1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            for(int i=colBegin; i<=colEnd; i++)
                res.add(matrix[rowBegin][i]);
            rowBegin++;
            
            for(int i=rowBegin; i<=rowEnd; i++)
                res.add(matrix[i][colEnd]);
            colEnd--;
            
            if(rowBegin <= rowEnd) {
                for(int i=colEnd; i>=colBegin; i--)
                    res.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            
             if(colBegin <= colEnd) {
                for(int i=rowEnd; i>=rowBegin; i--)
                    res.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        
        return res;
    }
}
