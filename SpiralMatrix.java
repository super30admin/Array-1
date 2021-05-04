/*
Description: Here the boundaries of the matrix are updated every time an iteration is completed on
Time Complexity: O(n) because we traverse on each element of the matrix exactly once.
Space Complexity: O(1) as we do not use any auxillary data spaces other than primitive variables.
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0; int bottom=matrix.length-1;
        int left = 0; int right = matrix[0].length-1;
        ArrayList<Integer> results = new ArrayList<Integer>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                results.add(matrix[top][i]);//left to right
            }
            top++;
            for(int i=top;i<=bottom;i++){
                results.add(matrix[i][right]);//top to bottom
            }
            right--;
            if(top<=bottom && left<=right){
            for(int i=right;i>=left;i--){
                results.add(matrix[bottom][i]);//right to left
            }
                }
            bottom--;
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                   results.add(matrix[i][left]);
                }
            }
            left++;
        }
        return results;
    }
}
