class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return new ArrayList();
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0; int column = -1;
        int top = 0; int left = 0;
        int bottom = m-1; int right = n-1;
        List<Integer> result = new ArrayList<Integer>();
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                column++;
                result.add(matrix[row][column]);
            }
            top++;
            
            if(top > bottom) break;
            for(int i = top; i <= bottom; i++){
                row++;
                result.add(matrix[row][column]);
            }
            right--;
            
            if(right < left) break;
            for(int i = right; i >= left; i--){
                column--;
                result.add(matrix[row][column]);
            }
            bottom--;
            
            if(bottom < top) break;
            for(int i = bottom; i >= top; i--){
                row--;
                result.add(matrix[row][column]);
            }
            left++;
        }
        
        return result;
    }
}
