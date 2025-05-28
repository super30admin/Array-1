// Time Complexity = O(m*n)
//Space Complexity = O(m*n)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; // no. of rows
        int n = matrix[0].length; //nos. columns
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        List<Integer> result = new ArrayList<>();
        int k = 0;//iterate over result

        while(left <= right && top <= bottom){
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);

            }
            top++;
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
           
        }
        return result;

    }
}