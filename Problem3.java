class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return result;
        int m = matrix.length, n = matrix[0].length;
        int top=0, bottom=m-1;
        int left=0, right=n-1;
        while(top <= bottom && left <= right){
            // top
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            // right
            for(int j=top; j<=bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;
            if(top <= bottom){
                // bottom
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if(left <= right){
                // left
                for(int j=bottom; j>=top; j--){
                    result.add(matrix[j][left]);
                }
            }
            left++;
        }
        return result;
    }
}
//time - O(m*n)
//space - O(1)