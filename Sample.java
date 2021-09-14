// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// o(n) time and o(1) space

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] result = new int[n];
        if (nums == null || nums.length==0) return result;
        int rp = 1;
        result[0] =1;
        for (int i = 1; i < n; i++){
            rp *= nums[i-1];
            result[i] = rp;
        }
        rp =1;
        for (int i = n-2; i >= 0; i--){
            rp *= nums[i+1];
            result[i] = rp * result[i];
        }
        return result;
    }
}

//o(m*n) time and constant space
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        if(mat == null || mat.length ==0) return new int[0];
        int i = 0;
        int dir = 1;
        int r= 0; int c = 0;
        while(i<m*n){
            result[i] = mat[r][c];
            i++;
            //upper direction
            if(dir ==1){
                if(c == n-1){
                    dir = -1;
                    r++;
                }
                else if(r == 0){
                    c++;
                    dir=-1;
                }
                else{
                    c++; r--;
                }
            } else{

                if(r == m-1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    r++;
                    dir = 1;
                }
                else{
                    r++; c--;
                }
            }

        }
        return result;

    }
}

// 0(n) time and constant space

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;

        while(top <= bottom && left <= right){
            // top
            for(int j = left; j<= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            if(top <= bottom && left <= right){

                // right col
                for(int j = top; j<= bottom; j++){
                    result.add(matrix[j][right]);
                }
                right--;

            }
            if(top <= bottom && left <= right){

                // bottom

                for(int j = right; j>= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }


            if(top <= bottom && left <= right){

                // left
                for(int j = bottom; j>= top; j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }
        return result;

    }
}