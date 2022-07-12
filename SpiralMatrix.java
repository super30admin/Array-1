import java.util.LinkedList;
import java.util.List;

// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Consider four directions left, right, down and up. Traverse from left to right and once traversed succesfully, increment top level by 1
Similarly for all cases such as top to bottom, right to left and bottom to up and making sure increment/decrement by one level the corresponding position and direction
	*
	*/	
// Your code here along with comments explaining your approach

public class SpiralMatrix {
    
public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new LinkedList<>();
        
        
        if(matrix.length==0)
            return res;
            
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length -1;
        
        
        while(rowBegin<=rowEnd&&colBegin<=colEnd)
        {
            for(int i = colBegin; i <= colEnd; i++)
                res.add(matrix[rowBegin][i]);
                
            rowBegin++;
            
            for(int i = rowBegin; i<=rowEnd; i++)
                res.add(matrix[i][colEnd]);
                
            colEnd--;
            
            if(rowBegin<= rowEnd)
            {
                for(int i = colEnd;i>=colBegin;i--)
                res.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            
            if(colBegin<=colEnd)
            {
            for(int i = rowEnd; i >= rowBegin; i--)
                res.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
    
    return res;    
        
        
    }

}
