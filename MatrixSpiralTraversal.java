// Time Complexity O(m*n)
// Space Complexity O(1), no auxilary space used, just the result array modified

// Approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;
        while(left<=right && top<=bottom){
            for(int j = left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            if((left<=right && top<=bottom)){
                for(int i = top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;    
            }
            if(left<=right && top<=bottom){
                for(int j = right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;                
            }
            if(left<=right && top<=bottom){
                for(int i = bottom; i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;                
            }
        }
        return result;
    }
}