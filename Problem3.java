// We maintain four boundaries: top, bottom, left, and right.
// In each loop, we traverse the matrix in four directions: left→right, top→bottom, right→left, and bottom→top.
// After completing one spiral layer, we shrink the boundaries inward.
// We repeat this until all rows and columns are processed in spiral order.
//Time Complexity : O(m * n)
//Space Complexity : O(1)  // excluding result list
//Did this code successfully run on Leetcode : Yes
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;//no. of rows
        int n = matrix[0].length;//no.of columns
        int top = 0, bottom = m-1, left = 0, right = n-1;
        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
                    
    for (int i = top; i <= bottom; i++ ){
        result.add(matrix[i][right]);
    }
    right--;
if (top <= bottom){
    for(int i = right; i >= left; i--){
        result.add(matrix[bottom][i]);
    }
    bottom--;
}
if(left <= right){
for (int i = bottom; i >= top; i--){
    result.add(matrix[i][left]);

}
left++;
}
        }

return result;
}
}
