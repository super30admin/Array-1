// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//using 4 pointer left and right, top and bottom. Squazing each pointer in the pattern of spiral

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0; 
        int bottom = m-1;
        int left = 0; 
        int right = n-1;
        while(top <= bottom && left<=right){
        for(int j=left;j<=right;j++){
            res.add(matrix[top][j]);
        }
        top++;
        for(int j=top;j<=bottom;j++){
            res.add(matrix[j][right]);
        }
        right--;
        if(top<=bottom){
        for(int j=right;j>=left;j--){
            res.add(matrix[bottom][j]);
        }
        bottom--;
        }
        if(left<=right){
        for(int j=bottom;j>=top;j--){
            res.add(matrix[j][left]);
        }
        left++;
        }
        }
        return res;
    }
}