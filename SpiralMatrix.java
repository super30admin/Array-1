// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Method used : Matrix traversal

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList();
        int rows = matrix.length, cols = matrix[0].length;
        int top, left, right, bottom;
        top = left = 0;
        right = cols - 1;
        bottom = rows - 1;

        int i;
        while(left <= right && top <= bottom)
        {
            for(i = left; i <= right; i++) result.add(matrix[top][i]);

            ++top;

            if(left <= right)
            {
                for(i = top; i <= bottom; i++) result.add(matrix[i][right]);

                --right;
            }

            if(top <= bottom)
            {
                for(i = right; i >= left; i--) result.add(matrix[bottom][i]);

                --bottom;
            }

            if(left <= right)
            {
                for(i = bottom; i >= top; i--) result.add(matrix[i][left]);

                ++left;
            }
        }

        return result;
        
    }
}