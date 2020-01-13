// S30 Big N Problem #27 {Medium}
// 54. Spiral Matrix
// Time Complexity :O(m*n)
// Space Complexity :No extra space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
//Four pointers at each corner
//Then traversing four sides
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        //edge case
        if(matrix==null || matrix.length==0) return result;
        
        //logic
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=n-1,top=0,bottom=m-1;
        
        while(left<=right && top<=bottom){//terminate if any one goes beyond
            //top row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            //right column
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom){
            //bottom row
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
            //left row
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
            
        }
        return result;
    }
}