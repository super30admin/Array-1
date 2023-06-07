// Time Complexity : O(m*n) [m rows and n columns]
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length ==0 || matrix == null) return new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top=0, bottom = m-1, left =0, right = n-1;
        while(top<=bottom && left <=right){
            //top row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //right column
            for(int i = top;i<= bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //bottom row
            if(top<=bottom){
            for(int i = right; i>= left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            //left column
            if(left<=right){
              for(int i = bottom; i>= top;i--){
                result.add(matrix[i][left]);
            }
            left++;

        }
        }
        return result;
        
    }
}