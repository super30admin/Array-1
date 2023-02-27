public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        if(matrix==null || m<0) return result;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        
        while(top<=bottom && left<=right){
            // top wall
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            // right wall
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            // bottom wall
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            // left wall
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}

// TC - O(m*n)
// SC - O(1)