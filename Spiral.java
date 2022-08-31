//TC: O(n) where n is the number of elements in the matrix
//SC: O(n)
//Program ran on leetcode successfully.
class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
  
        if (matrix == null || matrix.length == 0)
            return res;
  
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        boolean[][] traversedElements = new boolean[numRows][numCols];
        int[] rowDir = { 0, 1, 0, -1 };
        int[] colDir = { 1, 0, -1, 0 };
        int i = 0;
        int j = 0;
        int dirIx = 0;
  
        for (int k = 0; k < numRows * numCols; k++) {
            
            res.add(matrix[i][j]);
            traversedElements[i][j] = true;
            
            int tempR = i + rowDir[dirIx];
            int tempC = j + colDir[dirIx];
            
            if (tempR >= 0 && tempR < numRows && tempC >= 0 && tempC < numCols && !traversedElements[tempR][tempC]){
                i = tempR;
                j = tempC;
            } else {
                dirIx = (dirIx + 1) % 4;
                i += rowDir[dirIx];
                j += colDir[dirIx];
            }
        }
        return res;
        
    }
}
