//time complexity-O(mxn)
//space complexity-O(1)
//passed all test cases on leetcode
//the approach here is to traverse the matrix using the 4 pointers left,top,right,bottom.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> al = new ArrayList<>();
        int left = 0, top = 0, right = n - 1, bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                al.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                al.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++;
            }
        }
        return al;
    }
}
