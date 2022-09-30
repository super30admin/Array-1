class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowBegin = 0;
        int colBegin = 0; 
        int rowEnd = matrix.length -1;
        int colEnd = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return result;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            
            for(int i = colBegin; i<=colEnd; i++){
                result.add(matrix[rowBegin][i]);
            }
            
            rowBegin++;
            
            for(int i = rowBegin; i<=rowEnd; i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i>=colBegin; i--){
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(colBegin <= colEnd){
                for(int i = rowEnd; i>=rowBegin; i--){
                    result.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
             
        }
        return result;
    }
}