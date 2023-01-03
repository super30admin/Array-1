// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We keep track of top,bottom,left and right pointers
// At each iteration we go through the edges, print elements and update the pointers accordingly
// We also need to do boundary and base condition checks

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<Integer>();
        int top=0, bottom=n-1, right=m-1, left=0;

        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            if(left<=right){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
            right--;
            }
            if(top<=bottom) {
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            bottom--;
            }
            if(left<=right) {
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            left++;
            }
        }
        return result;
    }
}