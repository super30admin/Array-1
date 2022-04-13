class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return result;
        }
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(top <= bottom && left <= right){
            //top row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //right column
            if(top<= bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
            }
            right--;
            //bottom row
            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //left column
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}

// Time Complexity : O(m * n)
// Space Complexity : O(m * n)