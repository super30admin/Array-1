// Time Complexity :
o(r*c) where r= rows and c=columns
// Space Complexity :
O(1) since we are not using any data structure to store the data
// Did this code successfully run on Leetcode :
YES
// Three line explanation of solution in plain english


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        if(matrix.length==0) return result;
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
                }
            top++;
            
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
         //this condition is to check if there is only one row   
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }
        //this condition is to check if there is only one column    
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            
        }
    }
    return result;  
}
    
}