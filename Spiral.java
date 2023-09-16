class Spiral {
    List<Integer> list;
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        list = new ArrayList<>();
        int top = 0, bottom = m-1, left = 0, right = n-1;
        dfs(matrix, top, bottom, left, right);
        
        return list;
        
    }
    private void dfs(int[][] matrix, int top, int bottom, int left, int right){
            
            if(top>bottom || left>right) return;
            for(int j=left; j<=right; j++){
                list.add(matrix[top][j]);
            }
            top++;
            for(int i = top; i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int j = right; j>=left; j--){
                list.add(matrix[bottom][j]);
            }
            
            bottom--;
            }
            if(left<=right){
            for(int i = bottom; i>=top; i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        dfs(matrix, top, bottom, left, right);
    }
}