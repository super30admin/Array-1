// Time Complexity : O(M*N) where M = no. of rows and N is number cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<Integer>();

        List<Integer> out = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++) {
                out.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++){
                out.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left; i--){
                    out.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    out.add(matrix[i][left]);
                }
                left++;
            }
        }

        return out;

    }
}