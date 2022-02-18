/**

TC - O(m*n) where m is number of rows and n is number of cols.
SC - O(1)



**/
class Solution {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int start = 0;
        int endRow = rows - 1;
        int endCol = cols - 1;
        
        while (start <= endRow && start <= endCol)
        {
            for (int i=start; i<=endCol; i++)
            {
                result.add(matrix[start][i]);
            }
            
            for (int j=start + 1; j<=endRow; j++)
            {
                result.add(matrix[j][endCol]);
            }
            
            for(int k = endCol - 1; k>= start && endRow > start; k--)
            {
                result.add(matrix[endRow][k]);
            }
            
            for(int m=endRow-1; m>start && endCol > start; m--)
            {
                result.add(matrix[m][start]);
            }
            
            start++;
            endCol--;
            endRow--;
        }
        
        return result;
    }
}