/**
 * TC: O(m*n) SC: O(1);
 * Approach: Simulate the traversal in the matrix, while handling the turn with the help of the direction pointers TBLR(top,bottom,left,right)
 *           Add each to result list.
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            for(int i = right;top <= bottom &&  i >= left; i--){
                res.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom;left <= right && i >= top; i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}