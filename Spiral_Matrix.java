// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        
        int top = 0;
        int left = 0 ;
        int right = c-1;
        int bottom = r - 1;
        
        while (left<= right && top <= bottom)
        {
            for(int i = left ; i <= right ;i++)
            {
                result.add(matrix[left][i]);
            }
            top++;
            if(left<= right && top <= bottom)
            {
            for(int j = top; j <= bottom ;j++)
            {
                result.add(matrix[j][right]);
            }
            right--;
            }
            if(left<= right && top <= bottom){
            for(int j = right ;j>=left ; j--)
            {
                result.add(matrix[bottom][j]);
            }
            bottom--;
            }
            if(left<= right && top <= bottom){
            for(int i = bottom; i >= top; i--)
            {
                result.add(matrix[i][left]);
            }
                 left++;
            }    
            
        }
        return result;
        
    }
}
