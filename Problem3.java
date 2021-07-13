// Time Complexity :O(M*N) Where M is length of row and N is length of column
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

//TC:O(M*N)(where M is length of row and N is length of column)
//SC:O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output=new ArrayList<>();
        if(matrix==null||matrix.length==0) return output;
        int r=matrix.length-1,c=matrix[0].length-1,left=0,right=c,top=0,bottom=r;
        while(top<=bottom&&left<=right){
            //left to right
            for(int i=left;i<=right;i++){
                output.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i=top;i<=bottom;i++){
                output.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    output.add(matrix[i][left]);
                }
                left++;
            }

        }
        return output;
    }
}