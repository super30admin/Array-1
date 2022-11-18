// Time Complexity : O(nxm)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//maintaining four variables top = 0, bottom = m - 1, left = 0, right = n - 1
//loop1: move from left to right and top++ after traverse
//loop2: move from top to bottom and right-- after traverse
//loop3: move from right to left and bottom-- after traverse
//loop4: move from bottom to top and right++ after traverse

// Your code here along with comments explaining your approach

//54. Spiral Matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int j = top; j <= bottom; j++){
                arr.add(matrix[j][right]);
            }
            right--;
            if(top <= bottom){
                for(int k = right; k >= left; k--){
                    arr.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if(left <= right){
                for(int l = bottom; l >= top; l--){
                    arr.add(matrix[l][left]);
                }
                left++;
            }
        }
        return arr;
    }
}