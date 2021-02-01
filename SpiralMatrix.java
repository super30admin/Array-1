// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// travel along the borders in all directions and keep reducing the matrix scope while traversing


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<>();
        List<Integer> retList = new ArrayList<>();
        int m = matrix[0].length;
        int n = matrix.length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++)		//traversing top boundary
                retList.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bottom; i++)		//traversing right boundary
                retList.add(matrix[i][right]);
            right--;
            if (top <= bottom && left <= right) {
            for (int i = right; i >= left; i--)		//traversing bottom boundary
                    retList.add(matrix[bottom][i]);
                bottom--;
                for (int i = bottom; i >= top; i--)	//traversing lefts boundary
                    retList.add(matrix[i][left]);
                left++;
            }
        }
        return retList;
    }
}
