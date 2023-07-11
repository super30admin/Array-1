class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        if(matrix == null || m == 0)
            return new ArrayList<>();
        int n = matrix[0].length;
        
        int row = 0, col = 0, rowEnd = m-1, colEnd = n-1;
        List<Integer> res = new ArrayList<>();
        
        while(row <= rowEnd && col <= colEnd) {
            for(int c = col; c <= colEnd; c++) {
                res.add(matrix[row][c]);
            }
            row++;
            
            for(int r = row; r <= rowEnd; r++) {
                res.add(matrix[r][colEnd]);
            }
            colEnd--;
            
            if(row <= rowEnd){
                for(int c = colEnd; c >= col; c--) {
                res.add(matrix[rowEnd][c]);
                }
                rowEnd--;
            }
            
            if(col <= colEnd){
                for(int r = rowEnd; r >= row; r--) {
                res.add(matrix[r][col]);
                }
                col++;
            }
        }
        
        return res;
            
        
    }
}