import java.util.*;
//Problem1
// Time Complexity :
// Space Complexity :

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
    }
    
    int[] output = new int[nums.length];
    
    int prodLeft = 1;
    int prodRight = 1;
    
    for(int i = 0; i < nums.length; i++){
        output[i] = prodLeft;

        //product on the left side of each element
        prodLeft = prodLeft * nums[i];
    }
    
    for(int i = nums.length-1; i >= 0; i--){

        //multiply the product from left side to the right side 
        output[i] = output[i] * prodRight;

         //product on the right side of each element
        prodRight = prodRight * nums[i];
    }
    
    return output;
}
}



//Problem2
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution2 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] output = new int[n*m];
        
        int index =0; 
        int i=0; int j=0;
        int dir = 1; // 1=> upward; -1=>downward
        
        while(index < n*m){
            output[index] = matrix[i][j];
            index += 1;
            
            if(dir == 1){

                //when we are at the last coloumn, move to next row and change direction 
                if(j == m-1){
                    dir = -1;
                    i += 1;
                }

                //when we are in the first row, move to next coloumn and change direction 
                else if(i == 0){
                    dir = -1;
                    j += 1;
                }
                
                //everywhere else move diagonally up
                else{
                    i -= 1;
                    j += 1;
                }
            }

            //exact opposite of to when direction was 1
            
            else{
                if(i == n-1){
                    dir = 1;
                    j += 1;
                }
                else if(j == 0){
                    dir = 1;
                    i += 1;
                }
                else{
                    i += 1 ;
                    j -= 1;
                }
            }
        }
        return output;
    }
}



//Problem3
// Time Complexity :O(m*n)
// Space Complexity :0(1)

class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null){
            return new ArrayList<>();
        }
        List<Integer> output = new ArrayList<>();
        int n = matrix.length; int m = matrix[0].length;
        
        //calculate the 4 edges
        int top = 0; int bottom = n - 1;
        int left = 0;; int right = m - 1;
            
        while(top <= bottom && left <= right){
            
            //from the top most row go from left to right
            for(int i = left; i <= right ; i++){
                output.add(matrix[top][i]);
            }
            
            //top row moves 1 row down
            top++;
            
            // in right most coloumn go from top to bottom
            for(int i = top; i <= bottom ; i++){
                output.add(matrix[i][right]);
            }
            
            //right column moves 1 coloumn to left
            right--;
            
            //check if top & bottom does not crossover and left & right does not crossover
            if(top <= bottom && left <= right){
                
                //from the bottom most row go from right to left
                for(int i = right; i >= left ; i--){
                    output.add(matrix[bottom][i]);
                }
                
                //bottom row moves 1 row up
                bottom--;
                
                //from the left most coloumn go from bottom to up
                for(int i = bottom; i >= top ; i--){
                    output.add(matrix[i][left]);
                }
                
                //left column moves 1 coloumn to the right
                left++;
            }
        }
        return output;
    }
}