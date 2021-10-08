//Time Complexity:O(m*n)
//Space Complexity:O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        List<Integer> output = new ArrayList<>();
        while(left <= right && top <= bottom)
        {
            for(int i = left; i <= right; i++)
            {
                output.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                output.add(matrix[i][right]);
            }
            right--;

            if(left <= right && top <= bottom)
            {
                for(int i = right; i >= left; i--)
                {
                    output.add(matrix[bottom][i]);
                }
                bottom--;
                for(int i = bottom; i >= top; i--)
                {
                    output.add(matrix[i][left]);
                }
                left++;
            }
        }return output;
    }
}