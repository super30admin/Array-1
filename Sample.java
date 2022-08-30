//Product of Array except itself

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];
        if(nums == null || n == 0) return result;
        
        result[0] = 1;
        int rep =1;
        
        // First having array where it consists of all the values with the product of the elements left to it.
        for(int i=1; i<n;i++)
        {
            result[i] = result[i-1] * nums[i-1];
        }
        
        //Here we create a repeating product of the right side elements and multiplying with the result array of left side elements.
        for(int i=n-2; i>=0;i--)
        {
            rep = rep*nums[i+1];
            result[i] = result[i]*rep;
        }
        return result;
    }
}


//Diagonal Traverse

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat ==null || mat.length == 0) return new int[] {};
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        int dir = 1;
        int idx = 0;
        
        while(idx < result.length)
        {
            result[idx] = mat[r][c];
            idx++;
            
            //up
            if(dir == 1){
                
                if(c == n-1){ //we need to add this condition first so that we do not go out of bound
                    r++;
                    dir =-1;
                }
                else if(r == 0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
                
            }//down
            else{
                
                if(r == m-1){ //we need to add this condition first so that we do not go out of bound
                    c++;
                    dir = 1;
                }
                
                else if(c==0){
                    r++;
                    dir=1;
                }
                
                else{
                    r++;
                    c--;
                }
                
            }
        }
        return result;
    }
}


// Spiral Martix

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//1) First maintain 4 variables and take the output in another array list
//2) traverse incrementing and decrementing those variables as they determine the direction.
//3) Maintain if else loop for all the directions as it may reconsider the element agin.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left =0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        
        List<Integer> result = new ArrayList<>();
        
        while(top<= bottom && left <= right){
            
            //top row
            for(int j=left ; j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            if(left <= right){
            //right wall
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            }
            right--;
            
            if(top<= bottom){
            //bottom wall
            for(int j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
            }
            }
            bottom--;
            
            if(left <= right){
            //left wall
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            }
            left++;
        }
        return result;
    }
}