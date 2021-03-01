class SpiralMatrix {

    // Time Complexity: O(nm)
    // Space Complexity: O(1)

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return result;
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int totalSize = matrix.length * matrix[0].length;
        
        while(result.size() < totalSize){
            for(int i = left; i <= right && result.size() < totalSize; i++)
                result.add(matrix[top][i]);
            top++;
            
            for(int i = top; i <= bottom && result.size() < totalSize; i++)
                result.add(matrix[i][right]);
            right--;
            
            for(int i = right; i >= left && result.size() < totalSize; i--)
                result.add(matrix[bottom][i]);
            bottom--;
            
            for(int i = bottom; i >= top && result.size() < totalSize; i--)
                result.add(matrix[i][left]);
            left++;
        }
        
        return result;
    }
}