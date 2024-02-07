//TimeComplexity: O(m*n)
//Space Complexity:O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while(left <= right && top <= bottom) {
            for(int j = left; j<=right;j++) {
                answer.add(matrix[top][j]);
            }
            top++;
            for(int j = top ; j <= bottom;j++) {
                answer.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
            for(int j = right ; j>= left; j--) {
                answer.add(matrix[bottom][j]);
            }
            bottom--;
            }
            if(left<=right){
            for(int j = bottom; j>=top; j--) {
                answer.add(matrix[j][left]);
            }
            left++;
            }
        }
        return answer;
    }
}