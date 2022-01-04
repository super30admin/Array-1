// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
//we need to move left and right based on the problem statement as we need to find the product of the elements in the array be excluding nums[i]
//we have constraint that we need to get O(1) SC to achieve that multiplied the result array which had values from left pass with right pass values by keeping in the for loop while caluclating right pass
//instead of using 2for loops we can find the left prodcut and right product
// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int rProduct =1;
        result[0] = 1;
        //result[nums.length-1] = 1;
        for(int i =1;i<nums.length;i++){
            rProduct *= nums[i-1];
            result[i] = rProduct;
        }
        rProduct =1;
        for(int i =nums.length-2;i>=0;i--){
            rProduct *= nums[i+1];
            result[i] = rProduct*result[i];
        }
        return result;
        
    }
}
// Time Complexity :m*n
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
      int m = mat.length;
        int n = mat[0].length;
        int [] result = new int [m*n];
        int k = 0;
        int dir =1;
        //starting from (0,0)
        int i =0; int j = 0;
        while(k<m*n){
            result[k] = mat[i][j];
            k++;
                if(dir == 1){
                    if(j==n -1){
                        i++;
                        dir = -1;
                    }else if(i ==0){
                        j++;
                        dir = -1;
                    }else{
                        i--;j++;
                    }
                }else{
                    if(i==m -1){
                        j++;
                        dir = 1;
                    }else if(j ==0){
                        i++;
                        dir = 1;
                    }else{
                        j--;i++;
                    }
                }
        }
        return result;
    }
}

// Time Complexity :m*n
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top=0; int bottom = m-1;
        int left = 0;int right = n-1;
        while(top <= bottom &&left <= right){
            //top move
            if(top <= bottom &&left <= right){
                for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            }
        
            //right
            if(top <= bottom &&left <= right){
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            }
            //bottom
            if(top <= bottom &&left <= right){
            for(int i = right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            //leftmove
            if(top <= bottom &&left <= right){
            for(int i = bottom;i>=top;i--){
                result.add(matrix[i][left]); 
            }
            left++;
            }
            
        }
        return result;
    }
}