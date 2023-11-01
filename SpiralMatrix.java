// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// 1. Shift the top, left, bottom, right pointers by 1 each time you iterate that row or col

// Your code here along with comments explaining your approach

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int right = n - 1;
        int left = 0;

        List <Integer> result = new ArrayList<>();
        int idx = 0;
        while(idx < m*n){
             if(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
                
                idx++;
            }}
            top++;
             if(left<=right && top<=bottom){
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
               
                idx++;

            }}
            right--;
             if(left<=right && top<=bottom){
            for(int j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
                
                idx++;
            }}
            bottom--;
            if(left<=right && top<=bottom){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
                
                idx++;
            }}
            left++;
        }
        return result;
    }
}