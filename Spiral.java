/**

Time Complexity : O(M*N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


**/
class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> output = new ArrayList<>();
        
        if (matrix == null || matrix.length ==0)
            return output;
        
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int size = rowCount * colCount;


        int rowStart =0;
        int colStart = 0;
        int rowEnd = rowCount -1;
        int colEnd = colCount -1;
        
        

        while(output.size() < size )
        {
            // traverse to right till colEnd & increment rowStart
            for(int i=colStart; i<=colEnd; i++)
            {
                output.add(matrix[rowStart][i]);
            }
            
            rowStart++;
    
    
    
            // traverse to down till rowEnd & decrement colEnd
            for(int i=rowStart; i<=rowEnd; i++)
            {
                output.add(matrix[i][colEnd]);
            }
            
            colEnd--;
    
            if( rowEnd >= rowStart)
            {
    
                // traverse to left till colStart decrement rowEnd
                for(int i=colEnd; i >= colStart; i--)
                {
                    output.add(matrix[rowEnd][i]);
                }  
                
               
            }
            
            rowEnd--;
        
            if(colEnd >= colStart)
            {
                // traverse to top till rowStart increment colStart 
                for(int i=rowEnd; i >= rowStart; i--)
                {
                    output.add(matrix[i][colStart]);
                }  
                            
            }

                colStart++;
        }
    
        return output;
        
        
    }
}