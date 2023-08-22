// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// I am using 4 pointers, one at each corner of the matrix, to traverse
// through each side of the matrix and add it to the List in the correct order.
// After each side is complete, that side's pointer will either increment or decrement
// which ensures we are not repeating any values.  
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; //rows
        int n = matrix[0].length; // columns
        List<Integer> res = new ArrayList<>();
        //4 pointers to keep track of all 4 corners
        int left = 0, right = n-1;
        int top = 0, bottom = m-1;
        while(top <= bottom && left <= right){
            //top -> left to right
            for(int j = left; j <= right; j++){
                res.add(matrix[top][j]);
            }
            top++;
            //right -> top to bottom
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            //bottom -> right to left
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    res.add(matrix[bottom][j]);
                }
            }
            bottom--;
            //left -> bottom to top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }
        return res;
    }
}