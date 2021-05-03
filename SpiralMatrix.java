class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        if(matrix == null || matrix.length == 0) return list;
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0; 
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        while(top <= bottom && left <= right){
            //top 
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            
            //right
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){
                    list.add(matrix[i][right]);
                }
            }
            right--;
            
            //bottom
            if(top <= bottom && left <= right){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            
            //left
            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}
