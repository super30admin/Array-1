
//Time Complexity: O(MN)
//Space Complexity: O(1)




class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] nums = new int[rows * columns];
        
        int currentRow = 0;
        int currentColumn = 0;
        boolean dir = true;
        
        
        for(int i = 0; i < nums.length; i++)
        {
            if(dir) // moving up
            {
                nums[i] = matrix[currentRow--][currentColumn++];
                
                if(!(currentRow >= 0 && currentColumn <= columns - 1))
                {
                    currentRow++;
                    currentColumn--;
                    
                    if(currentColumn < columns - 1) currentColumn++;
                    else currentRow++;
                    
                    dir = false;
                }     
            }
            else // moving down
            {
                nums[i] = matrix[currentRow++][currentColumn--];
                
                if(!(currentRow <= rows - 1 && currentColumn >= 0))
                {
                    currentRow--;
                    currentColumn++;
                    if(currentRow < rows - 1) currentRow++;
                    else currentColumn++;
                     dir = true;
                }       
            }
        }
        return nums;
    }
}
