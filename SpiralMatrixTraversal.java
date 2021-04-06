// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class SpiralMatrixTraversal {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top =0,bottom=matrix.length-1,right=matrix[0].length-1, left=0;
        List<Integer> ans = new ArrayList();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++) ans.add(matrix[top][i]);
            top++;
            for(int i=top;i<=bottom;i++) ans.add(matrix[i][right]);
            right--;
            
            if(top<=bottom) for(int i=right;i>=left;i--) ans.add(matrix[bottom][i]);
            bottom--;
            if(left<=right) for(int i=bottom;i>=top;i--) ans.add(matrix[i][left]);
            left++;
            
        }
        return ans;
    }
}