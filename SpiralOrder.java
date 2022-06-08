// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        
        int minRow = 0;
        int maxRow = matrix.length-1;
            
        int minCol = 0;
        int maxCol = matrix[0].length-1;
        
        int i=0,j=0;
        while(minRow<=maxRow && minCol<=maxCol) {
            j = minCol;
            while(j<=maxCol) {
                result.add(matrix[minRow][j]);
                j++;
            }
            minRow++;
            
            if(minRow<=maxRow && minCol<=maxCol){
                i = minRow;
                while(i<=maxRow) {
                    result.add(matrix[i][maxCol]);
                    i++;
                }
                maxCol--;
            }
            
            if(minRow<=maxRow && minCol<=maxCol){
                j = maxCol;
                while(j>=minCol) {
                    result.add(matrix[maxRow][j]);
                    j--;
                }
                maxRow--;
            }
            
            if(minRow<=maxRow && minCol<=maxCol){
                i = maxRow;
                while(i>=minRow) {
                    result.add(matrix[i][minCol]);
                    i--;
                }
                minCol++;
            }
        }
        
        
        return result;
    }
}
