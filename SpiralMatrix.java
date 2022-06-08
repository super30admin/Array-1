import java.util.List;

import java.util.ArrayList;

//Time complexity:O(m*n)
//Space complexity: O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        
        //null
        if(matrix == null) return new ArrayList<>();
        
        int left = 0; int right = n-1;
        int top = 0; int bottom = m-1;
        
        //[1 2 3] left & top pointing to the first element [1]
        //[4 5 6]
        //[7 8 9]
        //right pointing to [3], bottom pointing to [7]
        
        //while making sure 
        while(left <= right && top <= bottom)
        {
            //top row 
            for(int j = left; j <= right; j++)
            {
                //adding [1 -> 2 -> 3] to result
                result.add(matrix[top][j]);
            }
            top++; //moving to the row below
            
            //right col
            //we check the while loop conditions again as the value of variables is changing
            if (left <= right && top <= bottom) 
            {
                for(int i = top; i <= bottom; i++)
                {
                    //adding [6 -> 9] to result
                    result.add(matrix[i][right]);
                }
            }
            right--; //moving the right pointer to thr left
            
            //bottom
            if (left <= right && top <= bottom) 
            {
                for(int j = right; j >= left; j--)
                {
                    //adding [8 -> 7] to result
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--; // moving the botton pointer up
            
            //left
            if (left <= right && top <= bottom) 
            {
                for(int i = bottom; i >= top; i--)
                {
                    //adding [4] to result
                    result.add(matrix[i][left]);
                }
            }
            left++; //moving the left pointer to the right
            
            //one more loop where we add [5] to the result
        }
        
        return result;       
    }
}