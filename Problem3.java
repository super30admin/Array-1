class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, right = n-1;
        int bottom = m-1, left=0;

        while(top<=bottom && left<=right){
            // top wall
            if(top<=bottom && left<=right){
                for(int i = left; i<= right; i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            // right wall
            if(top<=bottom && left<=right){
                for(int j = top; j<=bottom; j++){
                    result.add(matrix[j][right]);
                }
                right--;
            }
            // bottom wall
            if(top<=bottom && left<=right){
                for(int k = right; k>=left; k--){
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }

            //left wall
            if(top<=bottom && left<=right){
                for(int l=bottom; l>=top; l--){
                    result.add(matrix[l][left]);
                }
                left++;
            }

        }
        return result;
    }
}