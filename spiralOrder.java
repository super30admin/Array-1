
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: The algorithm is traversing through the matrix in the following order:
// left to right - top to bottom - right to left - bottom to top and this contiues till the whole matrix is covered.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        
        List<Integer> list = new ArrayList<>();
       
        
        if(matrix == null || matrix.length==0) return list;
        
        int top = 0; int bottom = matrix.length-1;
        int left = 0; int right = matrix[0].length-1;
        
        while(top<=bottom && right>=left){
            //traverse from left to right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top ++;
            
            //traverse from top to down
            for(int i = top;i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right --;
            
            //traverse from right to left
            if(top <= bottom && left <= right){
                for(int i = right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
            }
            bottom --;
            //traverse from bottom to top
            if(left <= right){
                for(int i = bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
            }
            left ++;
            
        }
        
        return list;
    }
}