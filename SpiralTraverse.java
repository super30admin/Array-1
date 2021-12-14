// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

//Take 4 pointers and traverse through the matrix by manipulating the 4 pointers to print the desired pattern

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0 ,bottom = m-1;
        int left =0,right = n-1;
        while(top<=bottom && left<=right){
            for(int j = left;j <= right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            if(top<=bottom && left<=right){
                for(int i = top; i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
            }
            right--;
            if(top<=bottom && left<=right){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if(top<=bottom && left<=right){
                for(int i = bottom;i >= top; i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}