// Time Complexity :
//=>  O(m*n)
// Space Complexity :
//=>  O(1)
// Did this code successfully run on Leetcode :
//=>  yes
// Three line explanation of solution in plain english
//=>  We assigned 4 variables top, bottom, left, right to matrix and traveled across the matrix to give required output.
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int m = matrix.length; 
        int n = matrix[0].length;
        
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        
        while(top <= bottom && left <= right){
            //traversing left to right
            for(int i = left; i <= right ; i++){
                result.add(matrix[top][i]);
            }
            top ++;
            //traversing top to bottom
            for(int i = top; i <= bottom ; i++){
                result.add(matrix[i][right]);

            }
            right--;
            //traversing right to left
            if(top <= bottom && left <= right) {
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
            }
            }
            bottom --;
            
            //traversing bottom to top
            if(top <= bottom && left <= right) {
                for(int i = bottom; i >=top; i--){
                    result.add(matrix[i][left]);
            }
            }
            left ++;



        }
        return result;



        
    }
}