// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// used four pointers top,left,right and bottom pointers and manipulated them to get the elements in spiral fashion and added it to the list and returned the list

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length==0 || matrix[0].length==0){
            return new ArrayList<>();
        }
        
        List<Integer> outputlist = new ArrayList<>();
        
        int top=0, left=0;
        int right=matrix[0].length-1,  bottom=matrix.length-1;
        
        while(left<=right && top<=bottom){
            
            for(int i=left;i<=right;i++){
                outputlist.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                outputlist.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                   outputlist.add(matrix[bottom][i]);
               } 
            bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                outputlist.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        return outputlist;
    }
}