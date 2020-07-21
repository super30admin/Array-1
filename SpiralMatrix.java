// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes.
// Three line explanation of solution in plain english

Initially we are moving the kepping the row same and changing the column. Once we reach the end we move onto increasing the rows.
then we move from columnEnd to beginning column. then again we move towards the beginning row.
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;
        
        while(rowBegin <= rowEnd && columnBegin <= columnEnd)
        {
            for(int i=columnBegin; i <=columnEnd; i++)
            {
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin; i<=rowEnd; i++)
            {
                result.add(matrix[i][columnEnd]);
            }
            columnEnd--;
             if(rowBegin<=rowEnd){
            for(int i=columnEnd; i>=columnBegin; i--)
            {
                result.add(matrix[rowEnd][i]);
            }
             }
            rowEnd--;
            if(columnBegin<=columnEnd)
            {
                for(int i=rowEnd; i>=rowBegin; i--)
                {
                    result.add(matrix[i][columnBegin]);
                }
                columnBegin++;
            }
        }
        return result;
    }
}