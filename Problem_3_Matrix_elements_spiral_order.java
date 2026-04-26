class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0 ; int bottom = m-1; int right = n-1; int left = 0;
        List<Integer> l = new ArrayList<>();
        while(left <= right && top <= bottom) {
            if(left <= right && top <= bottom) {
                for(int j = left; j <= right; j++) {
                    l.add(matrix[top][j]);
                }
            }
            top++;
            if(left <= right && top <= bottom) {
                for(int i = top; i <= bottom; i++) {
                    l.add(matrix[i][right]);
                }
            }
            right--;
            if(left <= right && top <= bottom) {
                for(int j = right; j >= left; j--) {
                    l.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if(left <= right && top <= bottom) {
                for(int i = bottom; i >= top; i--) {
                    l.add(matrix[i][left]);
                }
            }
            left++;
        }
        return l;
    }
}