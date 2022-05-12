import java.util.*;

/**
 * https://leetcode.com/problems/spiral-matrix
 * 
 * while loop breach example
 * time: O(n)
 * space: O(1)
 * Did this code successfully run on Leetcode : No due to the while loop breach
 * Three line explanation of solution in plain english:
 * 1. Have boundaries top, bottom, left, right
 * 2. keep shrinking each of the boundaries as we go over the elements
 * 3. Ensure that the while loop condition is not breached
 */
class Problem28WhileLoopBreach {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        
        while(left <= right && top <= bottom){
            
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);                
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            for(int j = right; j >= left; j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;
            
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        
        return result;
    }
}

/**
 * while loop base case not breached added if conditions to every for loop
 * time: O(n)
 * space: O(1)
 * Did this code successfully run on Leetcode : Yes
 */
class Problem28Solved1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        
        while(left <= right && top <= bottom){
            
            if(left <= right && top <= bottom){
                for(int j = left; j <= right; j++){
                    result.add(matrix[top][j]);                
                }
                top++;
            }
            
            if(left <= right && top <= bottom){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            if(left <= right && top <= bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;                
            }

            if(left <= right && top <= bottom){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;                
            }

        }
        
        return result;
    }
}

/**
 * while loop base case not breached
 * time: O(n)
 * space: O(1)
 * Did this code successfully run on Leetcode : Yes
 * 
 * 
 */
class Problem28Solved2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        
        while(left <= right && top <= bottom){
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);                
            }
            top++;

        
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;                
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;                
            }

        }
        
        return result;
    }
}


