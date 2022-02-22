// Time Complexity : O(m*n);
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//the direction is always right, down, left,up and then we repeat this for the inner matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int m = matrix.length;
        int n= matrix[0].length;
        
        int firstRow=0, lastRow = m-1;
        int firstCol=0, lastCol = n-1;
        
        int totSize = m*n;
        
        while(firstRow<=lastRow && firstCol<=lastCol) {
            
            //Right
            for(int j=firstCol; j<=lastCol; j++) {
                result.add(matrix[firstRow][j]);
            }
            
            ++firstRow;
            
            //Down
            for(int j=firstRow; j<=lastRow; j++) {
                result.add(matrix[j][lastCol]);
            }
            
            --lastCol;
            
            if(!(firstRow > lastRow)) {
            //Left
                for(int j=lastCol; j>=firstCol; --j) {
                    result.add(matrix[lastRow][j]);
                }            

                --lastRow;
            }
            
            if(!(firstCol > lastCol)){
            //Up
                for(int j=lastRow; j>=firstRow; --j) {
                    result.add(matrix[j][firstCol]);
                }
                ++firstCol;
            }
            
        }
        
        return result;
    }
}