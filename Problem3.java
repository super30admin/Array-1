
// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We are using four pointers to keep track of the boundaries of the spiral traversal
// We start from the top-left corner and move in the right direction until we reach the boundary
// Then we switch the direction and move downward until we reach the boundary again
// We continue this process until we have traversed all elements in the matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left=0,bottom=matrix.length-1,right=matrix[0].length-1;
        List<Integer> al=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                al.add(matrix[top][i]);
            }
            top++;  //in next pass we should not consider this row element
             for(int i=top;i<=bottom;i++){
                al.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){    //since the base conditions are changing we check again the boundary conditions
                for(int i=right;i>=left;i--){
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    al.add(matrix[i][left]);
                }
                left++;
            }
        }
        return al;
    }
}