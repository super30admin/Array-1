    /*
     *  Time Complexity: O(N*M) Where N is the number of rows and M is the number of columns
     *  Space Complexity: O(1) Since we are using only additional space to return the values. We do not consider that to the space complexity.
     * 
     *  Did this code successfully run on Leetcode : Yes
     *  Any problem you faced while coding this : None
     *  Explanation: We can maintain 4 pointer each on 4 corner of the matrix. Now we iterate in each direction, Once we visit all the values in that row or colums we reduce the pointer that indiactes that row or column. We repeat that untill one of the 4 pointers crosses the other. 
     */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new ArrayList<>();
        int top=0, left=0, right=matrix[0].length-1, bottom=matrix.length-1, dir=1;
        List<Integer> result = new ArrayList<>();
        while(left<=right && top<=bottom){
            if(dir==1){
                for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
                }
                top++;
                dir=2;
            }else if(dir==2){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;
                dir=3;
            }else if(dir==3){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                dir=4;
            }else{
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
                dir=1;
            }
        }
        return result;
    }
}
