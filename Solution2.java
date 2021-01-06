// Time Complexity :o(m*n)
// Space Complexity : o(m*n )
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length -1;
        int left = 0, right = matrix[0].length -1;
        List<Integer> result = new ArrayList<>();
        
        while((top<=bottom) && (left<=right)){
            //from left to right
            for(int i=left; i<=right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top; i<=bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom)
            {
                for(int i=right; i>=left; i--)
                {
                        result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            
            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}