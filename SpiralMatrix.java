// Time Complexity : O(m*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//we take 4 pointers beginRow, endingRow, beginColumn, endingColumn and loop until we reach the boundaries.

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> resultList = new ArrayList<>();
        if (matrix.length ==0 || matrix == null || matrix[0].length ==0) return resultList;
        
        int beginRow = 0;
        int endingRow = matrix.length-1;
        int endingColumn = matrix[0].length -1;
        int beginColumn = 0;
        
        while (beginRow <= endingRow && beginColumn <=endingColumn) {
            for (int i=beginColumn;i<=endingColumn;i++) {
                resultList.add(matrix[beginRow][i]);
            }
            
            beginRow ++;
            
            for (int i=beginRow; i<=endingRow;i++) {
                resultList.add(matrix[i][endingColumn]);
            }
            
            endingColumn --;
             if (beginRow <= endingRow) {
                for (int i=endingColumn; i>=beginColumn;i--) {
                    resultList.add(matrix[endingRow][i]);
                } 
            }
            
            endingRow --;
            
            if (beginColumn <= endingColumn) {
                for (int i=endingRow;i>=beginRow;i--) {
                    resultList.add(matrix[i][beginColumn]);
                }    
            }
            
            beginColumn ++;
           
        }
        
        return resultList;
        
    
    }
}