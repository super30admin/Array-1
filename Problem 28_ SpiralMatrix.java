// Time Complexity : O(n), n -> total number of elements of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new ArrayList<Integer>();
        
        List<Integer> result = new ArrayList<Integer>();
        spiralFill(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1, result);
        return result;
    }
    
    public void spiralFill(int[][] array, int startRow, int endRow, int startCol, int endCol, List<Integer> result) {
        if(startRow > endRow || startCol > endCol)
            return;
        
        for(int col = startCol; col <= endCol; col++)
            result.add(array[startRow][col]);
        
        for(int row = startRow + 1; row <= endRow; row++) 
            result.add(array[row][endCol]);
        
        for(int col = endCol - 1; col >= startCol; col--) {
            if(startRow == endRow)
                break;
            result.add(array[endRow][col]);
        }
        
        for(int row = endRow - 1; row > startRow; row--) {
            if(startCol == endCol)
                break;
            result.add(array[row][startCol]);
        }
        spiralFill(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
    }
}