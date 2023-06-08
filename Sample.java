// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : YES
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post = 1;
        int res [] = new int [nums.length];
        for(int i = 0;i<nums.length;i++){
            res[i] = pre;
            pre *=  nums[i];
        }
        for(int i = nums.length-1;i>=0;i--){
            res[i] *= post;
            post *= nums[i];
        }

        return res;

    }
}

// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : YES
// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res [] = new int [m*n];
        int idx = 0;
        int i = 0, j = 0;
        boolean dir = true;
        while(idx<res.length){
            res[idx] = mat[i][j];
            idx++;
            //up
            if(dir == true){
                if(i == 0 && j != n-1){
                    j++; dir = false;
                }   
                else if(j == n-1){
                    i++; dir = false;
                }   
                else{
                    i--; j++;
                }
            }else{
                //down
                if(j == 0 && i != m-1){
                    i++; dir = true;
                }   
                else if(i == m-1){
                    j++; dir = true;
                }   
                else{
                    i++; j--;
                }
            }
            
        }
        return res;
    }
}


// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : YES
// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int top = 0, left = 0, right = n-1, bottom = m-1;
        int idx = 0;
        while(idx<m*n){
            if(top <= bottom){
                for(int i = left; i<= right; i++){
                    res.add(matrix[top][i]);
                    idx++;
                }
            }
            top++;

            if(left <= right){
                for(int i = top; i<= bottom; i++){
                    res.add(matrix[i][right]);
                    idx++;
               }
            }
            right --;

            if(top <= bottom){
                for(int i = right; i>= left; i--){
                    res.add(matrix[bottom][i]);
                    idx++;
                }
            }
            bottom--;

            if(left <= right){
                for(int i = bottom; i>= top; i--){
                    res.add(matrix[i][left]);
                    idx++;
                }
            }
            left++;

        }
        return res;
    }
}