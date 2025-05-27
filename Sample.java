// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 I'm using running sum (prefix sum) approach for each element to compute left product and right produt and for the lement
 the product except itself is left_product*right_product
 */
// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp = 1;
        int [] result = new int[n];
        result[0] = 1;
        for(int i = 1;i < n;i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for(int i = n-2;i >= 0;i--){
            rp = rp * nums[i+1];
            result[i] = rp * result[i];
        }
        return result;
    }
}

// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 I'm taking a flag to determine top or down and alternating after reaching end and handling edge cases
 */
// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int size = m * n;
        int [] arr = new int [size];
        int idx = 0;
        int i = 0, j = 0;
        boolean flag = true;
        for(idx = 0;idx < size;idx++){
            arr[idx] = mat[i][j];           
            if(flag){
                if(j == n-1){
                    flag = false;
                    i++;
                }
                else if(i == 0){
                     
                    flag = false;
                    j++;
                }
                else{    
                               
                    i--;
                    j++;
                }
            }
            else{
                if(i == m-1){
                    
                    flag = true;
                    j++;
                }
                else if(j == 0){
                    
                    flag = true;
                    i++;
                }
                else{
                 
                    i++;
                    j--;
                }
                
            }
        }
        return arr;
    }
}


// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 I took 4 variables and using them in generic for all the spiral matrices and making sure they dont go out of bounds
 Print the spirals by changing the top,left,right and bottom flags
 */
// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n-1 , bottom = m-1 , top = 0;
        while(left <= right && top <= bottom){

            // left to right

            for(int i = left;i <= right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            //top to bottom

            if(left <= right && top <= bottom){
                for(int i = top;i <= bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }

            // right to left

            if(left <= right && top <= bottom){              
                for(int i = right;i >= left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to top

            if(left <= right && top <= bottom){          
                for(int i = bottom;i >= top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }
        return res;
    }
}