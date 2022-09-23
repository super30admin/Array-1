public class problem3 {

// Time Complexity : O(m*n) -> m and n are number of elements in rows and coloumns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english :- 
// We are going left to right, top to bottom, right to left and bottom to up direction as per requirement. We also put some base cases to avoid  Arrays out of bound.

public List<Integer> spiralOrder(int[][] matrix) {
   
    if(matrix == null || matrix.length == 0) return new ArrayList<>();
    
    int m = matrix.length;
    int n = matrix[0].length;
    List<Integer> res = new ArrayList<>();
    int top = 0;
    int left = 0;
    int right = n - 1;
    int bottom = m - 1;
    
    while(top <= bottom && left <= right){
        //move from left to right
        for(int i=left; i<=right; i++){
            res.add(matrix[top][i]);
        }
        top++;
        
        //move from top to bottom
        for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
        
        //move from right to left
        if(top <= bottom){
        for(int i=right; i>=left; i--){
                res.add(matrix[bottom][i]);
            }
            bottom--;
        }
        //move from bottom to top
        if(left <= right){
        for(int i=bottom; i>=top; i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
    }
    return res;
}
}
