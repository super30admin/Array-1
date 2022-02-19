// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length == 0 || nums==null) {
            return new int[0];
        }
        int result[] = new int[nums.length];
        result[0] = 1;
        int right = 1;
        
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1]* nums[i-1];
        }
        
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i]* right;
            right = right * nums[i];
        }
        return result;
    }
}

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        
        int m = mat.length;
        int n = mat[0].length;
        
        int row = 0;
        int column = 0;
        int index = 0;
        int[] result = new int[m*n];
        int direction = 1;
        
        while(row < m && column < n) {
            result[index] = mat[row][column];
            
            if(direction == 1) {
                if(column == n-1){
                    row++;
                    direction = -1;
                } else if(row == 0) {
                    column++;
                    direction = -1;
                } else {
                    row--;
                    column++;
                }
            } else {
                if(row == m-1) {
                    column++;
                    direction = 1;
                } else if(column == 0) {
                    row++;
                    direction = 1;
                } else {
                    column--;
                    row++;
                }
            }
            index++;
        }
        return result;
    }
}

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length==0) {
            return new ArrayList();
        }
        
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        
        List<Integer> result = new ArrayList();
        int top = 0;
        int bottom = m;
        int left = 0;
        int right = n;
        
        while(top <= bottom && left <=right) {
            
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
           
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
          
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
           
        }
        return result;
    }
}