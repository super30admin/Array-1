// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left=0;
        int right = matrix[0].length-1;
        int bottom= matrix.length-1;
        int top=0;
        
        while(left<=right && top<=bottom){
            // covering top row
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            // covering right column
            if(left<=right){
                for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
                }
            }
            right--;
            // covering bottom row
            if(top<=bottom){
             for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //covering left column
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
                }
            }
            left++;
        }
      return ans;  
    }
}