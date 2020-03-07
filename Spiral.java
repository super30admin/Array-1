//O(1) SPACE, o(m*n) time
//passed all leetcode cases
//solved the approach discussed in class.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0) return result;
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right = n-1;
        int top =0;
        int bottom = m-1;
        while(left<=right &&top<=bottom){
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
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }

        return result;
    }
}