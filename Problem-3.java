// Time Complexity : O(M*N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int top=0;
        int bottom = matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        
        while(top<=bottom && left<=right){
            
            for(int j=left;j<=right;j++){
                list.add(matrix[top][j]);
            }
            top++;
            
            if(left<=right){
                for(int i=top;i<=bottom;i++){
                    list.add(matrix[i][right]);
                }
                right--; 
            }
            
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        
        return list;
    }
}
