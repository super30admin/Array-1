// Time Complexity : o(m*n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :  yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// https://leetcode.com/problems/diagonal-traverse/submissions/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(null == mat || mat[0].length == 0) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m*n];
        int i = 0;
        int j = 0;
        int dir = 1; //1 means up direction and -1 means down
        int idx = 0;
        while(idx < m*n){
            result[idx] = mat[i][j];
            idx++;
            if(dir == 1){
                //up
                if(i==0 && j!=n-1){
                    j++;
                    dir = -1;
                } else if(j==n-1){
                    i++;
                    dir = -1;
                } else{
                    i--;
                    j++;
                }
            } else{
                //down
                if(j==0 && i!=m-1){
                    i++;
                    dir = 1;
                } else if(i==m-1){
                    j++;
                    dir = 1;
                } else{
                    j--;
                    i++;
                }
            }
        }
        return result;  
    }
}


// Time Complexity : o(m*n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :  yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/spiral-matrix/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(null == matrix || matrix[0].length == 0) return new ArrayList<Integer>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m - 1;
        
        while(top <= bottom && left <= right){
            //right
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            //down
            if(left <= right){
                for(int i=top; i<= bottom; i++){
                    result.add(matrix[i][right]);
                }   
            }
            right--;
            
            //left
            if(top <= bottom) {
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }    
            }
            bottom--;
            
            //up
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }    
            }
            left++;
        }
        return result;
    }
}

// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :  yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/product-of-array-except-self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(null == nums || nums.length == 0) return nums;
        int runningProduct = 1;
        int n = nums.length;
        int[] result = new int[n];
        result[0] = runningProduct;
        
        for(int i=1; i<n; i++){
            runningProduct = runningProduct * nums[i-1];
            result[i] = runningProduct;
        }
        runningProduct = 1;
        
        for(int i=n-2; i>=0; i--){
            runningProduct = runningProduct * nums[i+1];
            result[i]  = result[i] * runningProduct;
        }
        
        return result;
    }
}
