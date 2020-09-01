// Time Complexity : O(n*m)
// Space Complexity : O(1) , no extra space other than the returning array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Beacuse we need to move spirally, we will just take 4 pointers corresponding to our 4 boundaries at each point
//when we move in the top row, we move from left to right, increment top as we traversed whole row and in the right column from
//top to bottom, increment right after traversal and so on for other pointers too
//we will come across edge cases where middle element will be displayed twice, so we shall include condition (top<=bottom) and (left<=right) for last 2 
//return the list

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return new ArrayList<>();
        int n=matrix.length; int m=matrix[0].length;
        List<Integer> res=new ArrayList<>();
        
        int top=0,bottom=n-1,left=0,right=m-1;
        
        while( top<=bottom && left<=right){
            
            //top row
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
              top++;
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
               right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                res.add(matrix[bottom][i]);
            }
               bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                res.add(matrix[i][left]);
            }
              left++;
            }
        }
        return res;
    }
}