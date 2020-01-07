// Time Complexity : O(MxN)
// Space Complexity : O(MxN)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if(matrix.length == 0 || matrix == null){		// base case
            return result;
        }
        
        
        int left = 0;			// we need 4 pointers to traverse in spiral order left, right, top and bottom
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int dir = 0;
        while(top <= bottom && left <= right){
            if(dir == 0){   // moving from left to right
                for(int i = left; i <= right; i++)
                    result.add(matrix[top][i]);
                top++;
                //dir = 1;
            }
            
            if(dir == 1){	// moving from top to bottom
                for(int i = top; i <= bottom; i++)
                    result.add(matrix[i][right]);
                right--;
                //dir = 2;
            }
            
            if(dir == 2){	// moving from right to left
                for(int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
                //dir = 3;
            }
            
            if(dir == 3){	// moving from bottom to up
                for(int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
                //dir = 0;
            }
            dir = (dir + 1)%4;			// hard coding the result may result in errors, therefore we know there are 4 possible directions and taking mod will give the same
        }
        return result;		// result the list
    }
}