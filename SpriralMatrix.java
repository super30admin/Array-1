//time - O(mn) - print every element so visit every element once
//space - constant
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return new ArrayList();
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while(top <= bottom && left <= right)
        {
            //top row from left to right
            for(int i = left; i <= right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            
            //right column from top to bottom
            for(int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            //there is a possiblity that top has already crossed bottom
            if(top <= bottom)
            {
                //bottom row right to left
                for(int i = right; i>= left; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //there is a possiblity that left has already crossed righh
            if(left <= right)
            {   
                //left column from bottom to top
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
