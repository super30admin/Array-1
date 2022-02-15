class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        
        int m =matrix.length, n=matrix[0].length;
        
        int firstRow =0,lastRow=m-1;
        int firstCol=0,lastCol=n-1;
        
        while(firstRow<=lastRow && firstCol <= lastCol){
            //result length or some index comparision
            //right
            for (int j = firstCol; j<=lastCol; ++j){
                result.add(matrix[firstRow][j]);
            }
            ++firstRow;
            
            //down
            for (int i=firstRow; i<=lastRow; ++i){
                result.add(matrix[i][lastCol]);
            }
            --lastCol;
            
            if(firstRow <= lastRow){
            //left
            for ( int j = lastCol; j>=firstCol;--j){
                result.add(matrix[lastRow][j]);
            }
            --lastRow;
            }
            //up
            if(firstCol <= lastCol){
            for (int i=lastRow; i>=firstRow; --i){
                result.add(matrix[i][firstCol]);
            }
            ++firstCol;
        }
        }
        return result;
        
    }
}