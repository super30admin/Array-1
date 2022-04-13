// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
Here, we need to find the four extreme points that is the top bottom right and left. once we iterater through a particular row and column we increment the counter(i.e. top/bottom/left/right) so that we don't traverse through the elements again. Also, we wll take care when top crosses bottom and when left corsses right, throughout the traversal.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0)
            return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = m-1;
        while(top<=bottom && left<=right){
            for(int j =left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            if(left<=right){
                for(int i = top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(top<=bottom){
                for(int j = right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}